package test;

public class Progstring
{

	public static void main(String[] args) 
	{
	 String s1="  s    a  n    t4   o    s   h       ";String s2="";int i;
	 for(i=0;i<s1.length();i++) 
	 {
		 if(!(s1.charAt(i)==' '))
		   s2=s2+s1.charAt(i);
	 }
	 System.out.println(s2);
	 System.out.println("1st letter = "+s2.charAt(0));	 
	 System.out.println("2nd letter = "+s2.charAt(s2.length()-1));
	 if(s2.length()%2==0) 
	 { 
   	   	 int j=s2.length()/2;
	  	 System.out.print("middle letter = "+s2.charAt(j-1)+s2.charAt(j));
	 }
	 else
		System.out.println("middle letter = "+s2.charAt(s2.length()/2));
	 
	 
	 
	}

}
//heloiylo