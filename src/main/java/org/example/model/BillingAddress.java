package org.example.model;

public class BillingAddress {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructors
    public BillingAddress(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public BillingAddress() {

    }

    // Getters and Setters

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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        return "BillingAddress{" +
                "street=" + street +
                ", city=" + city +
                ", state=" + state +
                ", zip code" + zipCode +
                '}';
    }
}
