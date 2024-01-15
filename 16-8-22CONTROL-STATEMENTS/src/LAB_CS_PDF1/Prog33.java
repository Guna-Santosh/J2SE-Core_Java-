/*Program-33
Create a method to find the sum of the 
first n even numbers that are divisible by 3 and 8
Method Name 	findSum 
Method Description 	Find the sum of first n even numbers
that are divisible by 3 and 8 
Argument 	Int 
Return Type 	Int 
Logic 	Sum of the multiples of first n even numbers 
that are divisible by 3 and 8 
*/package LAB_CS_PDF1;

public class Prog33 
{
	int findSum(int n)
	{int sum=0;
		for(int i=0;i<n;i++) 
		{
			if(i%2==0) 
			{
			 if(i%3==0||i%8==0) 
			  {
			         sum=sum+i;	
			   }
			}
		}
		return sum;
	}	
public static void main(String[] args) 
    {
	   Prog33 sd=new Prog33();
       System.out.println(sd.findSum(20));
    }
}
