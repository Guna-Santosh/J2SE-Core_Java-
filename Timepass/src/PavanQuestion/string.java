/*
Program-52
Create a method to check if a number is an increasing number
Method Name 	checkNumber 
Argument 	    String number 
Return Type 	boolean 
For Example 	134468 is an increasing number 
A number is said to be an increasing number 
if no digit is exceeded by the digit to its left. */
package PavanQuestion;

public class string {
	
   boolean checkNumber(String number) 
	{
		boolean k=true;
		for(int i=0;i<number.length()-1;i++)
		{
			if(number.charAt(i)>number.charAt(i+1)) 
			{
				k=false;
			}
		}
		return k;
	}
	public static void main(String[] args) {
	string p=new string();
	System.out.println(p.checkNumber("13468"));
}
}
