package Timepass_s;

public class SumString 
{
     public static void main(String[] args) 
     {
	System.out.print("ENTER THE STRING = ");
	java.util.Scanner s=new java.util.Scanner(System.in);
	String name=s.nextLine();
     int le=name.length();
     int c=0,sum=0;
	
	for(int i=0;i<=le-1;i++) 
	{
		char ch=name.charAt(i);
		int k=(int)ch;
		if(k>=48 && k<=57) 
		{
			System.out.print(ch);
			c++;
			sum=sum+(int)ch;
		}
	}System.out.println("c="+sum);
	
	

	s.close();
	 }
}
