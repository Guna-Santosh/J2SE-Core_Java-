package Labpdf1;

public class timepss {
	
	String sp(String str) 
	{
	String str2="";
	
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0) 
			str2=str2+str+" ";
			else str2=str2+str.charAt(i);
		}System.out.println(str2);
		return "";
		
		
		
		
		
		
	}
	
	
public static void main(String[] args) {
	
	timepss tp = new timepss();
	System.out.println(tp.sp("santosh"));
}}
