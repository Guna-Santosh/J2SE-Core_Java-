/*
Program-25
Define a method which accepts a value as number 
and returns the sum of factors of the value.
Write the method with the following specifications: 

Name of method getSumOfFactors() 
// which accepts an integer value as argument and return a String.
Arguments: one argument of type integer
Return Type: integer value
Specifications: The value returned by the method getSumOfFactors() 
is determined by the following rules:
Value must not be negative. If yes, then return   -1             
Value must not be 0. If yes, then return -2.*/
package LAB_CS_PDF1;
public class Prog25 
{
    int getSumOfFactors(int a) 
    {  int s=0;
    	if(a<0)
    	return -1;
    	else if(a==0)
		return -2;
    	else
    	{
    	  for(int i=2;i<a;i++) 
          {
    	     if(a%i==0)
    	     {	
    	    	  s=s+i;
    		  System.out.print(i+" ");   
    	     }//end of if 
    	  }//end of for lOop
    	  System.out.print("\nSUM OF FACTORES = ");        
    	}//end of else
    	return s;
    }//end of getsum methods
    public static void main(String[] args) 
    {
		System.out.print("ENTER NUMBER = ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int a=s.nextInt();
		Prog25 gsf=new Prog25();
		int ot=gsf.getSumOfFactors(a);
		System.out.println(ot);
		s.close();
	}//end of main
}//end of class
