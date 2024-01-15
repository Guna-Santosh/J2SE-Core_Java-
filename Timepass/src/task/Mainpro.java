package task;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Mainpro {

//	public static void main(String[] args) {
//		
//	// TODO Auto-generated method stub
//    System.out.println(a);
//	}
	public static void main(String[] args) 
	{
		String s="santosh jhjs";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')c++;
		}
		System.out.println(c+1);
		
		
		StringTokenizer s1=new StringTokenizer("ghfg ahsg agh ahgs hag");
		System.out.println(s1.countTokens());
	
	
//int a[]= {1,5,8,9,1,9,12,45};
//		for(int i=0;i<a.length;i++) 
//		{
//			int c1=0;
//			for (int j = i+1; j < a.length; j++) {
//				if(a[i]==a[j])c1++;
//			}if(c1==0)
//				System.out.println(a[i]);
//		}
//		int n=2;
//		
//		System.out.println(n+" 2nd largest number : "+a[a.length-2]);
//	
	}
}
