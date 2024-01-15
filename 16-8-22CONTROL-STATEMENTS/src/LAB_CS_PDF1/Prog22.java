/*
Program-22
Define a method which accepts a 4-digit value as number 
and checks whether the number is armstrong or not.
Armstrong number: An Armstrong number is an n-digit number that is
equal to the sum of the nth powers of its digits.
For this program we need 4-digit armstrong number and is calculated as
Input: 1634 is a 4-digit armstrong number defined as
	1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
Write the method with the following specifications: 

Name of method: checkArmStrong() 
// which accepts an integer value as argument and return the String as specified below.
Arguments: one argument of type integer
Return Type: a String value
Specifications: The value returned by the method checkArmStrong() 
is determined by the following rules:
If the input value is negative, return "-1" as string.   
If the input value is not a 4-digit number, return "-2" as string.                               
If the input value is a 4-digit number and is an armstrong,
return "ArmStrong Number" as string otherwise return "Not ArmStrong Number" as string. 

Note: The string values you are returning are case sensitive.*/
package LAB_CS_PDF1;
import java.util.*;
public class Prog22
{
  String checkArmStrong(int a)
  { int r,s=0,c=0;
        int b=a; 
        //int n=a;
	if(a<0)
	return "-1";
	/*else if(a>0&&a<9999)
	return "-2";*/
	else 
	{
		while(a!=0)
		{
			c++;
			a=a/10;
		}System.out.println(c);
		a=b;
		if(c==3)
		   {
			while(a!=0)
			{
			r=a%10;
			s=s+(r*r*r);
			a=a/10;
			}
		}
		else if(c==4)
		    {
			while(a!=0) {
			r=a%10;
			s=s+(r*r*r*r);
			a=a/10;
			}
		}
		if(b==s)
			return "ArmStrong Number";
		else
			return "Not ArmStrong NumbER";
	}	
  }
  public static void main(String[] args) 
  {
	  System.out.println("ENTER THE 4 DIGIT NUMBER=");
	  Scanner s=new Scanner(System.in);
	  int b=s.nextInt();
	Prog22 am=new Prog22();
	System.out.println(am.checkArmStrong(b));
s.close();
  }
}
