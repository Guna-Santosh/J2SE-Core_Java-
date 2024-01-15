package practice;

import java.util.Arrays;

public class pro1 {
	private static Object String;

	public static void main(String[] args) 
	{ 
	  CharSequence a="santosh"; 
	  String f="santosh";
	  
         StringBuffer sb=new StringBuffer(f);     
		 //System.out.println(sb.appendCodePoint(65));//asii values
		
//		 String sb1="santosh"; System.out.println(sb.append(sb,sb.length(),sb.length()));
//		 //System.out.println(sb1.substring(1,5).toUpperCase().concat("nice").substring(2)+sb1);
//		 StringBuffer z=new StringBuffer(sb1);
//		     System.out.print(z.reverse()+" ");
		
		//System.out.println(sb.capacity());
		   String sb2="santosh@guna@deep@sada@hjajk@ajhdkja@hasjha";
		   String[] sb3=sb2.split("@",0);
		   //System.out.println(Arrays.toString(sb3));
		   for(String g : sb3)
		   {     
		       System.out.print(g+" ");
//		       String B=g;
//		       StringBuffer A=new StringBuffer(B);
//		       System.out.println(A.reverse());
		   }
		   
//		   String x="sanapparra"; //w=null;
//		   String r="",h=""; StringBuffer  w=null;
//		  char t[]= x.toCharArray();
//		  for(int i=0;i<t.length;i++) 
//		  {
//			 if(t[i]=='a') 
//			 {   
//		        r=r+t[i];
//		     }
//			 else  
//				 h=h+x.charAt(i);
//			   w = new StringBuffer(h);
//		  } System.out.print(r+w);
//		 
////		  for(int i=0;i<t.length;i++) 
////		  {
////			  if(t[i]=='a') 
////			  {
////				  continue;
////			  }
////			  System.out.print(t[i]);}
//		   
//		   
//		   
	}

}
