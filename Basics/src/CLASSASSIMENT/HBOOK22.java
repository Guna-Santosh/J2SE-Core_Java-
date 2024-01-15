package CLASSASSIMENT;
import java.util.*;
public class HBOOK22 
{
  public static void main(String[] args)
  {
	Scanner s=new Scanner(System.in);
	
	System.out.println("ENTER THE BOOK CODE");
	int bcode=s.nextInt();
	s.nextLine();
	
	System.out.println("ENTER THE BOOK NAME");
	String NAME=s.nextLine();
	
	System.out.println("ENTER THE HAUTHOR NAME");
	String a=s.nextLine();
	
	System.out.println("ENTER THE BOOK PRICE");
	float PRICE=s.nextFloat();
	
	System.out.println("BOOK CODE:"+bcode);
	System.out.println("BOOK NAME IS:"+NAME);
	System.out.println("HAUTHOR:"+a);
	System.out.println("PRICE:"+PRICE);
	s.close();
  }
}
