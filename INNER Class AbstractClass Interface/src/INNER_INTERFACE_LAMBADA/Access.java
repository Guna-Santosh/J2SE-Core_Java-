package INNER_INTERFACE_LAMBADA;
import INNER_INTERFACE_LAMBADA.ctest.Itest;
class ctest
{
   interface Itest
   {
	    void m1();//automatically public,abstract,
	    default void m11() 
	    {  
	    	System.out.println("its working");   m1111();
	    }
	    static void m111() 
	    {
	    	System.out.println("its me");
	    }
	    private void m1111() 
	    {
	    	System.out.println("ow my god");
	    }
	   default void m5()     
	   {
		   m1111();
	   }
   }//end of interface	
}//end of class
//---------------class INSIDE interface-------------------
		interface Itest1
		{
			interface Itest2
			{
			   void m2();	
			}//end of itest2(IInter)
		}//end of itest1(OI)
//--------------interface INSIDE interface----------------
abstract class actest
{
	interface Itest
	{
		void m3();
	}//end ofItest
}//end of ac
//---------abstract class INSIDE interface----------------
public class Access 
{
	public static void main(String[] args) 
	{
         ctest.Itest ob=()->
         {
        	 System.out.println("hii");
         }; ob.m1();ob.m11(); Itest.m111(); ob.m5();
         //----object of class to inter 
         Itest1.Itest2 ob1=()->
         {
        	 System.out.println("how ru");
         };ob1.m2();
         //object of interface to interface
         actest.Itest ob2=()->
         {
        	 System.out.println("bye");
         };ob2.m3();      
	}//end of main
}//end of main class