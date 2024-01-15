package PavanQuestion;

class A3
{
	int x=m1();
	int m1() 
	{
		System.out.println("A3 method");
		return 10;
	}
	{
		System.out.println("A3 nsb");
	}
	A3()
	{
		System.out.println("A3 constructor");
	}
	
}



public class B3 extends A3
{
    int y=m2();
	int a=10;
    int m2() 
    {
    	System.out.println("B3 method");
    	return 20;
    }
    {
    	System.out.println("B3 nsb");
    }
	B3()
	{
		
		System.out.println("B3 constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main");
        B3 ob=new B3();
//       System.out.println(ob.x);
 //     System.out.println(ob.y);
	}

}
