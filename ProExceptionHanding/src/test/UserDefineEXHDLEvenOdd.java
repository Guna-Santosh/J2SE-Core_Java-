package test;

@SuppressWarnings("serial")
public class UserDefineEXHDLEvenOdd extends Exception
{     		 
    UserDefineEXHDLEvenOdd(String msg)//constructor
	{super(msg);}
      String checkNumberEO(int n) 
      { 
    	  String m="";
    	  try {
    		  
    		  if(n<=0) 
    		  {
    			  //----model 1-------
    			  throw new UserDefineEXHDLEvenOdd("only positive");
    			  //----model 2-------
    			  //UserDefineEXHDLEvenOdd ob=new UserDefineEXHDLEvenOdd("only positive");
    			  //throw ob;
    			  //both will work
    		  }
    		  m=(n%2==0)?"even":"odd";
    	  }
    	  catch(UserDefineEXHDLEvenOdd ob) //user define
    	  {
    		  ob.printStackTrace();
    		  System.out.println(ob.getMessage());//only line 17 msg will print
    		  System.err.println(ob.toString());//package name,class name,line 17
    		  
    	  }
    	  finally {}
    	  return m;
      }
	public static void main(String[] args)
	{
		UserDefineEXHDLEvenOdd ob=new UserDefineEXHDLEvenOdd("");
		
		System.out.println(ob.checkNumberEO(2));
	}

}
