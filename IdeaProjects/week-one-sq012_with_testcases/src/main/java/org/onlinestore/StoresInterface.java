package org.onlinestore;

public interface StoresInterface {

    void hire(String name,String role, Integer age);

    void fire(String name);
    void receivePayment();
    void generateReceipt();

}
