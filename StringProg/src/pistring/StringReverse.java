package pistring;
import java.util.Scanner;
public class StringReverse 
{
	public static void main(String[] args)
	{
	    System.out.print("enter the value:");
	    Scanner s=new Scanner(System.in);
	  try(s)
	  {
		String s2="";String s1=s.nextLine();
		for(int i=0;i<s1.length();i++)
		{
		 s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
	  }
	}
}