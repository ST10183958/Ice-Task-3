
package com.mycompany.icetask3;


import javax.swing.JOptionPane; 

import java.util.Scanner;
  
public class IceTask3 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        String GenderOutput = GetGender();
        String Access_Method_Output = AccessMethod();
        int MaleNumber = GetmalesNumber();
        int FemaleNumber = GetFemalesNumber();
        Calculate(FemaleNumber,MaleNumber,GenderOutput);
        

    } 
    
    
    // Retrieving Age //
    public static String AccessMethod() {
        Scanner AgeScanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int AgeInput = AgeScanner.nextInt();
        
        String Output = "";
        
        if(AgeInput < 18) {
            Output = "Denied";
        }
        if(AgeInput >= 18 && AgeInput < 35) {
            Output = "Accepted";
        }
        if(AgeInput > 35) {
            Output = "To old";
        }
        return Output;   
    }
    // Retrieving Age //
    
    // Retrieving Gender //
    public static String GetGender() {
        Scanner GenderScanner = new Scanner(System.in);
        
        System.out.print("Are you male or female:");
        String Gender = GenderScanner.nextLine();
        
        return Gender;
    }
    // Retrieving Gender //
    
    // Retrieving number of males //
    public static int GetmalesNumber() {
        Scanner maleNumberScanner = new Scanner(System.in);
        System.out.print("Number of males:");
        int NumberOfmales = maleNumberScanner.nextInt();
        
        return NumberOfmales;
    }
    // Retrieving number of males //
    
    // Retrieving number of males //
     public static int GetFemalesNumber() {
        Scanner FemaleNumberScanner = new Scanner(System.in);
        System.out.print("Number of females:");
        int NumberOfFemale = FemaleNumberScanner.nextInt();
        
        return NumberOfFemale;
    }
    // Retrieving number of males //
    
    public static void Calculate(int FemaleNumber, int MaleNumber,String GenderOutput) {
        int Total_Cost = MaleNumber*10;
        int Male_bill = 10;
        int finalbill = 0;
        String StringTotal_Cost = String.valueOf(Total_Cost);
        System.out.println("Male order:R"+StringTotal_Cost);
        
        if(!GenderOutput.equals("female")) {
            System.out.println("Your gender is :"+GenderOutput+" You will pay R10");
            finalbill = Total_Cost+Male_bill;
            System.out.println("Final bill:R"+String.valueOf(finalbill));
        } else {
            System.out.println("Your gender is :"+GenderOutput+" You are granted free access");
        }

        
    }    
} 