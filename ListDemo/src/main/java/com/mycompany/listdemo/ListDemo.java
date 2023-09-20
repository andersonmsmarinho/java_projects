package com.mycompany.listdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo{
    public static void main(String[] args){
        
        LinkedList<Integer> userAgeList = new LinkedList<>();
        
        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        userAgeList.add(2, 51);
        
        System.out.println(userAgeList.size());
        userAgeList.remove(3);
        System.out.println(userAgeList.contains(12));
        System.out.println(userAgeList.indexOf(12));
        System.out.println(userAgeList.get(2));
        
        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
        System.out.println(userAgeArray[0]);
        System.out.println(userAgeList);
    
    }
    
    public void methodOne(ArrayList<Integer> m)
    {
        //Some implementation code
    }
    
    public ArrayList<Integer> methodTwo(){
        ArrayList<Integer> a = new ArrayList<>();
        //Some implementation code
        return a;
    }
    
    MyClass mc = new MyClass();
    
    //Call method one
    ArrayList<Integer> b = new ArrayList();
    
    mc.methodOne(b);
    
    //Call method two
    
    ArrayList<Integer> c = mc.methodTwo();
}