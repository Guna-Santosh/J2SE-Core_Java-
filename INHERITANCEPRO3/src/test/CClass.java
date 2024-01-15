package test;

public class CClass extends PClass
{
    public CClass(int a,int b)//par-constructer 
    {
    	super(a,b);
    }//constructer
        /*public void m1() 
	    {
		   System.out.println("CClass:n-s-m()");
		   System.out.println(a);
		   System.out.println(b);
    	}*/
        public static void m11()
        {
        	System.out.println("CClass:s-m()");
            //System.out.println(a);//ce, bcz n-s-v we can't access in static m()
        	System.out.println(b);
        } 
}//end of class
