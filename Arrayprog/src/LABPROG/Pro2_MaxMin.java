package LABPROG;

public class Pro2_MaxMin 
{
@SuppressWarnings("removal")
public static void main(String[] args) {
	java.util.Scanner s=new java.util.Scanner(System.in); 
	System.out.print("ENTER SIZE = ");
	int size =s.nextInt();
	Integer a[]=new Integer[size];
	for(int i=0;i<size;i++) 
	{
		a[i]=new Integer(s.nextInt());//System.out.println(a[i]);
	}
	int max=a[0];int min=a[0];
	for(int i=0;i<size;i++) 
	{
		if(a[i]>max)max=a[i];
		if(a[i]<min)min=a[i];
	}System.out.println("MAXIMUM VALUE IS "+max+" "+"\nMINIMUM VALUE IS = "+min);
	
	
}
}
