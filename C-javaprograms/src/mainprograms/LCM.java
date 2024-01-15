package mainprograms;
import java.util.Scanner;
public class LCM {
 LCM(int a,int b)
 {int big,small;
	 
	 {int c=0;
	 if(a>b) {
		  big=b;
		  small=a;}
		  else 
		  {
			 small=b;
			 big=a;
		  }
	 
		  for(int i=1;i<=big;i++)
			  if(((big*i)%small)==0) {
				  int lcm=big*i;
             System.out.println(lcm);
				 break;			  
			  }
			 
	 //}//end of if
	 }//end of for loop
 }//end of lcm
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE a VALUE = ");
		int a=s.nextInt();
		System.out.print("ENTER THE b VALUE = ");
		int b=s.nextInt();
		
		LCM l=new LCM(a,b);
	
	}//end of main()
}//end of class
