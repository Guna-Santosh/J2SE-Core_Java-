package Array;

public class Insert {
public static void main(String[] args) {
	System.out.print("size");
	java.util.Scanner s=new java.util.Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	int arr2[]=new int[arr.length+1];
	System.out.println("ënter array elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
		
	}
	int a=0;
	for(int i=0;i<arr.length;i++)
	{
		arr2[a]=arr[i];
		a++;
	}
	
	System.out.println("enter index want to insert");
	int index=s.nextInt();
	System.out.println("enter element want insert");
	int ele=s.nextInt();
	for(int i=arr2.length-1;i>index;i--)
	{
		arr2[i]=arr2[i-1];
	}
	arr2[index]=ele;
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * int size =s.nextInt(); int[] a=new int[size]; for(int i=0;i<a.length;i++)
	 * a[i]=s.nextInt();
	 * 
	 * int[] b=new int[a.length+1]; int j=0; for(int i=0;i<b.length;i++) {
	 * b[j]=a[i]; j++; } for(int i=0;i<b.length;i++) System.out.println(b[i]);
	 * 
	 */
	
     }
}
