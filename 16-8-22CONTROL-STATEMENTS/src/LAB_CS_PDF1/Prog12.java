/*Program-12
Define a method which returns a String 
containing natural numbers between a range
 of two numbers separated by a single space. 
 Solve it without using loops.

Write the method with the following 
specifications:
Name of method: getNaturalNumbers()
Arguments: 2 Arguments of int type. 
Return Type: A String value

Values must not be negative. 
If yes, then return -1 as string.                    

Values must not be 0. 
If yes, then return -2 as string. 

Natural Numbers must be returned as
 one string with every value separated by 
 single blank space.
Consider that, 
the first argument value is less than 
the second argument number*/
package LAB_CS_PDF1;

public class Prog12
{
   public String getNumbersInRange(int a,int b)
   { String c=" ";
   if(a<0 || b<0)
		return "-1";
   else if(a==0 || b==0)
		return "-2";
   else if(a<=b)
   {
	  // c=(a)+" ";
	  System.out.print(a+++c);
	   getNumbersInRange(a,b);
	   //return c+getNumbersInRange(++a,b);
	}
		return c;
}
public static void main(String[] args)
{ 
	Prog12 obj=new Prog12();
	System.out.println(obj.getNumbersInRange(10,20));
	
}
}