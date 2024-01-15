package Labpdf1;

public class Prog65_sumOFnumber_inString 
{
	int sumOfDigit(String n) 
	{   int sum=0;
		for(int i=0;i<n.length();i++) 
		{  int k=n.charAt(i);
			if(k>=48&&k<=57) 
			{
				sum=sum+k-48;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Prog65_sumOFnumber_inString sp=null;
		sp=new Prog65_sumOFnumber_inString();
	    System.out.println(sp.sumOfDigit("14san3"));
	    sp=null;
	    
	}

}
//char ch=n.charAt(i);int k=(int)ch;