package Demopro1;

public class CClass extends PClass 
{
	  public int a=100;
	  public static int b=200;
	   static {
	    	System.out.println("CClass static block");
	        System.out.println("b = "+b);//200   
	    }//end of static  
	   {   
		   System.out.println("CClass Instance block");
		   System.out.println("a = "+a);
	       System.out.println("b = "+b);
	   }//end of non static block
	   public static void m2() 
	   {
		   System.out.println("Cclass static m1()");
	       System.out.println("b = "+b);
	   }//end of static m()
	   public void m22() 
	   {
		   System.out.println("CCLass instance m1()");
	       System.out.println("a = "+a);
	       System.out.println("b = "+b);
	   }//end of non static m()
	   final public String m()
	    {
	    	System.out.println("hii CCLass");	    	return "";
	    }	
	    public int m8() 
	    {
	    	System.out.println("bye CClass");
	    	return 0;
	    }
	    
}//end of class
