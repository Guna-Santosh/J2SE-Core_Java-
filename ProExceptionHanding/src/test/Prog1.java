package test;
class pohk
{
    void process(int amt) 
    {
    	try 
    	{
    		if(amt<=0) 
    		{
    			Prog1 ob=new Prog1("not valid ");
    			throw ob;
    		}
    		
    	}
    	catch(Exception e ) {e.printStackTrace();}
    	
    }	
}
public class Prog1 extends Exception
{
	Prog1(String msg)
	{
		super(msg);	
	}
    void process(int amt) throws Prog1 
    {
    	try 
    	{
    	  if(amt<=0) 
    	  {
    		  Prog1 ob=new Prog1("not valid ");
    		  throw ob;
    	   }
    		
    	}
    	catch(Prog1 ob)
    	{
    		throw ob;
    		
    	}    
    	
    }
    	
	public static void main(String[] args) 
	{
		Prog1 sp=new Prog1("invalid");
		
		try 
		{
			
			sp.process(-2);
		}
		catch (Prog1 e) 
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
