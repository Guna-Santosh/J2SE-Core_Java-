/*
Program-16
Define a method which returns a string of all numbers between 1 and the given input value.
Write the method with following specifications
Name of method: getFourPerLine
Arguments: 1 argument of type int
Return Type: A String value
Value must not be negative. If yes, then return -1 as string.                       
Value must not be 0. If yes, then return -2 as string.                              
 Value must not be greater than 99. If yes, then return -3 as string.
Numbers in range must be returned as one string with every value separated by single blank space.
Ensure a new line after every set of 4 values.*/
package LAB_CS_PDF1;

public class Prog16 {
	public String getNumbersInRange(int a)
	{ String s = "";int i;
		if(a<0)
		return "-1";
		else if(a==0)
		return "-2";
		else if(a>99)
			return "-3";
		else if(a<99)
		{
			for(i=1;i<=a;i++)
				{s+=i+" ";
			if(i%4==0)
				s+="\n";}
		}
			return s;	
		}
	public static void main(String[] args) 
	{
		Prog16 obj=new Prog16();
	System.out.println(obj.getNumbersInRange(19));	
	}
}
