/*Program-24
Write a program to print multiplication of given number till 100
If the input is 12
The result is 12*1=12
12*2=24
..

12*100=1200
The System.out,println should print the table as the same format as given above*/
package Screaning_test;

public class Prog24
{
	Prog24(int value)
	{String str="";
		for(int i=1;i<=100;i++) 
		{
			int s=i*value;
			System.out.println(value+"*"+i+"="+value*i);
		}
		
		
	}
	
public static void main(String[] args) {
	java.util.Scanner s=new java.util.Scanner(System.in);
	System.out.println("ENTER THE VALUE = ");
	int value=s.nextInt();
	Prog24 p=new Prog24(value);
}//end of main()
}//end of class
