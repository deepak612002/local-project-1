package com.example.demo.local.Factory;

public class Amazon implements ShopingSiteInterface{
    @Override
    public void siteName() {
        System.out.println("Amazon");
    }
}
