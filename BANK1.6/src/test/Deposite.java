package test;

public class Deposite implements Transaction
{
    public void process(int amt) 
    {
	   System.out.println("Amt deposite :"+amt);	
       b.bal=b.bal+amt;
       b.getBalance();
       System.out.println("\nTransaction Completed....");
    
    
    }
      
}
