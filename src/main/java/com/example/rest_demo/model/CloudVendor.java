package com.example.rest_demo.model;

public class CloudVendor {

    private String vendorId;
    private String getVendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public CloudVendor(){

    }

    public CloudVendor(String vendorId, String getVendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.getVendorName = getVendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getGetVendorName() {
        return getVendorName;
    }

    public void setGetVendorName(String getVendorName) {
        this.getVendorName = getVendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }



}
