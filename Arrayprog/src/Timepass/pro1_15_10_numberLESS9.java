package Timepass;

import java.util.Arrays;
import java.util.Scanner;

public class pro1_15_10_numberLESS9 {

	public static void main(String[] args) 
	{
		System.out.print("a[i] size = ");
	       Scanner s=new Scanner(System.in);
	       int size =s.nextInt();
	       Integer[] a=new Integer[size];
	       for(int i=0;i<size;i++)
	    	   a[i]=s.nextInt();
	      Arrays.sort(a);
	      System.out.println("enter ele");
	      int n=s.nextInt();
	       for(int i=0;i<a.length;i++) 
	       {
	    	   if(a[i]>n)continue;
	    		   System.out.print(a[i]+" ");
	       }

	}

}
