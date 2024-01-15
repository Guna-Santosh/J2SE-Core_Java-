/*
Program-18
Define a method which accepts 1 numeric 
argument and returns a String of stars (*).
For instance if the given input is 3,
then First line must have One star, 
Second Line Two stars, 
Third line Three Stars.  
Write the method with following specifications
Name of method: createStarPattern
Arguments: 1 Integer Argument 
// Represents Number of Rows.
Return Type: A String value
Value must not be negative. 
If yes, then return -1 as string.                       
Value must not be 0. 
If yes, then return -2 as string.                             

Pattern must be created using star symbol 
separated by single blank space.
 Example:
Input: 4
Output:
 *
 *  *
 *  *  *
 *  *  *  *
 */
package LAB_CS_PDF1;

public class Prog18 {
	String createStarPattern(int a)
	  {  String s ="";
		if(a<0)
			return "-1";
		else if(a==0)
		return "-2";
		else 
		{ 
			for(int i=a;i>=1;i--)
			{
				for(int j=a;j>=1;j--)
				{
					if(i<=j) 
					 System.out.print("*");
				    
					else System.out.print(" ");
				}System.out.print("\n");
			}
			return "";
		}
		
		
	  }
	public static void main(String[] args) {
		Prog18 obj=new Prog18();
System.out.println(obj.createStarPattern(4));
	}
}
