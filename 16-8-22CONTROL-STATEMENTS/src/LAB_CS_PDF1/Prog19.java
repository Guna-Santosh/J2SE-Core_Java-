/*
Program-19
Define a method which accepts 1 numeric argument 
and returns a pattern of numbers as a string.
Write the method with following specifications
Name of method: NumberPattern4
Arguments: 1 Integer Argument 
// Represents Number of Rows.
Return Type: A String value
Value must not be negative.
 If yes, then return -1 as string.
Value must not be 0. 
If yes, then return -2 as string.
Value is rows.

Pattern must be created using numbers 
separated by single blank space 
Example:
Input: 5
Output:
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25*/
package LAB_CS_PDF1;

public class Prog19 {
	String createStarPattern(int a)
	  {  String s ="";
		if(a<0)
			return "-1";
		else if(a==0)
		return "-2";
		else 
		{ 
			for(int i=1;i<=a;i++)
			{
				for(int j=1;j<=i;j++) 
				{
				s=s+j*i+" " ;
				}
				 s+="\n";
			}
			return s;
		}
		
		
	  }
	public static void main(String[] args) {
		Prog19 obj=new Prog19();
		System.out.println(obj.createStarPattern(5));
	}
}
