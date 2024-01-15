package Timepass;
import java.util.Scanner;
public class delectele {

	public static void main(String[] args) {
		
		int z = 0;
Scanner s=new Scanner(System.in);
		System.out.println("size ");
		int size =s.nextInt();
		int[] a= new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("enete k");@SuppressWarnings("resource")
		int ele=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
		for(int i=0;i<size;i++)
		{
			if(ele==a[i]) continue;
//			{
//			   for(int j=i;j<a.length-1;j++)
//			   {
//				a[j]=a[j+1];     
//			   }
//		
//		    } 
			System.out.println(a[i]);
	}
//		for(int i=0;i<a.length-1;i++)
//		System.out.print(a[i]+" ");
//		
	}

}/*if(ele==a[i]) continue;//index delete process
//if(ele==a[i])continue;//ele delete process
*/