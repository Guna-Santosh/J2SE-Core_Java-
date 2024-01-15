package test;

import java.util.*;

public class ExceptionNames extends Exception 
{
	
	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   //---------------------1---------------------------------
	   try 
	   {     System.out.print("enter value");	   
		     int k=s.nextInt();//if u give input as string then line 19 excute 
	         System.out.println(k);
	   }
	   catch(InputMismatchException ob) 
	   {
		   System.out.println("try to enter only intereger value");
	   }
	   //----------------------2---------------------------------
	   try 
	   {
		   String s1=null;
		   System.out.println(s1.length());
	   }
	   catch(NullPointerException ob) 
	   {
		   System.err.println("try to give some input");
	   }
	   //-----------------------3---------------------------------
	   try 
	   {
		   int s1=10/0;
		   System.out.println(s1);
	   }
	   catch(ArithmeticException ob) 
	   {
		   System.out.println("not possible to divided by 0");
	   }
	   //------------------------4------------------------------
	   try 
	   {
		   String s1="äbc";
		   int i=Integer.parseInt(s1);
		   System.out.println(i);
	   }
	   catch(NumberFormatException ob) 
	   {
		   System.err.println("string not convert into integer");
	   }
	   //-------------------------5-----------------------------
	   try 
	   {
		   //String s1[]= new String[6];
		   String s2[]= {"sas","asas","sasa"};
		   System.out.println(s2[22]);
	   }
	   catch(ArrayIndexOutOfBoundsException ob) 
	   {
		   System.out.println("String [] size is not match");
	   }
	   //--------------------------6----------------------------
	   try 
	   {
		   //String s1[]= new String[6];
		   int s2[]= {20,50};
		   System.out.println(s2[22]);
	   }
	   catch(ArrayIndexOutOfBoundsException ob) 
	   {
		   System.err.println("int[] size is not match");
	   }
	   //--------------------------7----------------------------
	   
//================================user define Exception=============================
	   
	   
	   
	}

}
