package test;
public  class OuterClass 
{
      int a=10;
      static int b=20;
      void m1() //not a static method 
      {
	    System.out.println("outerclass = "+a);
	    System.out.println("outerclass = "+b);
	   
      }
      static void  m33() 
      {
    	  //System.out.println(a);
    	  System.out.println(b);
      }
      
    static class InnerClass
    {
	    void m1() 
	    {
		 //System.out.println(a);
		 System.out.println("innerclass nsm() = "+b);
	    }  
	    static void m11() 
	    {
		 //System.out.println(a);
		 System.out.println(b);
	    }
     }//innerclass
}//outclass

