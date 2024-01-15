package test;
public class SubClass1 //1ST CLASS
{
    public int a=10;
    public static int  b=20;
    public void m1() 
    {
    	System.out.println("OUTER CLASS m1()...");
    	System.out.print("a = "+a);
    	System.out.println("b = "+b);
    	
    }//outer class m()
    public class SubClass2//2ND class 
    {
    	public void m2() 
    	{
    		System.out.println("INNER CLASS m2().....");
    		System.out.println("a : "+a);
    		System.out.println("b : "+b);
    		
    	}//eof IC_m2()
    	public static void m22() 
    	{
    		System.out.println("INNER CLASS m22()...");
    		//System.out.println("a : "+a);// er 
//    bcz we cant acess non static variable inside the static m()
    	    System.out.println("b : "+b);
    	}//eof IC_m22()
    }//end of INNER CLASS
}//1st class(outer class)
