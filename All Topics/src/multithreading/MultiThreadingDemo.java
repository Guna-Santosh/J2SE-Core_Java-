package multithreading;
@SuppressWarnings("static-access")
public class MultiThreadingDemo extends Thread
{	
	public void run() 
	{
		System.out.println("chinni");
		synchronized (this) 
		{
		  for (int i = 0; i < 5; i++) 
		  {			
			System.out.println("hijhy");
			try 
			{
				this.sleep(1000);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		  }
		}
		System.out.println("khj");
	}
//	public void MultiThreadingDemo() 
//	{
//		synchronized (MultiThreadingDemo.class)  
//		{         
//			
//		} 
//	}
	public void MultiThreadingDemo() 
	{
		synchronized (this)  
		{   
//			for(int i=0;i<9;i++) {System.out.println("byee ");}
		System.out.println("Hii");
		} 
	}
	public static void main(String[] args) 
	{
		new Thread(()->{System.out.println("hi");}).start();
		
		System.out.println("akki");
		MultiThreadingDemo ob=new MultiThreadingDemo();
		Thread t=new Thread(ob);
		t.start();

	}

}
