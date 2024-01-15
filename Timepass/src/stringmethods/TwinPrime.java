package stringmethods;
public class TwinPrime {
	public int getTwinPrime(int a,int b) 
	 { int c,p=0,count=0,r=0;;String s="";
		if(a<0||b<0)
		return -1;
		else if(a>1000||b>1000)//interviwer given condition
			return -2;
		else if(a>=b)
			return -3;
		else {
		for (int i=a;i<=b;i++)
		{     
			  c=0;	//everytime count become 0
		  for(int j=1;j<=i;j++) 
			{
				 r=i%j;
			  if(r==0) c++;
			}//end of 2nd for loop
			if(c==2) 
			{
				if(p==i)
				count++;
				p=i+2;
				s=s+i;
			//System.out.println(p);	
			}//end of 
		  }//end of	1st for loop
		}//end of else
		System.out.print("count=");
		return count;
	 }//end of getTwinPrime
    
  public static void main(String[] args)
  {
	System.out.println("ENTER THE 2 NUMBER");
	java.util.Scanner s=new java.util.Scanner(System.in);
	System.out.print("ENTER THE 1ST NUMBER A = ");
	int a=s.nextInt();
	System.out.print("ENTER THE 2ND NUMBER B = ");
	int b=s.nextInt();
	TwinPrime da=new TwinPrime();
	System.out.println(da.getTwinPrime(a, b));
  }//end of main
}//end of class
