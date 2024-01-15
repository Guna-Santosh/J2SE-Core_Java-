package FunctionalINterface;

import java.util.Scanner;

//interface Parent 
//{ 
//public int parentMethod(); 
// default void m1() 
//{
//	
//}
//} 
//@FunctionalInterface 
//interface Child extends Parent
//{ 
//public int childMethod(); 
//}

//interface Parent 
//{ 
//public void parentMethod()
//{ 
//System.out.println("Hello"); 
//} 
//} 
////@FunctionalInterface 
//interface Child extends Parent { 
//public int childMethod(); 
//}

class A
{
	public void m1() 
	{
		System.out.println("hi");
	}
}
class B extends A
{
	


	public void m1() 
	{
		System.out.println("bye");
		
	}
}


public class Demo 
{
	public static void main(String[] args) 
	{ 
		
	      B ob = (B) new A(); 
	      ob.m1();
//			A obn=new A();
//			obn.m1();
			
//			A ob=new B();
//			
//			B ob1=(B) ob;
//			ob1.m1();
			
		
	}

	
//
//	@Override
//	public int parentMethod() 
//	{
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public void m1() 
//	{
//	   	
//	}

}
