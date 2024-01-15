/*Program-31
Create a class with a method to find the difference between 
the sum of the squares and the square of 
the sum of the first n natural numbers.
Method Name 	calculateDifference 
Method Description 	Calculate the difference 
Argument 	int n 
Return Type 	int - Sum 
Logic 	Find the difference between 
the sum of the squares of the 
first n natural numbers and the square of their sum. 
For Example if n is 10,you have to find 
(1^2+2^2+3^2+….9^2+10^2) -(1+2+3+4+5…+9+10)^2 
*/
package LAB_CS_PDF1;
public class Prog31 
{
       int calculateDifference(int n) 
       {int a=0,b=0,c=0;
    	   for(int i=1;i<=n;i++) 
    	   {
    		   a=a+(i*i);
    		   b=b+i;
    		   c=a-(b*b);
    		}
    	  return Math.abs(c);
    	  }
public static void main(String[] args) {
	Prog31 sq=new Prog31();
	System.out.println(sq.calculateDifference(10));
}//end of main()
}//end of class
