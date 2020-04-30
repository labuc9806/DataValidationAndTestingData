/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavalidationandtestingdata;

import java.util.Scanner;

/**
 *
 * @author launa
 */
public class DataValidationAndTestingData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        System.out.println("Please enter a String that is more than six characters long : ");
        String str = keyedInput.nextLine();
        
        while (str.length() <= 6)
        {
         System.out.println("Please enter a String that is more than six characters long : ");
         str = keyedInput.nextLine();
        }
        
        System.out.println("Please enter a String that doesn't contain a lowercase a : ");
        String acase = keyedInput.nextLine();
        
        while (acase.contains("a"))
        {
        System.out.println("Please enter a String that doesn't contain a lowercase a : ");
        acase = keyedInput.nextLine();  
        }
        
        System.out.println("Please enter a String between 5-15 characters long :" );
        String fivetofifteen = keyedInput.nextLine();
        
        while (fivetofifteen.length() < 5)
        {
         System.out.println("Please enter a String between 5-15 characters long :" );
         fivetofifteen = keyedInput.nextLine();
        }
        while (fivetofifteen.length() > 15)
        {
         System.out.println("Please enter a String between 5-15 characters long :" );
         fivetofifteen = keyedInput.nextLine();
        }
        
        System.out.println("Please enter an integer between 5 and 500");
        int num1 = keyedInput.nextInt();
        
        while (num1 < 5)
        {
        System.out.println("Please enter an integer between 5 and 500");
        num1 = keyedInput.nextInt();
        }
        
        while (num1 >500)
        {
        System.out.println("Please enter an integer between 5 and 500 :");
        num1 = keyedInput.nextInt();
        }
        
        System.out.println("Please enter a negative integer : ");
        int num2 = keyedInput.nextInt();
        
        while (num2 >= 1)
        {
        System.out.println("Please enter a negative integer : ");
        num2 = keyedInput.nextInt();
        }
        
        System.out.println("Please enter a positive integer : ");
        int num3 = keyedInput.nextInt();
        while (num3 < 1)
        {
        System.out.println("Please enter a positive integer : ");
        num3 = keyedInput.nextInt();
        }
        
        System.out.println("Congratulations you passed all the stages!");
    }
    
}
