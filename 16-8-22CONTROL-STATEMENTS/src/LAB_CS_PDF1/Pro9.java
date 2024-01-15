/*
Program-9
Define a method which returns the sum of three rounded numbers. If the right most digit of the number is less than 5, then round off it's value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5, then round off to the next multiple of 10. 
Write the method with the following specifications: 
Name of method sumOfRoundedValues() // which accepts three integer value as argument and return the sum of three rounded numbers.
Arguments: three argument of type integer
Return Type: an integer value 
Example
If a = 23, b = 34, c = 66
   20 + 30 + 70 = 120
If a = 23, b = 37, c = 55
   20 + 40 + 60 = 120
Specifications: The value returned by the method sumOfRoundedValues() is determined by the following rules:
If any of the given number is negative or zero, return -1.
If any of the given numbers right most digit is of the number is lessthan 5, then round off its value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5, then round off to the next multiple of 10. */
package LAB_CS_PDF1;

public class Pro9 {
	public int SumOfRoundedValues(int a,int b,int c)
	{
	       
		 if(a<=0 || b<=0 || c<=0)
			  return -1;  
	   /*  else if(a%2!=0)
			  return (a*a*a);   
		   	 else if(b%2!=0)
		      return (b*b*b);
		    else if(c%2!=0)
			 return(c*c*c);*/	    
	if(a%10<5) 
		a=(a/10)*10;
    else
    	a=(a/10+1)*10;
	if(b%10<5) 
		b=(b/10)*10;
	else 
		b=(b/10+1)*10;
	if(c%10<5) 
		c=(c/10)*10;
	else
		c=(c/10+1)*10;	 
	return a+b+c;
	}
	public static void main(String[] args) {
		Pro9 obj=new Pro9();
System.out.println(obj.SumOfRoundedValues(233,34,66));
	}
}
