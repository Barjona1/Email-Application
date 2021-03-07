package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Lastname: ");
        String lname = myObj.nextLine();      // Read user input

        System.out.println("\nEnter Firstname: ");
        String fname = myObj.nextLine();  

        Email em1 = new Email(lname, fname);
        System.out.println (em1.showInfo());
        
    }
    
}
