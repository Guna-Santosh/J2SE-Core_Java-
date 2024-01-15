package task;

class A
{
   public  static A ob=null;
   final  int a;
   final int b;
   
   {
	   a=10;
   } 
   
   void m1() 
   {
	   //a=10;
   }  
   
   A()
   {
	   b=10;   
   }
   
   public static A get() 
   	{
   		 
   		 
   		 
   		 
//   		 if(ob==null)
//   		{  
//   			 ob=new A();
//   			 return ob;
//   		}
//   		 else return ob; 
   		 return ob;
   	}
	
}



public class B {

	public static void main(String[] args) 
	{  A ob=new A();
	int c=ob.a;
	int m=ob.b;
		System.out.println(c);
		System.out.println(m);
		
	      System.out.println(A.get());	
	      System.out.println(A.get());
	}

}
