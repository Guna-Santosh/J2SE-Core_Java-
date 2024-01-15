package Labpdf1;
public class Prog71_last_L_first 
{
	String rotate( String s1,int n) 
	{
		return s1.substring(s1.length()-n)+s1.substring(0,s1.length()-n);
	}
	public static void main(String[] args) 
	{
		Prog71_last_L_first sp=new Prog71_last_L_first();
		System.out.println(sp.rotate("talent", 2));
	}
}
