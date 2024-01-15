package test;
public class getTwinPrime
{
   int TwinPrime(int a,int b)
  {int c,p=0,count=0; String s="";
	   if(a<0||b<0)
	   return -1; 
	   else if(a>100000||b>100000)
		   return -2;
	   else if(a>=b)
		   return -3;
	   else 
	   {
		   for(int i=a;i<=b;i++) 
		   {  c=0;//count everytime 
			  for(int j=1;j<=i;j++) 
			  {
				if(i%j==0) 
			     c++;
			  } 
			  if(c==2) 
			  {
				  if(p==i)
				  {
					count++; 
					s=s+"("+(i-2)+","+p+")  \n"; 
				  }
				  p=i+2;
				}
		   }//end of 1st for loop
	   }//end of else
	   System.out.print(s);
	   System.out.print("COUNT = ");
	return count;
	}
   public static void main(String[] args) 
   {
	java.util.Scanner s=new java.util.Scanner(System.in);
	getTwinPrime gtp=new getTwinPrime();
	System.out.print("ENTER 'a' VALUE = ");
	int a=s.nextInt();
	System.out.print("ENTER 'b' VALUE = ");
	int b=s.nextInt();
	System.out.println(gtp.TwinPrime(a, b));
	s.close();
   }//end of main
}//end of class
