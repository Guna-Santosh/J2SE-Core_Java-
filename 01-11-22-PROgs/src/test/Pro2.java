package test;

import java.util.Scanner;

public class Pro2 
{ String s="";int k=0;
   int getSumOfModifiedElements(int a[]) 
   {   
	   if(a==null)
	     k= -1;
		
		  for(int i=0; i<a.length;i++) 
		  { if(a[i]==0) k=-2; 
		  if(a[i]<0)     k=0;
		  }
	   return k;
   } 
	public static void main(String[] args) 
	{
         Pro2 p=new Pro2();	
         Scanner s=new Scanner(System.in);
         int a[]=new int[4];
		 System.out.println("enter the ele");
	     for(int i=0;i<a.length;i++) a[i]=s.nextInt();
		 System.out.println(p.getSumOfModifiedElements(a));
	}
}
//int a[]=null;// 1 2 3 4
//System.out.println(p.getSumOfModifiedElements(a));