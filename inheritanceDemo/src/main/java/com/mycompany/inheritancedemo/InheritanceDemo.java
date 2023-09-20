package com.mycompany.inheritancedemo;

import java.util.Scanner;

/**
 *
 * @author ander
 */
abstract class Member{
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;
    
    
    //Constructors
    public Member()
    {
        System.out.println("Parent Constructor with no parameter");
    }
    
    public Member(String pName, int pMemberID, int pMemberSince)
    {
        System.out.println("Parent Constructor with 3 parameters");
        
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
        
    }
    
    //Getter and setter methods
    public double getDiscount(){
        return discount;
    }
    
    public void setDiscount(){
        Scanner input = new Scanner(System.in);
        String password;
        System.out.println("Please enter a admin password: ");
        
        password = input.nextLine();
        
        if (!password.equals("abcd"))
        {
            System.out.println("Invalid password.  You do not have authority to edit the discount;");
            
            
        }
        else
        {
            System.out.print("Please enter the discount: ");
            discount = input.nextInt();
        }
    }
    
    //Methods
    public void displayMemInfo(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }
    
    abstract public void calculateAnnualFee();

}


public class InheritanceDemo{
    public static void main(String[] args)
    {
        /*
        NormalMember mem1 = new
        NormalMember("James", 1, 2010);
        VipMember mem2 = new VipMember("Andy", 2, 2011);
                
        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();
        
        mem1.displayMemInfo();
        mem2.displayMemInfo();
        
        mem1.setDiscount();
        
        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();
        
        mem1.displayMemInfo();
        mem2.displayMemInfo();*/
        
        Member[] clubMember = new Member[6];

        clubMember[0] = new NormalMember("James", 1, 2010);
        clubMember[1] = new NormalMember("Andy", 2, 2011);
        clubMember[2] = new NormalMember("Bill", 3, 2011);
        clubMember[3] = new VipMember("Carol", 4, 2012);
        clubMember[4] = new VipMember("Evelyn", 5, 2012);
        clubMember[5] = new VipMember("Yvonne", 6, 2013);
        
        
        for (Member m : clubMember)
        {
            m.calculateAnnualFee();
            m.displayMemInfo();
        }
    }
}