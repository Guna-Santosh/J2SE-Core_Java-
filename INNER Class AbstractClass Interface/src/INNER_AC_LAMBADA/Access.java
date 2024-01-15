package INNER_AC_LAMBADA;
//********************* AB Class inside AB Class*********
abstract class Oabclass
{  
    abstract class Iabclass
    {
    	void m1() 
    	{
    		System.out.println("Iac default m()"); m4() ;
    	}
    	static void m2() 
    	{
    		System.out.println("Iac static m()");
    	}
    	public void m3() 
    	{
    		System.out.println("Iac public m()");
    	}
    	private void m4() 
    	{
    		System.out.println("Iac private m()");
    	}
    	
    	protected void m5() 
    	{
    		System.out.println("Iac protected m()");
    	}
        abstract void m6();   //abstract keyword is paka otherwise com error
    	
    	//default void m5() {}    default not allowed in abclass only interface
    }// Inner abstract class	
} //Outer abstract class
//*************AB Class inside Interface**************
abstract class OabclassI
{
	interface Itest
	{
		abstract void m();  
		public abstract void m1();
//		private abstract void mm();    error
//		default abstract void ms();    error
//		static abstract void mf();     error
//		protected void m5();           error
		private void m2() 
    	{
    		System.out.println("IIF private m()");
    	}
		default void m3() 
		{
			System.out.println("IIF default m()");
		}
		static void m4() 
		{
			System.out.println("IIF static m()");
		}
		
		
  	  //public void m1() {}   error   nrml public method not allowed in interface  
//	  protected void m5() {}  error   nrml protectd method not allowed in interface
		
	}//IIF 
}//abclassOI
//*********************AB Class inside Class****************
abstract class abclassOC
{
  class Iclass
  {
	  void m1() 
  	{
  		System.out.println("Iac default m()");
  	}
  	static void m2() 
  	{
  		System.out.println("Iac static m()");
  	}
  	public void m3() 
  	{
  		System.out.println("Iac public m()");
  	}
  	private void m4() 
  	{
  		System.out.println("Iac private m()");
  	}
  	
  	protected void m5() 
  	{
  		System.out.println("Iac protected m()");
  	}
     //abstract void m6();     not possible to write abstract class.
	//default void m5() {}    default not allowed in class only interface.
  }	
}
//*********************main()**********************
public class Access extends Oabclass
{
	public static void main(String[] args) 
	{ 
		Oabclass ob=new Oabclass(){};
		Oabclass.Iabclass ob1=ob.new Iabclass()
		{
			void m6() 
			{
			  System.out.println("");
		    }
		};
	ob1.m1();      
	}	
}