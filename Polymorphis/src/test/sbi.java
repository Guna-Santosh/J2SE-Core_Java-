package test;
//DYNAMIC POLYMORPHISM
public class sbi extends Rbi
{
    void intrest(int amt) 
    {
    	System.out.println("iam the boss of sbi banks");
    	System.out.println(amt);
    }
	public static void main(String[] args) 
	{
	   Rbi sb= new sbi(); //p =c()up casting
	   sb.intrest(1000);
	}

}
