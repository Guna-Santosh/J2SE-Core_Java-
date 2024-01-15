/*Program-26
Define a method which accepts 2 values as number 
and returns the even numbers between the 2 values.
Write the method with the following specifications
Name of method getEvenNumbers() 
// which accepts 2 integer values as arguments
 *  and return the even numbers between the range.
Arguments: Two arguments of type integer
Return Type: String value
Note: If the first argument value is greater than second value,
generate even numbers from first value to second value. 

If the second value is less than first value, 
generate even numbers from second value to first.

Specifications: The value returned by the method getEvenNumbers() is determined by the following rules
Values must not be negative. If yes, then return   -1 as string.                                                   
Value must not be 0 or same. If yes, then return -2 as string.                                            
The values must be returned as a single string 
 where each value is separated by a single blank space.
For Example:
1.If the first argument value is greater than second value,
generate even numbers from first value to second value. 
Input: 10 20
Output: 10 12 14 16 18 20

2.If the second value is less than first value, 
generate even numbers from second value to first.
Input: 20 10
Output: 10 12 14 16 18 20
*/
package LAB_CS_PDF1;
public class Prog26 
{
   String getEvenNumber(int a, int b) 
   {
	   String str="";
	   if(a<0||b<0)
		   return "-1";
	   else if(a==0||b==0||a==b)
		   return "-2";
	   else if(a<b)
		   for(int i=a;i<=b;i++) 
		   {
			if(i%2==0)str+=i+" ";
		   }
	   else
		   for(int i=b;i<=a;i++) 
		   {
			   if(i%2==0)str+=i+" ";
		   }
	   return str;
   }//end of getEvenNumbermethod
   public static void main(String[] args) 
   {
	
	java.util.Scanner s=new java.util.Scanner(System.in);
	System.out.print("ENTER 1st NUMBER = ");
	int a=s.nextInt();
	System.out.print("ENTER 2nd NUMBER = ");
	int b=s.nextInt();
	Prog26 gen=new Prog26();
	System.out.println(gen.getEvenNumber(a, b));
	s.close();
   }//end of main
}//end of class
