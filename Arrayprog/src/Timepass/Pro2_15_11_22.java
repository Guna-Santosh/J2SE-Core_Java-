package Timepass;

import java.util.Scanner;

interface Boss1
{
	abstract void m1() ;	
}
public class Pro2_15_11_22 
{

	public static void main(String[] args) 
	{
	        Scanner s=new Scanner(System.in);
	        System.out.print("a[] size= ");
			int n=s.nextInt();
			//int sum=0;
			String[]a=new String[n];
			Boss1 ob=()->
			{
				for(int i=0;i<a.length;i++) 
				{
					a[i]=s.next();
				}
				for(int i=0;i<a.length;i++)
				{
				 System.out.print(a[i].toLowerCase()+" ");
				   
				}
				
			};
			
			ob.m1();
		}
		
	

}
