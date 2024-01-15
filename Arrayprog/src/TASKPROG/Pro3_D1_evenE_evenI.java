/*Que-3)
____________________
Progam to print the even number in the array and 
also where the element is present inside the array?
*/
package TASKPROG;

public class Pro3_D1_evenE_evenI {

	public static void main(String[] args) 
	{
		System.out.print("enter the size = ");
	    java.util.Scanner s=new java.util.Scanner(System.in);
		int size =s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}System.out.print("even numbers = ");
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0) {
            System.out.print(a[i]+" ");
            //System.out.println();
            }
			
		}
		System.out.print("\neven index = ");
		for(int i=0;i<size;i++) {
			if(a[i]%2==0) {
	            System.out.print(i+" ");}
		}
		
	}

}
