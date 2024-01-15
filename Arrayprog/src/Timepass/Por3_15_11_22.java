package Timepass;

public class Por3_15_11_22 
{
	public static void main(String[] args) 
	{
        String s1="corejava";String s2="";String s3="";
        for(int i=0;i<s1.length();i++) 
        {
        	if(i%2==0) {
        		s2=s1.charAt(i)+"";
        	    s3=s3+s2.toUpperCase();}
        	else
        		s3=s3+s1.charAt(i);
        }
        System.out.println(s3);
	}

}
