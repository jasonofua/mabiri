package com.example.root.mabiri.Models;

public class NearYouItems {
    String itemName;
    String nameOfShop;
    String priceOfItem;
    String distsnceFromYou;
    int image;

    public NearYouItems(String itemName, String nameOfShop, String priceOfItem, String distsnceFromYou, int image) {
        this.itemName = itemName;
        this.nameOfShop = nameOfShop;
        this.priceOfItem = priceOfItem;
        this.distsnceFromYou = distsnceFromYou;
        this.image = image;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public String getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(String priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public String getDistsnceFromYou() {
        return distsnceFromYou;
    }

    public void setDistsnceFromYou(String distsnceFromYou) {
        this.distsnceFromYou = distsnceFromYou;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
