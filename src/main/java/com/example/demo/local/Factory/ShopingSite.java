package com.example.demo.local.Factory;

public class ShopingSite {
    public static void main(String[] args) {
        ShopingFactory sf = new ShopingFactory();
        ShopingSiteInterface ssi = sf.getSiteDetails("flipkart");
        ssi.siteName();
        ShopingSiteInterface ss = new Amazon();
        ss.siteName();
    }
}
