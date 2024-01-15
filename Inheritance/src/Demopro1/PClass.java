package Demopro1;

public class PClass 
{
  public int a=10;
  public static int b=20;
   static 
   {
    	System.out.println("PClass static block");
        System.out.println("b = "+b);//20   
    }//end of static  
   {   
	   System.out.println("PClass Instance block");
	   System.out.println("a = "+a);//10
       System.out.println("b = "+b);//20
   }//end of non static block
   public static void m1() 
   {
	   System.out.println("Pclass static m1()");
       System.out.println("b = "+b);
   }//end of static m()
   public void m22() 
   {
	   System.out.println("PCLass instance m1()");
       System.out.println("a = "+a);
       System.out.println("b = "+b);
   }//end of non static m()
   public String m()
   {
   	System.out.println("hii iam PClass");	    	return "";
   }
   public int m8() 
   {
   	System.out.println("bye PClass");
   	return 0;
   }
   
}//end of class
