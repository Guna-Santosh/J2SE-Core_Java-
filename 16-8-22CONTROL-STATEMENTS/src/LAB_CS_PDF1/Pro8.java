/*Program-8
Define a method which returns the sum of three numbers after rounding off each number to the next multiple of 
10. If any of the given number is multiple of 10 dont change it's value

Write the method with the following specifications: 
Name of method: sumOfMultiples() // which accepts three integer value as argument and return the sum of three numbers after rounding off each number to the next multiple of 10. 
Arguments: three argument of type integer
Return Type: an integer value 
Example
If a = 23, b = 34, c = 69
   30 + 40 + 70 = 140
If a = 23, b = 34, c = 50
   30 + 40 + 50 = 120
Specifications: The value returned by the method sumOfMultiples() is determined by the following rules:
If any of the given number is negative or zero, return -1.
If the number is an multiple of 10
If the given number is odd, return cube of the given number.*/
package LAB_CS_PDF1;

public class Pro8 { int s;
public int sumofmultiples(int a,int b,int c)
{
       
	 if(a<=0 || b<=0 || c<=0)
		  return -1;  
   /*  else if(a%2!=0)
		  return (a*a*a);   
	   	 else if(b%2!=0)
	      return (b*b*b);
	    else if(c%2!=0)
		 return(c*c*c);*/	    
        if(a%10==0)
        	a=(a/10)*10;
        else
        	a=(a/10+1)*10;
        if(b%10==0)
        	b=(b/10)*10;
        else
        	b=(b/10+1)*10;
        if(c%10==0) 
        	c=(c/10)*10;
        else
        	c=(c/10+1)*10;	 
	return a+b+c;
	/* if(a%10!=0 && b%10!=0 && c%10!=0) 
	 {
		 a=(a/10+1)*10;
		 b=(b/10+1)*10;
		 c=(c/10+1)*10;
	 }
	 else
		 a=(a/10)*10;
	     b=(b/10)*b;
	     c=(c/10)*c;
	return a+b+c;*/
}
public static void main(String[] args) {
	Pro8 obj=new Pro8();
	
	System.out.println(obj.sumofmultiples(23,34,69));
}
}