package test;

public class WithDraw implements Transaction 
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
}
