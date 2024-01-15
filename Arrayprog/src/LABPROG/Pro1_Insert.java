package LABPROG;
import java.util.Arrays;
import java.util.Scanner;
public class Pro1_Insert {
public static void main(String[] args) {
		int a[]=new int[50];
		Scanner s=new Scanner(System.in);
	    System.out.print("enter size = ");
		int size=s.nextInt();
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.print("enter the index = ");
		int index=s.nextInt();
		System.out.print("enter the value = ");
		int value= s.nextInt();
		for(int i=size;i>=index;i--) 
		{
			a[i+1]=a[i];   
		}
		a[index]=value;
		System.out.print("after insert = ");
		for (int i=0;i<=size;i++) {System.out.print(a[i]+" ");}
		s.close();
		
	}

}
