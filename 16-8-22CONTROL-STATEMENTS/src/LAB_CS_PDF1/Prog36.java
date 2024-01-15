/*
Program-36
Write a method which can find the sum of the first n prime numbers.
Prime numbers are numbers which have only 1 and the 
number itself as its factors. 
2 is the only even prime number. 
1 is neither prime nor composite. 
Example: the 1st 5 prime numbers are 2,3,5,7,11 and sum is 28
Method Name 	getPrimeSum 
Method Description 	Get the sum of the first n prime numbers 
Argument  	  int n 
Return Type 	Int 
Logic 	Hint : 
1. Use for loop to iterate over numbers from 2 to n, 
say loop variable i. 
2. Use an inner loop with loop variable j which 
loops from to 2 to i/2. If for any j the remainder 
on dividing i by j is zero, the number is non-prime. 
If it is prime add the number to the sum*/
package LAB_CS_PDF1;

public class Prog36 
{   int sum=0,c,c1;
   int  getPrimeSum(int n)
   { 
	 for(int i=1;c1!=n;i++) 
	 {    c=0;
		 for(int j=1;j<=i;j++)
		 {
			 if(i%j==0){c++;} 
		 }
		if(c==2) 
		 {
		   c1++;
		   sum=sum+i;
		 }
	 }  
	return sum;
   }
   public static void main(String[] args) 
     {
	   Prog36 p =new Prog36();
	   System.out.println(p.getPrimeSum(5));
     }
}
