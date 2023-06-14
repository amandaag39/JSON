package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Account {
    private int accountId;
    private int id;
    private String accountNumber;
    private double balance;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
    private String dateCreated;

    // Constructor
    public Account (int accountId, int id, String accountNumber, double balance, String dateCreated) {
        this.accountId = accountId;
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    // Default constructor
    public Account () {
        // Default constructor
    }

    // Getters and setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account id=" + accountId +
                ", id='" + id + '\'' +
                ", account number='" + accountNumber + '\'' +
                ", balance='" + balance + '\'' +
                ", date created='" + dateCreated + '\'' +
                '}';
    }

}
