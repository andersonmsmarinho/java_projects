package com.mycompany.errordemo;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Errordemo{
    public static void main(String[] args)
    {
        /*
        int num, deno;
        
        Scanner input = new Scanner(System.in);
        
        try
        {
            System.out.println("Please enter the numerator: ");
            num = input.nextInt();
            
            System.out.println("Please enter the denominator: ");
            deno = input.nextInt();
            
            System.out.println("The result is " + num/deno);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("---- End of Error Handling Example ---");
        }
        */
        
        int choice;
        
        Scanner input = new Scanner(System.in);
        
        int[] numbers = {10, 11, 12, 13, 14, 15};
        System.out.print("Please enter the index of the array: ");
        
        try
        {
            choice = input.nextInt();
            
            //Força a retornar erro, mesmo o índice existindo
            if (choice == 0)
               throw new
            ArrayIndexOutOfBoundsException();
            
            System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Index is invalid.");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: You did not enter an integer.");
        }
        catch (Exception e)
        {
            System.out.printf(e.getMessage());
        }
    }
}