package pistring;
import java.util.Scanner;
public class RemoveOtherThenAlphabets 
{
	public static void main(String[] args) 
	{
		System.out.print("enter the value:");
	    Scanner s=new Scanner(System.in);
	  try(s)
	  {
		String s1=s.nextLine();
//		System.out.println(s1.replaceAll("[^a-zA-Z]", ""));
	  for(int i=0;i<s1.length();i++)
	  if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
//		  if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
	  System.out.print(s1.charAt(i));	  
	  }
	}

}
