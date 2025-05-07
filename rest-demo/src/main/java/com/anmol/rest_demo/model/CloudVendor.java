package com.anmol.rest_demo.model;

public class CloudVendor {

    private String vendorId;
    private String vendorName;
    private String address;
    private String phone;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public CloudVendor(){

    }
    public CloudVendor(String vendorId, String vendorName, String address, String phone) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.address = address;
        this.phone = phone;
    }


}
