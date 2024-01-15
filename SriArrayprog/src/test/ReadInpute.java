package test;

import java.util.Scanner;


public class ReadInpute
{
   public void read(Scanner s,Customer ob2) 
   {
System.out.print("ENTER THE CODE = ");ob2.id=s.nextLine();

System.out.println("ENTER THE NAME = ");ob2.name=s.nextLine();

System.out.println("ENTER CITY = ");ob2.city=s.nextLine();
	  
System.out.println("ENTER MAILID = ");  ob2.ob.mailId=s.nextLine();
	  
System.out.println("ENTER PHN = "); ob2.ob.phno=s.nextLong();
	  
   }
}
