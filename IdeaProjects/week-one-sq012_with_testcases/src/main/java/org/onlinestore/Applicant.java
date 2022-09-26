package org.onlinestore;

public class Applicant extends Person {
    private String roleAppliedFor;
    private String qualification;

    public Applicant(String firstName, String lastName, Integer age, String emailAddress, String mobileContact, Character gender, String roleAppliedFor, String qualification) {
        super(firstName, lastName, age, emailAddress, mobileContact, gender);
        this.roleAppliedFor = roleAppliedFor;
        this.qualification = qualification;
    }

    //Setters
    public void setRoleAppliedFor(String roleAppliedFor) {
        this.roleAppliedFor = roleAppliedFor;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    //Getters

    public String getRoleAppliedFor() {
        return roleAppliedFor;
    }

    public String getQualification() {
        return qualification;
    }

//    void apply(String firstName, String lastName, Integer age, String emailAddress, String mobileContact, String roleAppliedFor, String qualification) {
//
//        System.out.println("You have successfully submitted your CV" + "\n" + "YOUR DETAILS ARE:");
//        System.out.println("First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + "\n" + "Email: " + emailAddress +"\n"+ "Mobile Contact: " +  mobileContact +"\n" + "Role Applied for: " + roleAppliedFor + "\n" + "Qualification: " + qualification);
//
  }

