package Timepass;
import java.util.Scanner;
interface Boss
{abstract void m1(int sum) ;}
public class Pro115_11_22
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("a[] size = ");
		int n=s.nextInt();
		//int sum=0;
		int[]a=new int[n];
		Boss ob=(int sum)->
		{
			
			for(int i=0;i<a.length;i++) 
			{
				a[i]=s.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
			  sum+=a[i];
			   
			}
			for(int i=0;i<a.length;i++) {
				sum+=10;
			System.out.println(sum);}
		};
		ob.m1(0);
	}
}
