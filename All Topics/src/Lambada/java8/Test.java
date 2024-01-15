package Lambada.java8;
interface B
{
	public void m1(int a);
	default void m2() 
	{
		System.out.println("bye");
    }
}
public class Test      
{
	public static void main(String[] args) 
	{
		B ob= (int a)->{System.out.println("a = "+a); };
		ob.m1(90);ob.m2();
		
	}
}
