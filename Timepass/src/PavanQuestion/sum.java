package PavanQuestion;

public class sum 
{
	public String makeOutWord(String out, String word)
	{ 
	      out="<<>>";
	      word="hello";
	    String k=out.substring(0,2);
	    String l=out.substring(2,4);
	   
	  return "\""+k+word+l+"\"";
	}
public static void main(String[] args)
{
//    int n=2545,c=0; int s=0,m=1;
//    while(n>0) 
//    {
//    	n=n/10;
//    	c++;
//    	
//    }
////   
//	String s1="ababab";
//    System.out.println(s1.substring(1,2));
//    
//   // System.out.println(c);
java.util.Scanner s=new java.util.Scanner(System.in);

String word =s.nextLine();
	if(word.length()%2==0)
	   System.out.println(word.substring(0,word.length()/2));
	else
		System.out.println(word.substring(0,word.length()/2-1));
	    
	

}
}
