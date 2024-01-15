/*Program-2
Define a method which returns the greatest number among two numbers.
Write the method with the following specifications: 
Name of method: getGreatest() // which accepts two integer values as argument and return the greatest value.
Arguments: two argument of type integer
Return type: an integer value 
Specifications: The value returned by the method getGreatest() is determined by the following rules:
If any of the given numbers are negative, return -1.
If any of the given numbers are zero, return -2.
If the given numbers are positive, return the greatest.*/
package LAB_CS_PDF1;

public class Pro2
{
	public int  getGreatest(int a,int b)
	{
		if(a<0||b<0)
			return -1;
		
		else if(a==0||b==0)
			return 0;
		
		else {
			if(a>b)
				return a;
			else
				return b;
		     }
		
			//System.out.println("greatest");
	}
	   public static void main(String[] args)
	   {
		Pro2 aobj=new Pro2();
		System.out.println(aobj.getGreatest(5,9));
	   }
}
