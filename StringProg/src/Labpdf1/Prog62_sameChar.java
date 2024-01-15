package Labpdf1;
public class Prog62_sameChar 
{
	boolean sameCharacter(String s1,String s2) 
	{   if(s1.length()==s2.length())
		for(int i=0;i<s1.length();i++) 
		{
			for(int j=i;j<s2.length();j++) 
			{
				if(s1.charAt(i)==s2.charAt(j))return true;
				else return false;
			}
		}
	return false;
	}
	public static void main(String[] args) 
	{
		Prog62_sameChar sp=null;
		sp=new Prog62_sameChar();
		System.out.println(sp.sameCharacter("eat", "tas"));
		sp=null;
	}
}
