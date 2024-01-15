package pistring;
public class Prog17Anagram 
{
	public static void main(String[] args) {
		System.out.println("eat == ate");
		String s1="eat";
		String s2="tea";
	
		int c;
		if(s1.length()==s2.length())
		{   c=0;
			for(int i=0;i<s1.length();i++) 
			{
				for(int j=0;j<s2.length();j++) 
				if(s1.charAt(i)==s2.charAt(j))c++;
			}	
			String a=(c==s1.length())?"Anagram":"Not Anagram";
			System.out.println(a);
		}
		else
			System.out.println("Not Anagram");
	}

}
