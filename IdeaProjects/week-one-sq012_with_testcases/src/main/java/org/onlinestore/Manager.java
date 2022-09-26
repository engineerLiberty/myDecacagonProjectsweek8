package org.onlinestore;

public class Manager extends Person{
    public Manager(String firstName, String lastName, Integer age, String emailAddress, String mobileContact, Character gender) {
        super(firstName, lastName, age, emailAddress, mobileContact, gender);
    }


    //Main.Manager is to hire based on the applicant meeting up the requirement set as age and role applied for:

    public Cashier hire(Applicant applicant) {
        if(applicant.getRoleAppliedFor()=="Main.Main.Cashier" && applicant.getAge() <= 30){
            Cashier cashier = new Cashier(applicant.getFirstName(),applicant.getLastName(),applicant.getAge(),applicant.getEmailAddress(),
                    applicant.getMobileContact(),applicant.getGender(),applicant.getRoleAppliedFor());
          //String  Name = name.toLowerCase();
            System.out.println("Congratulations!" + "\n"+ cashier.getFirstName() +  " " + cashier.getLastName() + "\n" + "you have been hired as " + cashier.getRole());
            return cashier;
        } else {
            System.out.println("You did not meet the criteria.");
        }
        return null;
    }

    public void fire(Cashier cashier) {
       try {
           cashier.setFirstName(null);
           cashier.setLastName(null);
           cashier.setId(null);
           cashier.setRole(null);
           cashier.setGender(null);
           cashier.setMobileContact(null);
           cashier.setAge(null);
           cashier.setEmailAddress(null);

           System.out.println(cashier.getFirstName() + " Fired was not successful");
       }
       catch (NullPointerException e){
           System.out.println("fired successfully");
       }
    }
}
