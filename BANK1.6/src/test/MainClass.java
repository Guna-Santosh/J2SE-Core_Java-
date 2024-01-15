package test;
import test.*;
import java.util.*;
public class MainClass {
	public static void main(String... args) {
		Scanner s=new Scanner(System.in);
	    Date d= new Date();
	    System.out.println("Date - Time  of Tranaction :"+d.toString());
	    int count=0;
	    xyz:
	    	while(true) 
	    	{
	    		System.out.print("Enter PinNo = ");
	    		int pinno= s.nextInt();
	    		CheckPinNo cpn=new CheckPinNo();
	    		if(cpn.verify(pinno)) 
	    		{
	    			System.out.println("====choice====");
	    			System.out.println("1.WithDraw\n2.Deposit");
	    			System.out.print("Enter the choice = ");
	    			switch(s.nextInt()) 
	    			{
	    			case 1:
	    				System.out.print("Enter the amount = ");
	    				int amount1=s.nextInt();
	    				if(amount1>0&&amount1%100==0) 
	    				{
	    					System.out.println("SANTOSH");
	    					WithDraw wd=new WithDraw();
	    					wd.process(amount1);
	    				}//end of if
	    				else {System.out.println("Invalid amt...");}
	    				break xyz;
	    			
	    			case 2:
	    				
	    				System.out.print("Enter the amount = ");
	    				int amount2=s.nextInt();
	    				if(amount2>0&&amount2%100==0) 
	    				{
	    					Deposite dp=new Deposite();
	    					dp.process(amount2);
	    				}//end of if
	    			break xyz;
	    			default :
	    				System.out.println("invalid choice.....");
	    			break xyz;
	    			}//switch case
	    			
	    		}//end of if 
	    		else 
	    		{
	    			System.out.println("Invalid pin....");count++;
	    		}if(count==3) 
	    		{
	    			System.out.println("your account is blocked ");break;
	    		}//end of if
	    	}//end of while
	}//wnd of main()
}//end of class
