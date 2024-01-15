package CLASSASSIMENT;
import java.util.*;
 class HP22
 {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
		System.out.println("enter ur name");
		String name=s.nextLine();
		
		System.out.println("Enter UR Age");
		int age=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter UR Gender");
		String gender=s.nextLine();
		
		System.out.println("Enter UR phone number");
		long phno=s.nextLong();
		s.nextLine();
		
		System.out.println("Enter UR EmailId");
		String emid=s.nextLine();
		
		System.out.println("Enter UR Qualification");
		String q=s.nextLine();
		
		System.out.println("ur name is:"+name);
		System.out.println("ur age is:"+age);
		System.out.println("ur gender is:"+gender);
		System.out.println("ur phone number is:"+phno);
		System.out.println("ur EmailId is:"+emid);
		System.out.println("ur EmailId is:"+q);
		s.close();
	}

}
