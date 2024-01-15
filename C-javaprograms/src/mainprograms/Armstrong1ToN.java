package mainprograms;
import java.util.Scanner;
public class Armstrong1ToN 
{
  static void find1$nArmstrong(int a,int b) 
  {
	  for(int i=a;i<=b;i++)
	  {
		  int num=i,m;
		  int sum=0;
		  int r=0;
		  while(num>0) 
		  {
			  m=1;
			  r=num%10;
			  while(num<0) 
			  {
				  m=m*r;
			  }
			  sum=sum+r;
			  num=num/10;
		  }//end of while
		  if(sum==i) {
			  System.out.println(sum);
		  }
	  }
  }	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER a = ");
		int a=s.nextInt();
		System.out.print("ENTER b = ");
		int b=s.nextInt();
		Armstrong1ToN  am=new Armstrong1ToN ();
		am.find1$nArmstrong(a, b);
	}//end of main
}//end of class
