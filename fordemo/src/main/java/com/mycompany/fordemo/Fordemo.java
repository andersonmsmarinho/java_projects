package com.mycompany.fordemo;

public class Fordemo{
    public static void main(String[] args){
        
        /* for (int i = 0; i < 2; i++){
            System.out.println(i);
        }

        ------------
        
        int[] myNumber = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < myNumber.length; i++){
            System.out.println(myNumber[i]);
        }
        
        
        int[] myNumber = {10, 20, 30, 40, 50};
        
        for (int item : myNumber)
            System.out.println(item);*/
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
            if(i == 2)
                break;
        }
    }
}