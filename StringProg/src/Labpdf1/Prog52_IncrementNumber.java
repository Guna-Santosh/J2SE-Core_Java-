/*
Program-52
Create a method to check if a number is an increasing number
Method Name 	checkNumber 
Argument 	    String number 
Return Type 	boolean 
For Example 	134468 is an increasing number 
A number is said to be an increasing number 
if no digit is exceeded by the digit to its left. */
package Labpdf1;
public class Prog52_IncrementNumber 
{
	boolean checkNumber(String a)
	{  
		boolean p=true;
	    int len=a.length();
	for(int i=0;i<len-1;i++) 
	{
		if(a.charAt(i)>a.charAt(i+1)) 
		{
			p=false;
		}//END OF IF
	}//END OF 1ST FOR LOOP
	return p;	
	}//END OF CHECKNUMBER()
	public static void main(String[] args) 
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("ENTER THE STRING NO = ");
		String a=s.nextLine();
		Prog52_IncrementNumber sp=new Prog52_IncrementNumber();
		System.out.println(sp.checkNumber(a));
		boolean p=sp.checkNumber(a);
		if(p) 
		{
			System.out.println(a+" "+" is increased string");
		}//END OF IF 
		else 
		{
			System.out.println(a+" "+" not increased string");
		}//END OF ELSE
		s.close();
	}//END OF MAIN()
}//END OF CLASS
/*{
boolean k=true;
for(int i=0;i<number.length()-1;i++)
{
	if(number.charAt(i)>number.charAt(i+1)) 
	{
		k=false;
	}
}
return k;
}*/



               //correct process//
//boolean k=false;
/*for(int i=0;i<number.length()-1;i++) {
			if(number.charAt(i)>number.charAt(i+1)) 
				{k=true;break;}
			//else k=false;
		}
		if(k==false)return true;else return false;
		//return k;
	}*/