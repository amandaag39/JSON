package org.example.utilities;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.model.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONUtils {

    private static final String JSON_FILE_PATH = "C:\\Users\\Owner\\OneDrive\\Documents\\GitHub\\JAXBProject\\src\\main\\resources\\json\\";

    // Serialization methods
    public static void createUsers() {
        List<User> userList = new ArrayList<>();

        userList.add(new User(1, "johnsmith", "johnnyboy123@example.com", "1989-01-01", "2023-06-12T12:32"));
        userList.add(new User(2, "arminarlert", "arminarmout@example.com", "2007-01-01", "2022-06-12T12:22"));

        writeJSONToFile("user.json", userList);
    }

    public static void createAccounts() {
        List<Account> accountList = new ArrayList<>();

        accountList.add(new Account(1, 1, "123456789", 1000.0, "2023-06-13T13:01"));
        accountList.add(new Account(2, 2, "987654321", 500.0, "2023-02-12T21:02"));

        writeJSONToFile("account.json", accountList);
    }

    public static void createTransactions() {
        List<Transaction> transactionList = new ArrayList<>();

        transactionList.add(new Transaction(1, 1, 1000.0, "2023-06-13T13:01", 1));
        transactionList.add(new Transaction(2, 1, 1000.0, "2023-06-13T13:01", 1));

        writeJSONToFile("transaction.json", transactionList);
    }

    public static void createOrders() {
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(1, 1, "AAPL", "Market", 10000, 180.95, "2023-06-13T13:01"));
        orderList.add(new Order(2, 2, "AAPL", "Market", 10000, 180.95, "2023-06-13T13:01"));

        writeJSONToFile("order.json", orderList);
    }

    public static void createPayments() {
        List<Payment> paymentList = new ArrayList<>();

        Customer customer1 = new Customer("John Doe", "johndoe@example.com");
        BillingAddress billingAddress1 = new BillingAddress("123 Main St", "New York", "NY", "12345");
        paymentList.add(new Payment(1, 100000.0, "2023-06-13", customer1, billingAddress1));

        Customer customer2 = new Customer("Jane Doe", "janedoe@example.com");
        BillingAddress billingAddress2 = new BillingAddress("123 Main St", "New York", "NY", "12345");
        paymentList.add(new Payment(2, 100000.0, "2023-06-10", customer2, billingAddress2));

        writeJSONToFile("payment.json", paymentList);
    }

    private static void writeJSONToFile(String fileName, List<?> objectList) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try (FileWriter fileWriter = new FileWriter(JSON_FILE_PATH + fileName)) {
            String jsonString = objectMapper.writeValueAsString(objectList);
            fileWriter.write(jsonString);
            System.out.println("JSON file created successfully: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization methods

    public static <T> List<T> readAndDeserializeJSON(String filePath, Class<T[]> objectType) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);
        return Arrays.asList(objectMapper.readValue(file, objectType));
    }

    public static void printDeserializedObjects(List<?> objectList) {
        for (Object object : objectList) {
            System.out.println(object);
        }
    }

}
