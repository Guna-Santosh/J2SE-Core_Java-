package test;

import java.util.Scanner;

@SuppressWarnings("serial")
public class COJ_19_Validotar 
{   boolean b=false;
public boolean validationPassword(String s1) 
{   int s2=s1.length();
	int capital =0,small=0,symbol=0,number=0;
	char a[]=new char[s2];
	for(int i=0;i<a.length;i++) 
	{
		a[i]=s1.charAt(i);
	}
	for(int i=0;i<a.length;i++) 
	{
		if(a[i]>='A'&&a[i]<='Z')capital++;
		else if(a[i]>='a'&&a[i]<='z')small++;
		else if(a[i]>='0'&&a[i]<='9')number++;
		else symbol++;
		
	}if(capital>=1&&small>=2&&number>=1&&symbol>=1) b=true;
	return b;
}
//public static void main(String[] args) {
//	COJ_19_Validotar vd=new COJ_19_Validotar();
//	System.out.println( vd.validationPassword("Santosh@1"));
//}
	
}
