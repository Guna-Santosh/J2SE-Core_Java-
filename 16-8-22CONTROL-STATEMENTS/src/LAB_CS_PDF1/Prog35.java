/*Program-35
Write a method to find the sum of the factorials 
of the first n numbers in the Fibonacci series. 
Fibonacci series is given by 0 1 1 2 3 5 8…… 
Factorial for a number m is given by factorial= m*m-1*m-2….1
Method Name 	sumOfFactorial 
Method Description 	Calculate sum 
Argument 	int n 
Return Type 	int 
Logic 	
1. Generate the first n elements in the Fibonacci series 
2. Find the factorial of each element 
3. Find the sum of the factorial 
*/package LAB_CS_PDF1;

public class Prog35 
{
	
	int sumOfFactorial (int n) 
	{int a=0,b=1,c=0,fact = 1,sum=0,m;
	//System.out.printf("%d\n%d\n",a,b);
		for(int i=1;i<=n-2;i++) 
		{ 
			
			c=a+b;//a=0+b=1
			a=b;
			b=c;
			//System.out.print(c);
			m=c;
			for(;m!=0;)
			{
				fact*=m--;
			}
			sum+=fact;
			fact=1;
			}
			
              //k=c;
			
			//System.out.println(fact);
			
		return sum+2;
	}
public static void main(String[] args) {
	Prog35 sf=new Prog35();
	System.out.println(sf.sumOfFactorial(5));
}
}
