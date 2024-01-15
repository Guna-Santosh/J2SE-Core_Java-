package Labpdf1;
public class Prog68_CipherText_abc_zyx 
{
    String encrypt(String s1)
	{    String s2="";int count = 0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z') 
			{   count++;
				char ch=s1.charAt(i);
				int ac1=ch-'a'; 
				int ac2='z'-ac1;
				 s2=s2+(char)ac2;
			}
		}
		if(count==s1.length())
		return s2;
		else return null;
	}
	public static void main(String[] args) 
	{
	Prog68_CipherText_abc_zyx sp=new Prog68_CipherText_abc_zyx(); 
	System.out.println(sp.encrypt("abcdefghijklmnop"));
	}

}
