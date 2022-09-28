package org.example;

public class Customers {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Double wallet;


    public Customers(String firstName, String lastName, String address, String phoneNumber, Double wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.wallet = wallet; //Balance cash in the customer wallet
    }

    public void placeOder(Products product, Integer quantity, Double cash) {

        //cash = wallet;
        if(cash >= product.getProductPrice()*quantity){
            cash = cash - product.getProductPrice()* quantity;
            System.out.println("YOU ODER HAVE BEEN RECEIVED, YOU ORDERED FOR " + product.getProductName() + "\nYOU AVAILABLE BALANCE IS: " + cash +
                    "\nQUANTITY ORDERED FOR: " + quantity);
        } else {
            cash = product.getProductPrice()*quantity - cash;
            System.out.println("YOU DON'T HAVE ENOUGH CASH TO BUY THIS ITEMS");
            System.out.println("YOU NEED ADDITIONAL BALANCE OF: $" + cash);
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
