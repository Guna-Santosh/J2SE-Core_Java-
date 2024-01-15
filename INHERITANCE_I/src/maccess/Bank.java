package maccess;
import test.PinNo;
import test.WithDraw;

import java.util.Scanner;

public class Bank 
{
public static void main(String[] args) {
	
	
	System.out.print("ENTER PINNO = ");
	Scanner s = new Scanner(System.in);
	int PinNo=s.nextInt();
	PinNo pn=new PinNo();
	boolean k=pn.verify(PinNo);
	if(k) 
	{
		System.out.println("SELECT 1 OPTION");
		System.out.println("1.WithDraw\n2.Deposit");
		switch(s.nextInt()) 
		{
		case 1:
			WithDraw wd=new WithDraw();
			
			
			break;
		case 2:
			break;
		
		
		}
		
		
		
	}
	else 
	{
		System.out.println("INVALID PIN....");
	}
	s.close();
	
	
}//end of main
}//end of class
