package test;

public class DriverManagers 
{
	public static Connecrions getConnect() 
	{
		Connecrions ob=new Connecrions() 
		{
			public void m1(int x) 
			{
				System.out.println("==m1(x)==");
				System.out.println("x = "+x);
			}
		};
		return ob;
	}//END OF refar method()

	
}
