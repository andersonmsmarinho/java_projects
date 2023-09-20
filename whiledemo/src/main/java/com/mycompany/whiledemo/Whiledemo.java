package com.mycompany.whiledemo;

public class Whiledemo{
    public static void main(String[] args){
        int counter = 500;
        
        /*while(counter >= 0){
            System.out.println("Counter = " + counter);
            counter--;
        }*/
        
        do
        {
            System.out.println("Counter = " + counter);
            counter--;
        } while (counter > 0);
    }
}