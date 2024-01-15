/*Program-30
Create a class with a method which can calculate the 
sum of first n natural numbers which are divisible by 3 or 5.
Method Name 	calculateSum 
Method Description 	Calculate Sum 
Argument 	int n 
Return Type 	int-sum 
Logic 	Calculate the sum of first n natural numbers which are divisible by 3 or 5. 
*/package LAB_CS_PDF1;

public class Prog30 
{
	int calculateSum(int n) 
	{int sum=0;
		for(int i=1;i<n;i++) 
		{
			if(i%3==0||i%5==0) 
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}System.out.print("\nsum = ");return sum;
	}
		public static void main(String[] args) {
	    Prog30 cs=new Prog30();
	    System.out.println(cs.calculateSum(10));
	}//end of main
}//end of class
