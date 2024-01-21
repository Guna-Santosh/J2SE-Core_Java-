package test;
public class Prog4 {
	    public static  boolean IsPrime(int a) 
	    {
	    	 if(a<2)
	    	 	 return false;
	    	 for(int i=2;i<a/2;i++)
	    	 {
	    		  if(a%i==0) 
	    			 return false;    
	    	}
	    	return true;
	    }
	  public static void main(String[] args) {
	    int num=4;
		  boolean result= IsPrime(num);
		 if(result) {
			  System.out.println("the num is prime");	  
		 }
		 else {
			  System.out.println("the num is not prime");
		 }
	}
}