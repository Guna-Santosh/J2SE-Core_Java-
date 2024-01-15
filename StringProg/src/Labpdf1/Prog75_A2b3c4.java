package Labpdf1;
import java.util.Scanner;
public class Prog75_A2b3c4 
{	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String s1="a5b3c4";
		System.out.println("input is = "+s1);
		for(int i=0;i<s1.length()-1;i=i+2) 
		{
			int n=Integer.parseInt(""+s1.charAt(i+1));			  
			for(int j=1;j<=n;j++) 
			{
				System.err.print(s1.charAt(i));	
			}		
		}
	    System.out.println("\n-----------------------------------------------------");
		int j=1;int i;
		String s2="aabbbcccc";
		System.out.println("input is = "+s2);
		for(i=0;i<s2.length()-1;i++) 
		{
			if(s2.charAt(i)==s2.charAt(i+1))j++;
			else 
			{
				System.err.print(s2.charAt(i-1)+""+j);
			    j=1;
			}
		}
		System.err.println(s2.charAt(i-1)+""+j);
			}

}
