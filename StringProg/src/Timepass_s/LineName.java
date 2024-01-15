package Timepass_s;
public class LineName 
{
public static void main(String[] args) {
	System.out.print("enter string = ");
	java.util.Scanner s=new java.util.Scanner(System.in);
	String s1=s.next();String c1="",c2="";
	for(int i=0;i<s1.length();i++)
	{
		if(i%2==0) c1+="*";	
		else c1+=s1.charAt(i);
	}
	 System.out.println(c1);
	 for(int i=0;i<s1.length();i++)
	 {   int c=0;
		 for(int j=i+1;j<s1.length();j++) 
		 {
			 if(s1.charAt(i)==s1.charAt(j))
			  c++;
		 }
		 if(c==0)
		  c2=c2+s1.charAt(i);
	}
	System.out.println(c2);
	for(int i=s1.length()-1;i>=0;i--) 
	{
	    char o=s1.charAt(i);
	    //char q=s1.charAt(1);
	    System.out.print(o);
	}System.out.println();
	
	for(int i=0;i<s1.length();i++) 
	{
		
		if(i==1) 
		{
			System.out.print(s1.substring(0,1).toUpperCase());
		                                                      
		}}{System.out.println(s1.substring(1,s1.length()));}
	
		System.out.println();
		StringBuffer sb=new StringBuffer(s1);
		System.out.print(sb.reverse());
	    
	    
	    
	    
	    s.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    }
}
