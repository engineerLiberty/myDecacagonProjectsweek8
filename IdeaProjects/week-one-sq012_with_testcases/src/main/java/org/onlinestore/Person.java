package org.onlinestore;

public abstract class Person {
     //Fields are made private to apply the concept of Encapsulation:
     private String firstName;
     private String lastName;
     private Integer age;
     private String emailAddress;
     private String mobileContact;
     private Character gender;

     public Person(String firstName, String lastName, Integer age, String emailAddress, String mobileContact, Character gender) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.emailAddress = emailAddress;
          this.mobileContact = mobileContact;
          this.gender = gender;
     }

     //Setters

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public void setAge(Integer age) {
          this.age = age;
     }

     public void setEmailAddress(String emailAddress) {
          this.emailAddress = emailAddress;
     }

     public void setMobileContact(String mobileContact) {
          this.mobileContact = mobileContact;
     }

     public void setGender(Character gender) {
          this.gender = gender;
     }

     //Getters

     public String getFirstName() {
          return firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public Integer getAge() {
          return age;
     }

     public String getEmailAddress() {
          return emailAddress;
     }

     public String getMobileContact() {
          return mobileContact;
     }

     public Character getGender() {
          return gender;
     }
}
