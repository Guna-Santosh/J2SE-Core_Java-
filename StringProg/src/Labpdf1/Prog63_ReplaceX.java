package Labpdf1;
public class Prog63_ReplaceX 
{
	String replaceX(String s) 
	{   String s3="",s4="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='x')s3+=s.charAt(i);
			if(s.charAt(i)=='x')continue; s4+=s.charAt(i);
		}
		return s4+s3;
	}
	public static void main(String[] args) 
	{
		Prog63_ReplaceX sp=null;
	    sp= new Prog63_ReplaceX();
		System.out.println(sp.replaceX("xAabxbX"));	
	    sp=null;
	}

}
