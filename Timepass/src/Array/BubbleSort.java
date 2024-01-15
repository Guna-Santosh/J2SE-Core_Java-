package Array;
import java.util.Scanner;
public class BubbleSort {

//	public boolean sameFirstLast(int[] nums)
//	{
//		   if(nums[0]==nums[nums.length-1]|| nums==null)
//		   return true;
//		  
//		  else return false;
//	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		BubbleSort bs=new BubbleSort();
//		  int nums[]=new int[3];
//		  for(int i=0;i<nums.length-1;i++)
//			  nums[i]=s.nextInt();
//		  System.out.println(bs.sameFirstLast(nums));
//		
		
		
//		int a[][]=new int[3][3]	;
//	for(int i=0;i<a.length;i++)
//	{
//	  for(int j=0;j<a.length;j++) 
//	  {
//		  a[i][j]=s.nextInt();
//	  }	
//	
//	}
////	for(int i=0;i<a.length;i++) 
////	{
////		for(int j=0;j<a.length;j++) 
////		{
////			System.out.print(a[i][j]+"\t");
////		}  System.out.println("\n");
////	}System.out.println();
//	for(int i=0;i<a.length;i++) 
//	{
//		for(int j=a.length-1;j>=0;j--) 
//		{
//			System.out.print(a[j][i]+" ");
//		}  System.out.println(" ");
//	}
//	
//	String str1 = "geeksforgeeks"; 
        System.out.print("enter string = ");
		String str2 = s.nextLine();
        String str3 = "wrong"; 
        //int k=str2.length()/2;
        //int result=
          //System.out.println(str2.charAt(k));
         // System.out.println(str2.substring(str2.length()/2));
//	      System.out.println(str2.substring(1));
//	      System.out.println(str2.substring(str2.length()-2));
//	      System.out.println(str2.substring(0,str2.length()-2));
//	      System.out.println(str2.substring(str2.length()-1));
//	      System.out.println(str2.substring(0,1));
	      //System.out.println(str2.substring(1, str2.length()-1)); 
        for(int i=0;i<str2.length();i++)
        {
           for(int j=0;j<str3.length();j++) 
           {	
        if(str2.charAt(i)==str3.charAt(j))continue; 
        {
        	
        }
        }
           }System.out.println(str2);
	}

}
