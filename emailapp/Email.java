package emailapp;

import java.util.Scanner;

public class Email
{
    private String firstname, password, lastname, department, email, alternateEmail, companySuffix = "byui.edu";
    private int mailboxCapacity = 500, defualtPasswordLength = 10;
    private char first;

    //Constructor to receive the first and last name
    public Email (String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.first = firstname.charAt(0);

        // Call a method asking for department ... return department
        this.department = setDepartment();
    
        //Call a method that returns a random password
        this.password = randomPassword(defualtPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine element to generate email
        email = first + lastname.toLowerCase() + "@" + department + "." + companySuffix; 
        
    }
    //Ask for the department
    private String setDepartment(){
        System.out.print("\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n4 for Information Technology\nEnter department code: ");
        Scanner in = new Scanner (System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2) { return "dev";}
        else if (depChoice == 3) { return "acct";}
        else if (depChoice == 4) { return "tech";}
        else { return "";}
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAternteEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword (String password){
        this.password = password;
    }

    public int getMailboxCapacity(){ return mailboxCapacity;}
    public String getAlternateEmail(){ return alternateEmail;}
    public String getPassword() { return password;}
    
    public String showInfo(){ 
        return "\nNew Employee: " + firstname + " " + lastname + 
        "\nCOMPANY EMAIL: " + email + 
        "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb\n";
    }
}
