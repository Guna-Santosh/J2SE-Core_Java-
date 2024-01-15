/*
Program-32
Create a method to check if a number is a power of two or not
Method Name 	checkNumber 
Method Description 	Checks if the entered number is a 
power of two or not 
Argument 	int n 
Return Type 	boolean 
Logic 	Check if the input is a power of two. 
Ex: 8 is a power of 2*/
package LAB_CS_PDF1;

public class Prog32 {
public static void main(String[] args) 
{ int n=16;
boolean x=true;
System.out.print(n);
	for(;n!=1;n=n/2) 
	{
		if(n%2!=0) {
			x=false;
			break;
		}
	}
	System.out.println(" Given value is  power of 2 : "+x);

}
}
