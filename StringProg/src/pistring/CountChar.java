package pistring;
import java.util.Scanner;
public class CountChar {
	public static void main(String[] args) 
	{
	   System.out.println("enter the String ");
       try(Scanner s=new Scanner(System.in);)
       {  String s1=s.nextLine();int c=0;
         for(int i=0;i<s1.length();i++) 
         {
        	 c++; 
         }
         System.out.println(c);
         System.out.println(s1.length());
      }
	}
}