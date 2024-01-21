package test;

public class Pro1_03_11_22 {
	int getNameScore(String str)
	{
		String s1=str.toUpperCase();int k=0;
		  for(int i=0;i<s1.length();i++)
		  if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
		  {
			  k=k+(int)s1.charAt(i)-64;
		  }
		  else 
		  {
			  k=-1;break;
		  }
		System.out.println();   
		return k;
	}
	public static void main(String[] args)
	{
		Pro1_03_11_22 ob=new Pro1_03_11_22();
		System.out.println(ob.getNameScore("abc"));
	}
}