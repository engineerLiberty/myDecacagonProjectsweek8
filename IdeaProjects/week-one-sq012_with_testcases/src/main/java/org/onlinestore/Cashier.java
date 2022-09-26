package org.onlinestore;

import java.util.Arrays;
import java.util.UUID;

public class Cashier extends Person {
    private Integer id;
    private String role;
    public Cashier(String firstName, String lastName, Integer age, String emailAddress, String mobileContact, Character gender, String role) {
        super(firstName, lastName, age, emailAddress, mobileContact, gender);

        this.role = role;

    }



    //Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //Getters

    public Integer getId() {
        return id;
    }

    public String getRole() {

        return role;
    }


//    public Main.Main.Cashier(Integer id, String name, Integer age, String role, String emailAddress, Integer mobileContact, String department) {
//        super(id, name, age, role, emailAddress, mobileContact, department);
//    }


    //Generating a random alphanumeric string
       private static String randomUUID() {

            UUID randomUUID = UUID.randomUUID();

            return randomUUID.toString().replaceAll("-", "");
        }

    public void generateReceipt(String customerName, Double totalCostOfProduct, String[] productsNames){


    //Applying a call back function

        String transactionId = randomUUID() ;

        System.out.println("A TRANSACTION RECEIPT.....................");
        System.out.println( "\n" + "CUSTOMER NAME:.......... " + customerName + "\nTRANSACTION........" + transactionId + "\nProduct name" + Arrays.toString(productsNames) + "\nTotal cost of products" + totalCostOfProduct);
    }
   public void receivePayment(Customers customer){

    }

    public void sellProducts(Products[] products, Customers customer){
        String[] productNames = new String[products.length];
        customer.getWallet();
        Double totalCostOfProduct = 0.00;
        Double walletBalance=0.00;
        for (int i =0; i<products.length;i++){
           totalCostOfProduct += products[i].getProductPrice();
           productNames[i] = products[i].getProductName();
        }
        if(customer.getWallet() >= totalCostOfProduct){
            walletBalance = customer.getWallet() - totalCostOfProduct;
            System.out.println("The total cost of products is: " + "$"+ totalCostOfProduct + "\nYour balance is: " +"$"+ walletBalance);
            generateReceipt(customer.getFirstName(),totalCostOfProduct,productNames);
        } else {
            walletBalance = totalCostOfProduct - customer.getWallet();
            System.out.println("Your have an insufficient balance of: $" +customer.getWallet() +"\nYou need to pay additional fee of: $" + walletBalance);
        }
        System.out.println("Thanks for your patronage.\nThanks for your patronage");

    }

}

