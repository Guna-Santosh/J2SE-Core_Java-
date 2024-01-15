/*Searching an array element from an array and show its index.*/
package LABPROG;

public class Pro8_Search {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
	    System.out.print("a[i] size = ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int size=s.nextInt();
		Integer a[]=new Integer[size];
		for(int i=0;i<size;i++)
		{		
			a[i]=new Integer(s.nextInt());
			//a[i]=s.nextInt();
		}
		System.out.print("enter ele to search index = ");
		int search=s.nextInt();
	    for(int i=0;i<size;i++)
	    {
	    	if(search==a[i]) 
	    	{     Integer b=i;
	    		System.out.println("INDER = "+b);
	    	}
	    }System.out.println("NUMBER IS NOT THERE......");
		
	}

}
