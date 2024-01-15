package pistring;
import java.util.Scanner;
public class AlphabetOrNot 
{
	public static void main(String[] args) 
	{
     System.out.print("ënter the alphabet:");
     Scanner s=new Scanner(System.in);
     char ch=s.next().charAt(0);
     if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
    	 System.out.println(ch+" is alphabet");
     else 
    	 System.out.println(ch+" not a alphabet");
	s.close();}

}
