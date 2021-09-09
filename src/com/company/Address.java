package com.company;

public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getAddressDetails(){
        return getStreet()+" "+getCity()+" "+getState();
    }
    public void updateAddressDetails(String addressDetails){
        //to be written
        String[] address = addressDetails.split(",");
        this.street=address[0];
        this.city=address[1];
        this.state=address[2];
    }
}
