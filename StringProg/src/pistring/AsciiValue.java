package pistring;
import java.util.Scanner;
public class AsciiValue {

	public static void main(String[] args) 
	{
	  System.out.print("enter the value:");	
	  Scanner s=new Scanner(System.in);
	  char ch=s.next().charAt(0);
	  System.out.println("Ascii value of ("+ch+") is "+(int)ch);
	s.close();}

}
