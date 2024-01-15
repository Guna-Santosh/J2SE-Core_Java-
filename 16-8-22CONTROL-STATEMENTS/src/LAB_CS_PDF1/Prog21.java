/*
Program-21
Define a Method that checks for whether a 
given input is a palindrome number or not, 
and return a string.
Write the method with following specifications
Name of method: checkPalindrome
Arguments: 1 Integer Argument 
Return Type: A String value
Value must not be negative.
 If yes, then return   -1 as string.
Value must not be from 0 to 9.
 If yes, then return -2 as string.
If value is a palindrome,
 then return true as string 
 otherwise return false as string.
*/
package LAB_CS_PDF1;
import java.util.*;
public class Prog21
{
    String checkPalindrome(int a)
  { 
   int b=a;
	if(a<=0)
		return "-1";
	else if(a>0&&a<9)
		return "-2";
	else 
	{	
		int n=0;
		while(a!=0)
		{
		n=n*10+a%10;
		a=a/10;
		}
	  if(b==n)
		 return"palindrome";
	  else
		 return " Not palindrome";
       }
}	
public static void main(String[] args) 
  {
	Prog21 obj=new Prog21();
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter the number:");
	int a=s.nextInt();

	String s1=obj.checkPalindrome(a);
	System.out.println(s1);
	s.close();
	}
}