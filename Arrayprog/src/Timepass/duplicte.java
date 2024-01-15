package Timepass;

public class duplicte
{
public static void main(String[] args) {
	System.out.print("a[i] size = ");
    java.util.Scanner s= new java.util.Scanner(System.in);
    int size=s.nextInt();
    int k=0;
    int a[]=new int[size];
    //int b[]=new int [size];
    for(int i=0;i<size;i++) 
    {
   	 a[i]=s.nextInt();
    }
    for(int i=0;i<size;i++) 
    { 
   	 for(int j=0;j<size;j++) 
   	 {                     
   		 if(a[i]==a[j])
   		 continue;
   	 }	 
   	for(int j=0;j<size;j++) 
   	 System.out.println(a[j]);
   //	for(int h:a)
   }
}
}
