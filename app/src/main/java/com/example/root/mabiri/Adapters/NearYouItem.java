package com.example.root.mabiri.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.root.mabiri.Models.NearYouItems;
import com.example.root.mabiri.R;

import java.util.ArrayList;


public class NearYouItem extends RecyclerView.Adapter<NearYouItem.MyViewHolder>{

    ArrayList<NearYouItems> nearYouItemsArrayList;
    Context context;

    public NearYouItem(ArrayList<NearYouItems> nearYouItemsArrayList, Context context) {
        this.nearYouItemsArrayList = nearYouItemsArrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_grid_layout, parent, false);
        return new NearYouItem.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
       NearYouItems nearYouItems = nearYouItemsArrayList.get(position);
        holder.itemImage.setImageResource(nearYouItems.getImage());
        holder.itemName.setText(nearYouItems.getItemName());
        holder.distanceFromYou.setText(nearYouItems.getDistsnceFromYou());
        holder.nameOfShop.setText(nearYouItems.getNameOfShop());
        holder.itemPrice.setText(nearYouItems.getPriceOfItem());

    }

    @Override
    public int getItemCount() {
        return nearYouItemsArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView itemName,itemPrice,nameOfShop,distanceFromYou;
        private ImageView itemImage;
        public MyViewHolder(View itemView) {
            super(itemView);
            itemName = (TextView)itemView.findViewById(R.id.tv_itemName);
            itemPrice = (TextView)itemView.findViewById(R.id.tv_itemPrice);
            nameOfShop = (TextView)itemView.findViewById(R.id.tv_nameOfStore);
            distanceFromYou = (TextView)itemView.findViewById(R.id.tv_distanceFromYou);
            itemImage = (ImageView)itemView.findViewById(R.id.img_itemImage);
        }
    }
}
