package test;
import java.util.Scanner;
public class Pro55_Sting {
	String fiveFormuls(String str,char ch) 
	{String s="";String r="";int c;
		switch(ch) 
	    {
        case 'A': r=str+str;break;
        case 'B':
        	  for(int i=0;i<str.length();i++) 
        	  {if(i%2==0)r=r+"*"; else r=r+str.charAt(i);}break;
        case 'C':
        	for(int i=0;i<str.length();i++) 
            {   c=0;
          	   for(int j=i+1;j<str.length();j++) 
          	     {if(str.charAt(i)==str.charAt(j))continue;} 
          	//if(c==0)
          	   r=r+str.charAt(i);
            }
          	break;
        case 'D':
        	for(int i=0;i<str.length();i++) 
        	{
        		if(i%2==0) 
        		{
        		   s=str.charAt(i)+"";
                   r=r+s.toUpperCase();
                }
        		else r=r+str.charAt(i);        	
        	}
        	break;
            }
		return r;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	   	System.out.print("ENTER A STRING : ");
		String str=s.nextLine();
	    System.out.println
	            ( "A:Add the String to itself\n"
	    		+ "B.Replace alternate positions with * \n"
	    		+ "C.Remove duplicate characters in the String\n"
	    		+ "D.Change alternate characters to upper case\n"
	    		);
       	System.out.print("ENTER THE CHOICE :");
       	char ch=s.next().charAt(0);   
          Pro55_Sting sp=new Pro55_Sting();      
        System.out.println(sp.fiveFormuls(str,ch));
	}
}
