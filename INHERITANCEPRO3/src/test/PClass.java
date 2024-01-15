package test;

public class PClass
{
	 public int a;//instance variable
	 public static int b;
	    public PClass(int a,int b)//par-constructer 
	    {
	    	this.a=a;//instance var &par-con r same that y we use this.
	    	PClass.b=b;//
	    }//constructer
	        public void m1() 
		    {
			   System.out.println("PClass:n-s-m()");
			   System.out.println(a);
			   System.out.println(b);
	    	}
	        public static void m11()
	        {
	        	System.out.println("PClass:s-m()");
	            //System.out.println(a);//ce, bcz n-s-v we can't access in static m()
	        	System.out.println(b);
	        } 
}//end of class
