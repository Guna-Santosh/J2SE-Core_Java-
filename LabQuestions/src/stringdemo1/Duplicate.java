package stringdemo1;

public class Duplicate 
{
  public static void main(String[] args) 
  { char sd=0;
	  java.util.Scanner s= new java.util.Scanner(System.in);
	  System.out.println("enter number");
	String a=s.nextLine();
     int le=a.length();
	//System.out.println(le);
	for(int i=0;i<le-1;i++) 
	{  
		char ch=a.charAt(i);
		sd=(char) (ch+i);
		
	}System.out.println(sd);
	s.close();
  } 
}
