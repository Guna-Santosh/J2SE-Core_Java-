package test;
public class Demo {
	public static void main(String[] args) {
		int n=33;
//		System.out.println(n%2);
		switch(n%2) 
		{
		case 0:   
			  for(int i=1;n!=0;n=n/2) 
			  {
				  if(n%i==1) 
				  {
					  System.out.println("it is not power of 2");
			      }break;
			   }   
//			  else
				  System.out.println("it is power of 2");
			break;
		case 1:
			 for(int i=2;i<=n/2;i++) 
			 {
				 if(n%i!=0)
					 System.out.println("it is prime");
				 break;
			 }
			break;
		}
	}

}
