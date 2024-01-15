/*Program-25
Write a program the prints * in C shape for the given input rows
If n is 4
C shape is
**
*
*
**

If n is 5
***
*
*
*
****/package Screaning_test;
import java.util.Scanner;
public class Prog25 
{
	Prog25(int value)
	{
		for(int i=1;i<=value;i++)
		{
			for(int j=1;j<=value/2+(value%2);j++) {
		if(j==1||i==1||i==value) 
		{
			System.out.print("*");
		}//end of if
		
	   }//end of 2nd for loop
			System.out.println();
      }//end of 1st for loop
		
		
		
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE VALUE = ");
	int value=s.nextInt();
	Prog25 p=new Prog25(value);
	
	
	s.close();
}//end of main()
}//end of class
