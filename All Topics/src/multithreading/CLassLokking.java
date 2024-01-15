package multithreading;
public class CLassLokking extends Thread
{
	public void run() 
	{
		synchronized (this) 
		{
		 System.out.println("Chinni ");	
		}
	}
	
	static void fresh() {
		System.err.println("brushing");
	}
	
	public static void main(String[] args) 
	{
//	  	System.out.println("HiiiI");
	  	Thread t = new Thread(()->
		  	{
		  		System.out.println("sleeping- free time");
		  		System.out.println("browsing");
		  		System.out.println("instagram reels");
		  		System.out.println("washing clothes");
		  	}
	  				);
	  	t.setDaemon(true);
	  	fresh();
	  	t.start();
	}

}
