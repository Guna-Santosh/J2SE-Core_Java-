package Labpdf1;
public class Prog66_Weaved_HHeelloo 
{
	String getWeavedString(String s1,String s2)
	{    String s3="";int count;
		     if(s1=="\s"||s2=="\s")         s3="-1";
		else if(s1.length()>s2.length())  s3=s2+s1+s2;
		else if(s1.length()<s2.length())  s3=s1+s2+s1;
		else if(s1.length()==s2.length())      
		    {
			  for(int i=0;i<s1.length();i++)
			  { count=0;
				  for(int j=i+1;j<s1.length();j++)
				  {
				    if(s1==s2)count++;
				  }
				    if(count==1)continue; //Otherwise use if(count!=1)
			        s3=s3+s1.charAt(i)+s2.charAt(i);
		      }
			}return s3;
	}
	public static void main(String[] args) 
	{
	   Prog66_Weaved_HHeelloo sp=new  Prog66_Weaved_HHeelloo ();
	   System.out.println(sp.getWeavedString("Hello", "Hello"));
	}
}
//using 55 duplicate concept;
//if(s1.length()==s2.length())
//{}