package com.mycompany.hello.world;

import java.util.Arrays

public class HelloWorld{
    public static void main(String[] args){
        
        int[] userAge;
        userAge = new int[] {-5, 1, 0, 43, 6};
        
        int[] userAge2 = new int[] {21, 22, 23, 24, 25};
        
        int[] userAge3 = {21, 22, 23, 24, 25};
        
        int[] userAge4 = new int[5];
        
        System.out.println(Arrays.toString(userAge4));
    }
}