/*Program-55
Create a method which can perform a particular 
String operation based on the user’s choice. 
The method should accept the String object and 
the user’s choice and return the output of the operation. 
Options are 
A: Add the String to itself 
B: Replace alternate positions with * 
C: Remove duplicate characters in the String 
D: Change alternate characters to upper case
Method Name 	changeString 
Argument 	String string, char ch 
Return Type 	String 
*/package Labpdf1;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Prog55_Aii_In_One 
{
	@SuppressWarnings("resource")
	String fiveFormuls(String str) 
	{String s1="";String r="";int count;
	
	System.out.println("*****RESULT OF U CHOICE***** ");
        switch(new Scanner(System.in).next().charAt(0)) 
        {
        //------------add itself--------------------
        case 'A':
        	r=str+str;break;
        case 'B':
        	for(int i=0;i<str.length();i++) 
        	{
        		if(i%2==1)r=r+"*";
        		else r=r+str.charAt(i);
        		//r=(i%2==1)?s+="*":(s+=syu.charAt(i));  
        	}break;
        case 'C':
        	//------------remove duplicate char---------------
        for(int i=0;i<str.length();i++) 
          {   count=0;
        	for(int j=i+1;j<str.length();j++) 
        	{
        		if(str.charAt(i)==str.charAt(j))count++;
        	}       if(count==0)
        			r=r+str.charAt(i);
          }
        	break;
        case 'D':
        	//------------alternate char upper case-----------
        	for(int i=0;i<str.length();i++) 
        	{
        		if(i%2==0) 
        		{
        		   s1=str.charAt(i)+"";
                   r=r+s1.toUpperCase();
                }
        		else r=r+str.charAt(i);        	
        	}
        	break;
        case 'E':count=0;
        //-----------------count vowels-----------------
        	for(int i=0;i<str.length();i++) {
        	char ch1=str.charAt(i); 
        	if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
        		count++;
        	  { r=count+""; }
        	}
        	break;
        case 'F':count=0;
        //----------------print vowels-------------------
        	for(int i=0;i<str.length();i++) {
            	char ch1=str.charAt(i); 
        	if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
            	  { count++;r=r+ch1+" "; }
            	}
        	break;
        case 'G':count=0;
        //---------------count not vowels-----------------------
        for(int i=0;i<str.length();i++) {
        	char ch1=str.charAt(i); 
         if(!(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'))
        		count++;
        	{ r=count+""; }
        }
        break;
        	
        case 'H':count=0;
        //-------------print not vowels----------------------
        for(int i=0;i<str.length();i++) {
        	char ch1=str.charAt(i); 
         if(!(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'))
        	  { count++;r=r+ch1+" "; }
        }
        break;
        case 'I':
        	//--------remove  number---------------
        	String[] spl=str.split("\\d");
        	for(String g:spl) 
            r=r+g;
        	break;
        case 'J':	
        //-----------mirror letter----------------	
        System.out.println(str+"|"+new StringBuffer(str).reverse());
        break;
        case 'K':
        //-----ascii rotation abc|zyx------------
        for(int i=0;i<str.length();i++)
   	    System.out.print((char)(219-str.charAt(i)));
        break;
        case 'L': //45862-13242
        	StringBuffer sb=null; int number1=new Scanner(System.in).nextInt();
        	String emst="";  String st=String.valueOf(number1);                                     //StringBuffer s2=null;//StringBuffer sb=null; //s1=s1+number1;//char a[]=s1.toCharArray();
       	 for(int i=0;i<st.length();i++) 
       	 {
       		 if(i==st.length()-1) 
       		 {  
       			 emst+=st.charAt(i); 
       			 sb=new StringBuffer(emst);                                                //String str =new String(sb);//s2=s2+str;//s3=Integer.parseInt(s2);
                }
       		 else 
       			 if(st.charAt(i)>st.charAt(i+1))
       		       {   
       			      emst+=st.charAt(i)-st.charAt(i+1);
       			      sb=new StringBuffer(emst);  									     //String str =new String(sb);//s2=s2+str;//s3=Integer.parseInt(s2);
       			   }		 
       		 else 
       		 {     
       		   emst+=st.charAt(i+1)-st.charAt(i);
       		   sb=new StringBuffer(emst);												     //String str =new String(sb);//s2=s2+str;//s3=Integer.parseInt(s2);
       	     }
       	 } 
       	 r=sb+"";
        break;
        case 'M':
        	String s1name="eat",s2name="teas";String temp="";
        	for(int i=0;i<s1name.length();i++) 
    		{
    			for(int j=i;j<s2name.length();j++) 
    			{
    				if(s1name.charAt(i)==s2name.charAt(j))temp="true";
    				else temp="false";
    			}
    		}
        	r=temp;
        break;
        case 'N'://a5b3c2||aaaaabbbcc
        	for(int i=0;i<str.length()-1;i=i+2) 
    		{
    			int n=Integer.parseInt(""+str.charAt(i+1));			  
    			for(int j=1;j<=n;j++) 
    			{
    				r+=str.charAt(i);	
    			}		
    		}	
        break;
        case 'O'://aaaaabbbcc||a5b3c2
        	int j=1,i;
        	for(i=0;i<str.length()-1;i++) 
    		{
    			if(str.charAt(i)==str.charAt(i+1))j++;
    			else 
    			{
    				r+=str.charAt(i-1)+""+j;
    			    j=1;
    			}
    		}
    		r+=str.charAt(i-1)+""+j;
        break;
        case 'P':
        //---------each word reverse-------
         String s2="",s3="";
       	 StringTokenizer tokob=new StringTokenizer(str);
       	 while (tokob.hasMoreElements()) 
       	  {
       		s2=" "+tokob.nextToken()+""+s2;	
       		s3=s2+"";		
       	  }
       	 System.out.println(new StringBuffer(s3).reverse());
        break;
        case 'Q':
        //-------------sentance reverse-----------
         String se2="",se3="";
       	 StringTokenizer tokob1=new StringTokenizer(str);
       	
       	  while (tokob1.hasMoreElements()) 
       	  {
       		se2=tokob1.nextToken()+" "+se2;		
       	  }
       	 System.out.println(se2);
       	 
        	break;
        //--------------------------------------
        default :
        	System.out.println("INVALID CHOICE");
        }	
		return "OUTPUT =  "+r;
	}
	
	public static void main(String[] args) 
         {
		   	Scanner s=new Scanner(System.in);
		   	System.out.print("ENTER A STRING : ");
			String str=s.nextLine();
		    System.out.println
	            ( "A:Add the String to itself\n"
	    		+ "B.Replace alternate positions with * \n"
	    		+ "C.Remove duplicate characters in the String\n"
	    		+ "D.Change alternate characters to upper case\n"
	    		+ "E.count of vowels\n"
	    		+ "F.print vowels\n"
	    		+ "G.count consonents\n"
	    		+ "H.print consonents\n"
	    		+ "I.remove numbers\n"
	    		+ "J.mirror letters\n"
	    		+ "K.rotation ascii letters ex:(abc|zyx)\n"
	    		+ "L.diffrence of each no ex:45862-13242\n"
	    		+ "M.annagram String ex:eat|tea\n"
	    		+ "N.char number convert into no ex:a5b3c2||aaaaabbbcc\n"
	    		+ "o.each letter count and print char+count ex:aaaaabbbcc||a5b3c2\n"
	    		+ "P.each word reverse\n"
	    		+ "Q.Sentance reverse\n");
           	System.out.print("ENTER THE CHOICE :");
            
            Prog55_Aii_In_One sp=new Prog55_Aii_In_One();
            System.out.println(sp.fiveFormuls(str));
         }
}
