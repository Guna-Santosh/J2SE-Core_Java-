package test;
import java.util.*;
//@SuppressWarnings("serial")
public class SingleCatch extends Exception
{
	SingleCatch (){}
	SingleCatch (int a){}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//--------pre-defin multi exception--------
		try
		{
			
			String s2[]= {"sas","asas","sasa"};
			System.out.println(s2[22]);
			int s1=10/0;
			
			System.out.println(s1);
			SingleCatch ob=new SingleCatch();
			//throw ob;
		}
		
		catch(ArrayIndexOutOfBoundsException|ArithmeticException ob) 
		{
			System.out.println("arr");
		} 
		
		
		//--------------single try----------
		
		try 
		{
			 int a[]=new int[5];    
			a[5]=30/0;  	
            System.out.println(a[55]);  
           
		}
		catch(ArithmeticException  ob) {ob.printStackTrace();}
		catch(ArrayIndexOutOfBoundsException ob) {ob.printStackTrace();}
		catch(Exception ob) {ob.printStackTrace();}
		
		finally {System.out.println("iam finally block");}
		
	}

}
