/*Program-29
Define a method which accepts two integer values as arguments and 
return the sum of prime numbers between the given range.
Write the method with the following specifications

Name of method getPrimeNumbersSum() 
// which accepts two integer values as argument and
return the sum of all prime number between the range.
Arguments: two arguments of type integer
Return Type: an integer value
Note: 1 is not a prime
Specifications: The value returned by the method 
getPrimeNumbersSum() is determined by the following rules
In any of the input value is negavie, return -1
In any of the input value is zero, return -2
If the first value is greater than or equal to second value, return - 3.
*/
package LAB_CS_PDF1;
public class Prog29 
{
	int getPrimeNumbersSum(int a,int b)
	{  int s=0;
		if(a<0||b<0)
		return -1;
		else if(a==0||b==0)
		return -2;
		else 
		{
			for(int i=a;i<b;i++) 
			{int c=0;
				for(int j=1;j<=i;j++) 
				{
				if(i%j==0)c++;
				}
				   if(c==2) 
				   {
					   s=s+i;	
				   }
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Prog29 p=new Prog29();
		System.out.println(p.getPrimeNumbersSum(10,20));
	}//end of main()
}//end of clas
