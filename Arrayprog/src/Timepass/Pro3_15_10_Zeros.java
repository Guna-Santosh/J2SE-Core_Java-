package Timepass;
import java.util.Scanner;
public class Pro3_15_10_Zeros 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		System.out.print("a[i] size = ");
		Scanner s=new Scanner(System.in);
		int size =s.nextInt();
		Integer[] a=new Integer[size];
		Integer[] b=new Integer[a.length];  
		for(int i=0;i<size;i++) 
		{
			a[i]=s.nextInt();
		}int k=0;
		for(int i=0;i<size;i++) 
		{
			if(a[i]==0) 
			{
				b[k]=a[i];k++;
			}
		}
		for(int i=0;i<size;i++) 
		{
			if(a[i]==0)continue;
		System.out.print(a[i]+" ");
		}
		for(int i=0;i<k;i++)
		{System.out.print(b[i]+" ");}
	}
}
//0 0 1 0 2 0 5 0 6