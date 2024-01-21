package test;

public class MyCalculator implements AdvanceArthimetic
{
	
	public int divisor(int n) {
		int sum=0;String s1="";
		for(int i=1;i<=n;i++)
	    if(n%i==0)
	    {
	    	sum+=i;
	        s1=s1+i+"+";
	    }
		System.out.print(s1.substring(0,s1.length()-1)+"=");
		return sum;
	}
	public static void main(String[] args) 
	{
		MyCalculator mc =new MyCalculator();
		System.out.println(mc.divisor(6));
		//AdvanceArthimetic.main(args);
		
    }
}
