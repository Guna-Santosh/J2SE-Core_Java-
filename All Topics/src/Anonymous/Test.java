package Anonymous;

import java.util.Arrays;
import java.util.Spliterator;

interface A
{
	public void m1();
	default void m2() 
	{
		System.out.println("bye");
	} 
}
public class Test 
{
  public static void main(String[] args) 
  {
	  Spliterator on=Arrays.spliterator(args);
	  on.forEachRemaining(p->{System.out.println(p);});
		A ob=new A()
		{
		    public void m1() 
			{
				System.out.println("hii");
			}
		};
		ob.m1();
		ob.m2();
	}

}
