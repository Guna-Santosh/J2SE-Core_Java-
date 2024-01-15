package TEST;
public class OuterClass 
{
   int a=10;
   static int b=20;
   static void m11() 
   {
	  // System.out.println(a);
	   System.out.println(b);
   }//end of sm()
   void m1() 
   {
	   System.out.println(a);
	   System.out.println(b);
  //----------------inside side method creating class--------
     class InnerClass
     {
    	void m2() 
    	{
    		System.out.println(a);
    		System.out.println(b);
    	}
      }//end of innerclass
      InnerClass ic=new InnerClass();
      ic.m2();
    }//end of nsm()
   static void m22() 
    {
	   class InnerClass2
	   {
		  void m222() 
		  {
			  //System.out.println(a);
			  System.out.println(b);
		  } 
	   }
	   InnerClass2 ic2= new InnerClass2();
	   ic2.m222();
     }//end of ocsm()
   
   
   
}//end of oc
