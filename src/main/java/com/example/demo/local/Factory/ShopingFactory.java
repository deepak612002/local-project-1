package com.example.demo.local.Factory;

public class ShopingFactory {


    public ShopingSiteInterface getSiteDetails(String str)
    {
        if(str.equals("amazon"))
            return new Amazon();
        else
            return new Flipkart();
    }
}
