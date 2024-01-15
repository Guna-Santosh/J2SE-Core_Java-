package pistring;
import java.util.Arrays;
public class FrequencyINWord

{
	public static void main(String[] args)
	{
	  String s="s@n*t@os@h*";  char ch[]=s.toCharArray();
	  Arrays.sort(ch);
      for(int i=0;i<s.length();i++)  
      {   int c=0;
      	for(int j=0;j<ch.length;j++) 
    	{
    		  if(ch[i]==ch[j]) c++;
    	} 
    	  System.out.println(ch[i]+"->"+c);
          i=i+c-1;
      }   
	}				
}
//System.out.println(ch);

// IntStream obi=s.chars();
//obi.distinct().forEach((p)->{System.out.println((char)p);});
//System.out.println(obi.distinct());