package com.mycompany.ifdemo;
import java.util.Scanner;

public class Ifdemo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your age: ");
        
        int userAge = input.nextInt();
        if (userAge < 0 || userAge > 100)
        {
            System.out.println("Invalid Age");
            System.out.println("Age must be between 0 and 100");
        }
        else if (userAge < 18)
            System.out.println("Sorry your are underage");
        else if (userAge < 21)
            System.out.println("Your need parental consent");
        else
        {
            System.out.println("Congratulations!");
            System.out.println("You may sign up for the event");
        }
    }
}