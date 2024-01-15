package CLASSASSIMENT;

import java.util.Scanner;
public class HPRODUCT22 
{
  public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
		
	    System.out.println("Product name");
		String pname=s.nextLine();

		System.out.println("Product code");
		int code=s.nextInt();
		
		System.out.println("Product price");
		float price=s.nextFloat();
		s.nextLine();
		
		System.out.println("Product Quantity");
		String q=s.nextLine();
		
		
		System.out.println("Product name:"+pname);
		System.out.println("Product code:"+code);
		System.out.println("Product Price:"+price);
		System.out.println("Quantity:"+q);
  s.close();
  }

}
