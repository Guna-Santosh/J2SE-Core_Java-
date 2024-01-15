package Screaning_test;

class DriverManager
{
   private static DriverManager ob=null;
 
private DriverManager() {}
static 
{
  ob=new DriverManager();
}

public static DriverManager getConnection() 
{
  return ob;	
}
private void dis() 
{
}
}


public class Single 
{

	public static void main(String[] args) {
		DriverManager ob=DriverManager.getConnection() ;
		DriverManager ob1=DriverManager.getConnection() ;
	    System.out.println(ob);
	    System.out.println(ob1);
	}

}
