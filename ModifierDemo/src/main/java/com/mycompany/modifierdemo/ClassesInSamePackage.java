package com.mycompany.modifierdemo;

public class ClassesInSamePackage
{
    //Empty
}

class ClassA extends ModifierDemo
{
    public void printMessages()
    {
        //This is ok
        System.out.print(publicNum);
        
        System.out.println(protectedNum);
        
        System.out.println(packagePrivateNum);
        
        //This is NOT ok
        System.out.println(privateNum);
    }
}

class ClassB
{
    public void printMessages()
    {
        ModifierDemo p = new ModifierDemo();
        
        //This is ok
        System.out.println(p.publicNum);
        
        System.out.println(p.protectedNum);
        
        System.out.print(p.packagePrivateNum);
        
        //This is NOT ok
        System.out.println(p.privateNum);
    }
}