/*Program-23
Define a method which accepts a value as number and returns the 
factorial of the value.
Write the method with the following specifications: 
Name of method getFactorial() 
// which accepts an integer value as argument
  and return the factorial of the given value.
Arguments: one argument of type integer
Return Type: an integer value
Specifications: The value returned by 
the method getFactorial() 
is determined by the following rules:
Value must not be negative. If yes, then return   -1           
Value must not be 0. If yes, then return -2
*/
package LAB_CS_PDF1;
public class Prog23 
{   int r=0,n,f=1;
   int getFactorial(int a) 
   {
     if(a<0)
    	 return -1;
     else if(a==0)
    	 return -2;
     else
     {
    	for(int i=1;i<=a;i++) 
    	{
    		f=f*i;
    	}
     }
     return f;
   }
   public static void main(String[] args)
   {
	System.out.println("enter number");
	java.util.Scanner s=new java.util.Scanner(System.in);
	int a=s.nextInt();
	Prog23 fact=new Prog23();
	System.out.println(fact.getFactorial(a));
	
	
	s.close();
   }
}
