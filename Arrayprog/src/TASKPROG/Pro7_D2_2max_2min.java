/*Que-2)
Develop a program to create an array with diff integer value and
find the 2nd max  and min value available in this array?*/
package TASKPROG;
import java.util.Scanner;
public class Pro7_D2_2max_2min 
{
	  public static void main(String[] args) {
	  System.out.print("a[i] size = ");
	  Scanner s=new Scanner(System.in);
	  int size=s.nextInt();
	  int[] a=new int[size];
	  for(int i=0;i<size;i++) 
		  a[i]=s.nextInt();
	      int max=0;                   int min=0;
		  int max2=a[0];               int min2=0;
	     for(int i=0;i<size;i++) 
	     {
	    	 if(max<a[i])
	    	 {
	    		 max2=max;
	    		 max=a[i];
	    	 }
	    	 else if(max!=a[i] && max2<a[i])
	    	 max2=a[i];
	    	 
	    	 
	     }System.out.println(max2);
//	      max=(a[i]<max)?a[i]:max; 
//	      System.out.println(max);
//	     
//	     for(int i=0;i<size;i++) 
//	       max2=(a[i]<max2 && a[i]>max)?a[i]:max2;
//	       System.out.println(max2);
	     
	  
	  
	  
	}   
}
