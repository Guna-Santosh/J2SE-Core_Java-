package Labpdf1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//public class pro1 
//{
////	int  modifyNumber() 
////	{    String str="";
////	    for(int i=0;i<str.length();i++) 
////	    {
////	    	
////	    }
////	   return 0;
////	}	
////	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	boolean k=true;
////	     System.out.print("ENTER STRING = ");	
////		 Scanner s=new Scanner(System.in);
////		 String str=s.next();
////         for(int i=0;i<str.length()-1;i++)		
////         {
////        	 if(str.charAt(i)>str.charAt(i+1))k=false;
////        		 
////         }
////		return k;
////		
////-----------------------------------------------------------
////		System.out.print("enter string = ");
////		Scanner s=new Scanner(System.in);
////		String s1=s.next();
////		for(int i=0;i<s1.length();i++)
////		{
////			char c=s1.charAt(i);System.out.print(c);
////		}System.out.print(" | ");
////		for(int i=s1.length()-1;i>=0;i--)
////		{
////			char m=s1.charAt(i);System.out.print(m);
////		}
//	
//     public static void main(String[] args) 
//     {
////        pro1 p=new pro1();
////       System.out.println( p.modifyNumber());
//    	 String str=null;
//    	 switch(str)
//    	 
//    	 {
//    	 case "null":
//    		 System.out.println("null string");
//    		 break;
//    	 }    	 
//    	 
//     }
//}




import java.util.Scanner;

@SuppressWarnings("unused")
public class Prog74_Solution_HRank_pavan {

    public static String getSmallestAndLargest(String s, int k) 
    {
        String s1="";
        int c=s.length()-k+1;
        String s2[]=new String[c];
	    for(int i=0;i<s.length()-2;i++) 
	    {
	      s2[i]=s.substring(i,(i+k))+" ";	
	      System.out.print( s.substring(i,(i+k))+" ");
	    }
	    Arrays.sort(s2);   
	    System.out.println("\n-------------------------------------------");
	    for(String h:s2)
	    System.out.print(h);
	    return  "";
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();                                               
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
      
    }
}
//        float b=1_2.3_3f;
//        System.out.println(b);
//        int a=9_9_9;//after java 7 version
//        int a33=0x1a;
//        System.out.println(a33);
//        System.out.println(a);
//        Integer i5 = new Integer(10);
//        Integer i1 = new Integer(10);
//        Integer i2 = 10;
//        int i3=10;
//        System.out.println(i1.equals(i2));
//        System.out.println(i1==i3);
//        System.out.println(i2==i3);
//        System.out.println(i1.equals(i5));
//        System.out.println(i1.hashCode());
//        System.out.println(i2.hashCode());

// ArrayList<String> ob=new ArrayList<String>();
//s1=s.substring(i,(i+k))+" ";
// ob.add(s1);



//        String smallest = s.substring(0,k);
//        String largest = "";

// Complete the function
// 'smallest' must be the lexicographically smallest substring of length 'k'
// 'largest' must be the lexicographically largest substring of length 'k'

//        for(int i=0;i<s.length();i++) 
//        {
//        	for(int j=0;j<k;j++)
//        	smallest+=s.charAt(i);
//        	
//        		
//        }
//  System.out.print(smallest);

//        for(int i=0;i<=s.length()-k;i++)
//        {
//            if((s.substring(i,i+k).compareTo(smallest))<=0)
//            {
//                smallest = s.substring(i,i+k);
//            }
//            if((s.substring(i, i+k).compareTo(largest))>=0)
//            {
//                largest = s.substring(i, i+k);
//            }
//        }
//        
//        String small = s.substring(0,k);
//        String large = s.substring(0,k);
//        for(int i=0;i<=s.length()-k;i++){
//            String nextChar = s.substring(i, i+k);
//            if(small.compareTo(nextChar)>0){
//                small= nextChar;
//            }
//            if(large.compareTo(nextChar)<0){
//                large=nextChar;
//            }
//        }
//        System.out.println(small);
//        System.out.print(large);
//    
//        return small+ "\n" + large;
//    	String smallest = s.substring(0, k);
//        String largest = s.substring(0, k);
//        String str, result;
//        
//         for(int i = 0; i <= s.length() - k; i++) {
//             
//             str = s.substring(i, k + i);
//             if(str.compareTo(smallest) < 0) {
//                 smallest = str;
//             }
//             if(str.compareTo(largest) > 0) {
//                 largest = str;
//             }   
//         }
//         result = smallest + "\n" + largest;
//         return result;