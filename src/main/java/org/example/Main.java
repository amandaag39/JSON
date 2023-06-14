package org.example;

import org.example.model.*;

import java.io.IOException;

import java.util.List;

import static org.example.utilities.JSONUtils.*;

public class Main {
    public static void main(String[] args) {

        // Homework 17 - JSON

        // Serialize JSON FILES
        createUsers();

        createAccounts();

        createTransactions();

        createOrders();

        createPayments();

        // Deserializing with JSON


        // User class
        try {
            String userFilePath = "C:\\Users\\Owner\\OneDrive\\Documents\\GitHub\\JAXBProject\\src\\main\\resources\\json\\user.json";
            List<User> userList = readAndDeserializeJSON(userFilePath, User[].class);
            printDeserializedObjects(userList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Account class
        try {
            String accountFilePath = "C:\\Users\\Owner\\OneDrive\\Documents\\GitHub\\JAXBProject\\src\\main\\resources\\json\\account.json";
            List<Account> accountList = readAndDeserializeJSON(accountFilePath, Account[].class);
            printDeserializedObjects(accountList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Transaction class
        try {
            String transactionFilePath = "C:\\Users\\Owner\\OneDrive\\Documents\\GitHub\\JAXBProject\\src\\main\\resources\\json\\transaction.json";
            List<Transaction> transactionList = readAndDeserializeJSON(transactionFilePath, Transaction[].class);
            printDeserializedObjects(transactionList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Order class
        try {
            String orderFilePath = "C:\\Users\\Owner\\OneDrive\\Documents\\GitHub\\JAXBProject\\src\\main\\resources\\json\\order.json";
            List<Order> orderList = readAndDeserializeJSON(orderFilePath, Order[].class);
            printDeserializedObjects(orderList);
        } catch (IOException e) {
             e.printStackTrace();
        }

        // Payment class
        try {
            String paymentFilePath = "C:\\Users\\Owner\\OneDrive\\Documents\\GitHub\\JAXBProject\\src\\main\\resources\\json\\payment.json";
            List<Payment> paymentList = readAndDeserializeJSON(paymentFilePath, Payment[].class);
            printDeserializedObjects(paymentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}