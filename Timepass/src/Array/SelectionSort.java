package Array;
public class SelectionSort {
	//BUBBLE SORTING
	public static void main(String[] args) {
		System.out.println("BUBBLE SORTING:");
	    System.out.print("a[i] size = ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int size =s.nextInt();
		int k=0;
		int a[]=new int[size];
		int arr[]=new int[a.length];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			//a[i]=new Integer(s.nextInt());
		}
		for(int i=0;i<size;i++) 
		{
			for(int j=0;j<size;j++)
			{
				if(a[i]<a[j]) 
				{
				    int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.print("after sorting = ");
		for(int i=0;i<size;i++) 
		{
		System.out.print(a[i]+" ");
		}
		
		
		for(int i=0;i<size;i++) 
		{
			int count=0;
			for(int j=0;j<size;j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
				}
			}
			if(count==1) 
			{
				arr[k]=a[i];
			    k++;
			}
		}
		System.out.print("\nnull value = ");
		for(int m=0;m<size;m++)
		{
		       System.out.print(arr[m]+" ");
        }
		System.out.print("\nremoved null = ");
		for(int m=0;m<k;m++)
		{
		       System.out.print(arr[m]+" ");
        }
	}
}
//38 52 9 18 6 9 13 
//1 o/p=   6 9 9 13 18 38 52
//2 o/p=   6 13 18 38 52 