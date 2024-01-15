package PavanQuestion;

public class SmithNumber
{
  public int sumOfDigits(int n) 
  {
	  int sum=0,a;
	 while(n>0) 
	 {   
		 a=n%10;
        sum=sum+a;
		 n=n/10;
	 }
	return sum;
 }

  public int sumOfPrimeFacotors(int n) 
  {  int sum=0,a=0,z;String s1="";
        for(int i=2;i<n;i++) 
        {
        	if(n%i==0) 
        	{
        		s1+=i;
        	}
        }
        a=Integer.parseInt(s1);
        while(a>0) 
        {
        	z=a%10;
            sum=sum+z;
		    a=a/10;
		}
      return sum;
  }
	public static void main(String[] args) 
	{
		SmithNumber ob=new SmithNumber();
		int a=ob.sumOfDigits(10);
		int b=ob.sumOfPrimeFacotors(10);
		  if(a==b) 
		  {
			  System.out.println("SMITH NUMBER....");
		  }
		  else 
		  {
			  System.out.println("NOT SMITH NUMBER....");
		  }
		  
		  
		  
	}
}

//	 for(int i=2;i<=n;i++) 
//	 {int c=0;
//	 for(int j=1;j<=i;j++) 
//	 {
//		 if(i%j==0)c++;
//		 
//	 }
//		 if(c==2)
//			 System.out.println(i);
//	 } 
//	  