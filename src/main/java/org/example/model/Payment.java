package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Payment {
    private int paymentId;
    private double amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String date;
    private Customer customer;
    private BillingAddress billingAddress;

    // Constructors
    public Payment(int paymentId, double amount, String date, Customer customer, BillingAddress billingAddress) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.date = date;
        this.customer = customer;
        this.billingAddress = billingAddress;
    }

    public Payment() {
        // default constructor
    }

    // Getters and Setters

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", customer=" + customer +
                ", billingAddress=" + billingAddress +
                '}';
    }

}
