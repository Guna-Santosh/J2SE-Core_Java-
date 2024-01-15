/*
Develop a program to create an array with diff
integer value and sort them in 
the order of acending and dec order?*/
package TASKPROG;
import java.util.Scanner;
public class Pro8_D2_sort_A_D {

	public static void main(String[] args) {
     System.out.print("a[i] size = ");		
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int[] a=new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++) 
		{
			if(a[i]>a[j]) 
			{
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
			}
		}
	}for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");
	System.out.println("\n----------------------");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++) 
		{
			if(a[i]<a[j]) 
			{
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
			}
		}
	}for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}

}
