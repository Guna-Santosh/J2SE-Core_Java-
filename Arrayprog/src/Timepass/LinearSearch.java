package Timepass;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
     System.out.print("a[i] size ");
     Scanner s=new Scanner(System.in);
     int size =s.nextInt();
     int[] a=new int[size];
     for(int i=0;i<a.length;i++)
     a[i]=s.nextInt();
     System.out.print("key = ");
     int k=s.nextInt();boolean p=false;int i;
     for(i=0;i<size;i++)
    	 if(a[i]==k)
    	 {   p=true;
    		 break;
    	 }
     if(p) {
    	 System.out.println(i);
     System.out.println("found "+(i+1));}
     else {System.out.println("not found");}
    	 
    	 
    	 
	}

}
