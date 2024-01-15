/*
Program-15
Define a method which returns a 
string of natural numbers within a range of
 two numbers with a given step/increment factor. 
Write the method with following specifications
Name of method: getNumbersInRange
Arguments: 3 arguments of type int
// first argument as start value
// second argument as end value
// third argument is the step/increment value
Return Type: A String value
Values must not be negative. 

If yes, then return -1 as string.
Values must not be same. If yes, 
then return -2 as string.
1st value must not be greater than 
2nd value. If yes, then 
return -3 as string.
Numbers in range must not include 
start and end value.
Numbers in range must be returned 
as one string with every value separated 
by single blank space.*/
package LAB_CS_PDF1;

public class Prog15 {
public String getNumbersInRange(int a,int b,int c)
{ String s = "";
	if(a<0||b<0||c<0)
	return "-1";
	else if(a==b)
	return "-2";
	else if(a>b)
		return "-3";
	else if(a<b)
	{
		s=(a+c)+""; 
	}
		return s;	
	}
public static void main(String[] args) 
{
	Prog15 obj=new Prog15();
System.out.println(obj.getNumbersInRange(20,20,10));	
}
}
/*
 for(int i=a+c;i<b;i+=c) {
			//s=s+i+"";}
 */

/*
 else if(a<b)
 {
 s=(a+c)+" ";}
 */

/*s=(a+c)+" ";
		 return s+getNumbersInRange(a+c,b,c);*/