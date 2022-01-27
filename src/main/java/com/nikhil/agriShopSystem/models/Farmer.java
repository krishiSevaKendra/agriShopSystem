package com.nikhil.agriShopSystem.models;

public class Farmer {

    private String farmerName;
    private String fVillagename;
    private String fTehsilName;
    private String fContactNo;


    public Farmer() {
    }

    public Farmer(String farmerName, String fVillagename, String fTehsilName, String fContactNo) {
        this.farmerName = farmerName;
        this.fVillagename = fVillagename;
        this.fTehsilName = fTehsilName;
        this.fContactNo = fContactNo;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getfVillagename() {
        return fVillagename;
    }

    public void setfVillagename(String fVillagename) {
        this.fVillagename = fVillagename;
    }

    public String getfTehsilName() {
        return fTehsilName;
    }

    public void setfTehsilName(String fTehsilName) {
        this.fTehsilName = fTehsilName;
    }

    public String getfContactNo() {
        return fContactNo;
    }

    public void setfContactNo(String fContactNo) {
        this.fContactNo = fContactNo;
    }



}
