package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order {
    private int orderId;
    private int accountId;
    private String stockSymbol;
    private String orderType;
    private int quantity;
    private double price;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
    private String orderDate;

    // Constructors
    public Order(int orderId, int accountId, String stockSymbol, String orderType, int quantity, double price, String orderDate) {
        this.orderId = orderId;
        this.accountId = accountId;
        this.stockSymbol = stockSymbol;
        this.orderType = orderType;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
    }

    public Order() {
        // default constructor
    }

    // Getters and Setters

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", accountId=" + accountId +
                ", stockSymbol='" + stockSymbol + '\'' +
                ", orderType='" + orderType + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }

}
