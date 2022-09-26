package org.onlinestore;

public class Customers {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Double wallet;


    public Customers(String firstName, String lastName, String address, String phoneNumber,Double wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.wallet = wallet; //Balance cash in the customer wallet
    }

    public void placeOder(Products product, Integer quantity, Double cash) {
        if(cash >= product.getProductPrice()*quantity){
            cash = cash - product.getProductPrice()* quantity;
            System.out.println("You have placed an oder for " + product.getProductName() + "\nYour balance is: " + cash +
                    "\nThe quantity ordered for is: " + quantity);
           } else {
            cash = product.getProductPrice()*quantity - cash;
            System.out.println("You don't have enough money to buy this product");
            System.out.println("you need additional cash of: $" + cash);
        }
    }
       // if(firstName==firstName && lastName==lastName)

//    public void makePayment(){
//        System.out.println("You have completed your payment, please have your receipt");
//    }

//Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWallet(Double wallet) {
        this.wallet += wallet;

    }
    //Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getWallet() {
        return wallet;
    }
}
