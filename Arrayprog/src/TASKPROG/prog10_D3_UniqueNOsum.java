/*Que-10)*****
_____________________
Define a method which accepts an array of numbers 
and return the sum of unique numbers from the array.

Write the method with the following specifications: 

Name of method sumOfArray() 
Arguments: one argument of type integer array
Return Type: an integer value

Specifications: The value returned by the method sumOfArray() 
is determined by the following rules:

Array must not be null or length must not be 0. 
If yes, then return -1                                                               
Array must not contain negative values. 
If yes, then return -2

Input: {1, 2, 3, 2, 4, 1}
Output: 7
*/package TASKPROG;

import java.util.Scanner;

public class prog10_D3_UniqueNOsum {
int sumOfArray(int[] a)
{    int sum=0;
    for(int i=0;i<a.length;i++) 
	{int c=0;
		for(int j=0;j<a.length;j++) 
		{
		     if(a[i]==a[j])	c++;
		}if(c==1)sum+=a[i];
	}
	return sum;
}
	public static void main(String[] args) 
	{   
		Scanner s=new Scanner(System.in);
        System.out.print("a[i] size ");     
        int size =s.nextInt();
        int a[]=new int[size];
      
         for(int i=0;i<a.length;i++)
         a[i]=s.nextInt();
         prog10_D3_UniqueNOsum ud=new prog10_D3_UniqueNOsum();
         System.out.println(ud.sumOfArray(a));
         
	}

}
