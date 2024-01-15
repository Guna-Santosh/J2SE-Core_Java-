package test;
import java.util.*;
public class Pro1 
{
int[] weavingArrayElements(int[] a,int[] b) 
{   
	int c[][]= {a,b}; 
	int arr[]=new int[a.length+b.length];
	int j=0;
	System.out.print("c[] = ");
	for(int k[]:c)     
	{  
		for(int s:k) 
		{  arr[j]=s; j++;  }
	}
	Arrays.sort(arr);
	for(int l=0;l<arr.length;l++)
	   System.out.print(arr[l]+" ");
	return arr;
}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    System.out.print("a[] = ");
		int a[]=new int[4];
		for(int i=0;i<a.length;i++)
		a[i]=s.nextInt();
		//--------1st array---------
		System.out.print("b[] = ");
		int b[]=new int[4];
		for(int k=0;k<b.length;k++)
			b[k]=s.nextInt(); 
		//----------2nd array-------
		Pro1 p=new Pro1();
		p.weavingArrayElements(a, b);
		//int c[]=p.weavingArrayElements(a, b);
		//for(int k:c)
		//System.out.print(k+" ");
//		System.out.println();
//		System.err.print("Error: Main method not found in class test.Pro1, please define the main method as:\r\n"
//				+ "   public static void main(String[] args)\r\n"
//				+ "or a JavaFX application class must extend javafx.application.Application\r\n"
//				+ " ");
//		System.err.println("Error:java.line.38");
		
	}

}
// a[]=10 20 30 40 
//b[]=15 25 35 45
//c[]=10 15 20 30 35 40 45 

//	System.out.println(ob);

//	for(int i=0;i<a.length;i++) 
//	{ c[j]=a[i]; j++; }
//	
//	for(int i=0;i<b.length;i++) 
//	{c[j]=b[i];j++;}


//System.out.println(Arrays.toString(k));

//System.out.print(s+" ");	
//Arrays.sort(k);
//	Arrays.sort(c);
//	for(int i=0;i<(a.length)+(b.length);i++) 
//	{ System.out.print(c[i]+" "); }