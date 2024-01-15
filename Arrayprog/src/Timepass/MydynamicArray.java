package Timepass;

import java.util.Scanner;

public class MydynamicArray 
{
	int []f=null;
     int count=0;
     
     MydynamicArray (int n)
     {
    	f=new int[n]; 
     }
     
     void add(int a) 
     {
    	 f[count]=a;
         count++;
     if(count==f.length) 
     {
    	 
     }
     
     }
		
		
	
	
	
	public static void main(String[] args) 
	{
		MydynamicArray ob=new MydynamicArray(5);
		
	}

}
