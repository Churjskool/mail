package emailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
   private String firstName;
    private String lastName;
    private String password;
    private  String department;
    private String email;
    private   int mailboxCapacity = 500;
    private int defualtPasswordLength = 10;
    private   String alternateEmail;
    private String companySuffix = "ubuea.cm";

    // constructor to receive the firstName and lastName
    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


        // call a method asking for the department and return department
        this.department = setDepartment();


        // call a method that returns a random password
        this.password = randomPassword(defualtPasswordLength);


        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;


    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("New Worker: "+ firstName+" Enter DEPARTMENT CODES\n1 for Computer\n2 for Electrical\n3 for Telecom\n0 for non\nEnter department: ");
        var scan = new Scanner(System.in);
        int deptChoice =scan.nextInt();
        if (deptChoice == 1){return "Computer";}
        else if (deptChoice == 2){return "Electrical";}
        else if (deptChoice == 3){return "Telecom"; }
        else return " ";

    }

    // Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
          int random =  (int) (Math.random() *passwordSet.length());   // i.e, random numbers within the passwordSet length
          password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate Email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    // GETTERS
    public int getMailboxCapacity(){return mailboxCapacity; }
    public String getAlternateEmail(){return alternateEmail; }
    public String getPassword(){return password;  }

    public String showInfo(){
        return "\nDISPLAY NAME: " +firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity  +"mb";
    }

}
