package com.mycompany.anotherpackage;

import com.mycompany.modifierdemo.ModifierDemo;

public class ClassesInAnotherPackage {
    
}

class MyClassC extends ModifierDemo{
    public void printMessages()
    {
        
        //This is ok
        System.out.println(publicNum);
        
        System.out.println(protectedNum);
        
        //This is NOT ok
        System.out.println(packagePrivateNum);
        
        System.out.println(privateNum);
        
    }
}

class MyClassD{
    
    public void printMessages()
    {
        ModifierDemo p = new ModifierDemo();
        
        //This is ok
        System.out.println(p.publicNum);
        
        //This is NOT ok
        
        System.out.println(p.protectedNum);
        
        System.out.println(p.packagePrivateNum);
        
        System.out.println(p.privateNum);
    }
    
}