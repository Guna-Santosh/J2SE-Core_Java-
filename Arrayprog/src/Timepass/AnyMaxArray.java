package Timepass;import java.util.Arrays;import java.util.Scanner;
public class AnyMaxArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER a[] size = ");
		int size=s.nextInt();
//         int[] a= new int[] {9,8,9,4,5,3,8,7,1,2,1,1,2};
         int[] a= new int[size];
         for(int i=0;i<a.length;i++)
        	 a[i]=s.nextInt();
         for(int i=0;i<a.length;i++)
         {
        	 for(int j=0;j<a.length;j++) 
        	 {
        		 if(a[i]>a[j])
        		 {
	        		 int c=a[i];
	        		 a[i]=a[j];
	        		 a[j]=c;
	        	 }
        	 }
         }
         for(int i=0;i<a.length;i++)
         System.out.print(a[i]+" ");
        // Arrays.sort(a); 
         int b[]=new int[a.length];int k=0;
         //System.out.println("a["+a.length+"] = "+Arrays.toString(a));
         for(int i=0;i<a.length;i++) 
         {   int c=0;
           for(int j=i+1;j<a.length;j++) 
           {
        	 if(a[i]==a[j])c++;
           }
        	   if(c==0) 
        	   {
     		    b[k]=a[i];
        	    k++;
          	   }
         }
         for(int i=0;i<k;i++)
         {
        	// System.out.print(b[i]+" ");
         }
         System.out.print("\nEnter min number = ");
         int s2=s.nextInt()-1;
         System.out.println(s2+1+" max value in array is "+b[s2]);
	}
}

//        	for(int k=0;k<b.length;k++) 
//        	{
//        		b[k]=a[i];
//        		m++;
//        	}
//        	for(int z=0;z<m;z++)
//        	System.out.print(b[z]);
//        	 