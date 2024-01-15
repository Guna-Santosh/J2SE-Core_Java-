package test;
import java.util.Date;
import java.util.Scanner;
public class AnonymousMain {
	public static void main(String[] args) {
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
	    			System.out.print("Enter the choice");
	    			switch(s.nextInt()) 
	    			{
	    			case 1:
	    				System.out.print("Enter the amount = ");
	    				int amount1=s.nextInt();
	    				if(amount1>0&&amount1%100==0) 
	    				{
	    					System.out.println("SANTOSH");
	    	/***********/	Transaction wd =new Transaction() 
	    					{
	    						public void process(int amt) 
								{
	    							if(amt<=b.bal) 
	    					        {
	    					    	      System.out.println("You WithDrawn :"+amt);
	    					    	      b.bal=b.bal-amt;
	    					    	      b.getBalance();
	    					    	      System.out.println("\nTransaction Completed...");
	    					    	     // System.out.println("ur balance amount is :"+b.bal);
	    					        }
	    					    	else {System.out.println("Insufficient Fund...");}   	
								}
	    					};
	    					wd.process(amount1);
	    				 }
	    					else {System.out.println("Invalid amt...");}
		    				break xyz;
	    			case 2:
	    				System.out.print("Enter the amount = ");
	    				int amount2=s.nextInt();
	    				if(amount2>0&&amount2%100==0) 
	    				{
	    /***********/      Transaction dp=new Transaction() 
	    					{
								public void process(int amt) 
								{
									System.out.println("Amt deposite :"+amt);	
								       b.bal=b.bal+amt;
								       b.getBalance();
								       System.out.println("\nTransaction Completed....");
								}
	    					};
	    					dp.process(amount2);
	    				}
	    				else {System.out.println("Invalid amt...");}
	    				break xyz;
	    				default :
	    					System.out.println("invalid choice.....");
	    	    			break xyz;
	    				}//end of switch
	    			}//end of if
	    		else 
	    		{
	    			System.out.println("invalid pin....");
	    			count++;
	    		}
	    		     if(count==3) 
	    		     {
	    		    	 System.out.println("ur account is block...");break;
	    		     }	
	    	}
	    }
	}


