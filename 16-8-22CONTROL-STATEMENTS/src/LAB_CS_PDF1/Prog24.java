/*Program-24
Define a method which accepts an integer value
 as argument and return the factors of the given value.
Write the method with the following specifications: 
Name of method getFactors() 
// which accepts an integer value as argument and return a String.
Arguments: one argument of type integer
Return Type: String value
Input: 28
Output: "1 2 4 7 14 28"

Input: -20
Output: "-1"
Input: 0
Output: "-2"
Specifications: The value returned by the method 
getFactors() is determined by the following rules:
1) If the value is negative, return "-1" as string              
2) If the value is zero, return "-2" as string
3) In other case, return the string, concatenating 
all the factors of the given number separating 
each factor with a blank space.
*/
package LAB_CS_PDF1;
public class Prog24
{
   String getFactors(int a) 
   {int c=0;
	   if(a<0)
		   return "-1";
	   else if(a==0)
		   return "-2";
	   else
	   {
		   for(int i=1;i<=a;i++) 
		   {
			   if(a%i==0)
			   {
				   c++;			
				System.out.print(i+" ");   
			   }
		   }//end of for loop
		   System.out.println("\nNUMBER OF FACTORS = "+c);
	   }//end of else
	   
	return "";
   }//end of getfactors methods
   public static void main(String[] args) 
   {
	System.out.print("ENTER THE NUMBER = ");
	java.util.Scanner s=new java.util.Scanner(System.in);
	int a=s.nextInt();
	Prog24 fa=new Prog24();
	System.out.println(fa.getFactors(a));
	s.close();
   }//end of main
}//end of class
