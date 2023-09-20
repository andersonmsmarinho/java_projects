package com.mycompany.switchdemo;
import java.util.Scanner;

public class SwitchDemo{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String userGrade = input.nextLine().toUpperCase();
        
        switch (userGrade)
        {
        
            case "A+":
            case "A":
            System.out.println("Distinction");
            System.out.println("Well Done!");
            break;
            
            case "B":
            System.out.println("B grade");
            break;
            
            case "C":
            System.out.println("C Grade");
            break;
            
            default:
                System.out.println("Fail");
        }
        
        /*
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int num = input.nextInt();

        char group = switch(num){
            case 1, 2, 3 -> 'A';
            case 4, 5 -> 'B';
            default -> 'c';
        };
        
        System.out.println(group);
            
        -----------------
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String userGrade = input.nextLine().toUpperCase();
        
        switch (userGrade)
        {
            case "A+", "A" -> {
                System.out.println("Distinction");
                System.out.println("Well Done!");
            }
            
            case "B" ->
            System.out.println("B grade");
            
            case "C" ->
            System.out.println("C Grade");
                
            default -> System.out.println("Fail");
        }*/
        
    }
}