package test;

public class Macces {

	public static void main(String[] args) 
	{
		IArithmatic ia=new IArithmatic() 
		{   
			public int cal(int x,int y) 
		   {
			  return x+y;
		   }
		};System.out.println(ia.cal(10, 20));
		
		IArithmatic is=new IArithmatic()
		{
			public int cal(int x, int y) 
			{
				return x-y;
		    }
	    };System.out.println(is.cal(20, 30));		
	    IArithmatic im=new IArithmatic()
		{
			public int cal(int x, int y) 
			{
				return x*y;
		    }
	    };System.out.println(im.cal(50, 20));
	    IArithmatic id=new IArithmatic()
		{
			public int cal(int x, int y) 
			{
				return x%y;
		    }
	    };System.out.println(id.cal(20, 30));
	    IArithmatic imd=new IArithmatic()
		{
			public int cal(int x, int y) 
			{
				return x/y;
		    }
	    };System.out.println(imd.cal(20, 30));
	}

}
