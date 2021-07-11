/* PropertyTester Class
Assignment No.-2
Author : Muhammad Anwar Ul Haq
Module: Software Development
Student id:L00162311
Date: 21/02/2021
* */

import java.util.Scanner;

public class PropertyTester
{
    public static void main(String[] args)
    {
        //Scanner class to take the user input
        Scanner keyboardIn = new Scanner(System.in);
        
        //declare the Variables
        String address;
        int noOfBeds, noOfBaths,noOfReceptions;
        double price;
        System.out.println("Enter the Property address");
        address = keyboardIn.nextLine();
        Property property1 = new Property(address);
        // Print the details of Property1 on the screen
        System.out.println(property1);
        // Take the user inputs for property
        System.out.println("Enter the Property address");
        address = keyboardIn.nextLine();
        System.out.println("Enter the number of beds");
        noOfBeds = keyboardIn.nextInt();
        System.out.println("Enter the number of baths");
        noOfBaths = keyboardIn.nextInt();
        System.out.println("Enter the number of receptions");
        noOfReceptions = keyboardIn.nextInt();
        System.out.println("Enter the Price of Property");
        price = keyboardIn.nextDouble();
        Property property2 = new Property(address,noOfBeds,noOfBaths,noOfReceptions,price);
        // Print the details of Property2 On screen
        System.out.println(property2);
        
        // Variables to calculate the mortag repayment  and mortgage eligibility
        int option , mortgageTerm;
        double salary;

        do
        {
            System.out.println("1. View All Property Details");
            System.out.println("2. View Property Address");
            System.out.println("3. View Number Bedrooms, Bathrooms, and Reception Rooms");
            System.out.println("4. Calculate Property Tax");
            System.out.println("5. Check for Mortgage Eligibility");
            System.out.println("6. Calculate Monthly Repayments");
            System.out.println("0. Exit");  
            System.out.println("Please enter your Option");
            option = keyboardIn.nextInt();

            switch(option)
            {
                case 1:
                    System.out.println(property2);
                    break;
                case 2:
                    System.out.println("The Address of the Property is: " + property2.viewAddress(address));
                    break;
                case 3:
                    System.out.println( "The Property has " + property2.viewBeds()+" Beds " + property2.viewBaths()+" Baths and " + property2.viewReceptions()+" Receptions");
                    break;
                case 4:
                    System.out.println("The Tax of the Property is €: " + property2.propertyTax());
                    break;
                case 5:
                    System.out.println("Enter your salary Per Year");
                    salary = keyboardIn.nextDouble();
                    System.out.println(property2.checkMortgage(salary));
                    break;
                case 6:
                    System.out.println("Enter the Mortgage term in Years");
                    mortgageTerm = keyboardIn.nextInt();
                    if( mortgageTerm > 25 )
                    {
                     System.out.println("You can not choose more than 25 years of mortgage term");
                    }
                    else
                    {
                    
                    System.out.println("Your Monthly mortgage repayment is €: " + property2.calcRepayment(mortgageTerm));
                    }
                    break;
                case 0:
                    System.out.println("Exit System");
                    break;

                default:
                    System.out.println("Invalid option chosen - please re-enter");

            }//end switch 
            
        }while(option !=0);


   }// end main method
}//end main class
