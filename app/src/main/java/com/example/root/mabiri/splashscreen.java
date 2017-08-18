package com.example.root.mabiri;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.root.mabiri.Activities.Home;

public class splashscreen extends AppCompatActivity {

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }

    /**
     * Called when the activity is first created.
     */
    Thread splashTread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        StartAnimations();
    }
    private void StartAnimations() {

        // animation for the layout
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        RelativeLayout r = (RelativeLayout) findViewById(R.id.relativeLay);
        r.clearAnimation();
        r.startAnimation(anim);

        // animation for the element

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView tv = (ImageView) findViewById(R.id.mabiriLogo);
        tv.clearAnimation();
        tv.startAnimation(anim);

        //starting the thread

        splashTread = new Thread() {

            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 3500) {
                        sleep(200);
                        waited += 100;
                    }
                    Intent intent = new Intent(splashscreen.this,Home.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    splashscreen.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    splashscreen.this.finish();
                }

            }
        };
        splashTread.start();
    }
}
