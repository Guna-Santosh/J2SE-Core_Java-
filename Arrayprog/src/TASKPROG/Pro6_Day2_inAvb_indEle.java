/*Develop a program with array of integer 

find the given element in the array
by defining two methods
1st Method ::  name-isAvailable()

1- to return true/false,to tell wheather
this array contain this given element.

2nd Method::   Name-indexElement()

2- to return index number to this given element.
*/package TASKPROG;
import java.util.Scanner;
public class Pro6_Day2_inAvb_indEle 
{
	boolean k=false;
	int z;
	@SuppressWarnings("resource")
	void nameisAvailable(int[] a)
	{   System.out.print("FIND = ");int c=0;
		int ele=Integer.parseInt(new Scanner(System.in).nextLine());
		for(int i=0;i<a.length;i++) 
		{
			if(ele==a[i]) {c++;System.out.println("TRUE");}
		}
		if(c==0)System.out.println("FALSE");
		
	}
	@SuppressWarnings("resource")
	
	void NameindexElement(int[] a)
	{ System.out.print("enter ele =");int i;
		int ele=Integer.parseInt(new Scanner(System.in).nextLine()); 

		for(i=0;i<a.length;i++) 
		{
			if(ele==a[i]) 
			{k=true;break;}
		}if(k){System.out.print("I AM AVALIBLE IN INDEX:"+i);}
		else {System.out.print("SORRY IAM NOT AVALIABLE BOSS....");}
	}
	public static void main(String[] args) {
	System.out.print("a[i] size = ");
      Scanner s= new Scanner(System.in);
    int size =s.nextInt();
    int[] a=new int[size];
    for(int i=0;i<size;i++)
    {
    	a[i]=s.nextInt();
    }
  Pro6_Day2_inAvb_indEle p=new Pro6_Day2_inAvb_indEle();
  p.nameisAvailable(a);
  p.NameindexElement(a);
  s.close();
  }
}
