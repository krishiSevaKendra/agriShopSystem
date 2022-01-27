package com.nikhil.agriShopSystem.models;

import java.sql.Date;

public class Product {

    private String productName;
    private String pManufacturer;
    private Date pExpDate;
    private float pRate;
    private int pStockQuantity;

    public Product() {
    }

    public Product(String productName, String pManufacturer, Date pExpDate, float pRate, int pStockQuantity) {
        this.productName = productName;
        this.pManufacturer = pManufacturer;
        this.pExpDate = pExpDate;
        this.pRate = pRate;
        this.pStockQuantity = pStockQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getpManufacturer() {
        return pManufacturer;
    }

    public void setpManufacturer(String pManufacturer) {
        this.pManufacturer = pManufacturer;
    }

    public Date getpExpDate() {
        return pExpDate;
    }

    public void setpExpDate(Date pExpDate) {
        this.pExpDate = pExpDate;
    }

    public float getpRate() {
        return pRate;
    }

    public void setpRate(float pRate) {
        this.pRate = pRate;
    }

    public int getpStockQuantity() {
        return pStockQuantity;
    }

    public void setpStockQuantity(int pStockQuantity) {
        this.pStockQuantity = pStockQuantity;
    }
}
