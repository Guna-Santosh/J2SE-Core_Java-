/*Que-5)
_____________________
Develop a program to create an array of 
integer and copy this array element into the new array and 
display element from both the array? by creating a method 
method name: copyArray
return type: void 
having one parameter int []
*/package TASKPROG;

import java.util.Scanner;

public class Pro5_D1_copyArry 
{
	void copyArray(int[] a) 
	{   int j=0;
	//int size=Integer.parseInt(new Scanner(System.in).nextLine());
			
	   int b[]=new int[a.length];
	    System.out.print("a[i] = ");
		for(int i=0;i<a.length;i++) 
		{
			b[i]=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("b[i] = ");
		for(int k=0;k<a.length;k++)
		System.out.print(b[k]+" ");
	}
	
	public static void main(String[] args) {
		System.out.print("a[i] size = ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int size = s.nextInt();
		int[] a=new int[size];
		//int[] b=new int[a];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		Pro5_D1_copyArry p=new Pro5_D1_copyArry();
		p.copyArray(a);
		
		
		s.close();
	}
}
