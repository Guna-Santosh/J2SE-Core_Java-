/*Que-9)   rem
_________________________
Develop a program to create an array of integer 
delete one value from this array,display result array

for example:
Input:{3,2,5,7,6}
-->delete the element 5 
Output:{3,2,7,6}

Hint : once you create the array element you cannot delete the
  
element you can only replace.*/
package TASKPROG;
import java.util.Scanner;
public class Pro9_D2_DeleteEle {

	@SuppressWarnings("resource")
	public int[] deleteEle(int[] a) 
	{
		System.out.print("enter ele = ");
		int ele =Integer.parseInt(new Scanner(System.in).nextLine());
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i])continue;
			
			System.out.print(a[i]+" ");
		}
		
		
		return a;
		
	}//1, 2, 3, 2, 4, 1
	public static void main(String[] args) {
		System.out.print("a[i] size = ");
		Scanner s=new Scanner(System.in);
	    int size =s.nextInt();
	    int a[]=new int[size];
	    for(int i=0;i<a.length;i++)
		a[i]=s.nextInt();
	    Pro9_D2_DeleteEle de=new Pro9_D2_DeleteEle();
		System.out.println(de.deleteEle(a));
		
		
	}

}
