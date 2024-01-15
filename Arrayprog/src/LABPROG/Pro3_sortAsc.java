package LABPROG;
public class Pro3_sortAsc {
@SuppressWarnings("removal")
public static void main(String[] args) {
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.print("ENTER SIZE = ");
 int size=s.nextInt();
 Integer a[]=new Integer[size];
 for(int i=0;i<size;i++)
 {
	 a[i]=new Integer(s.nextInt());
 }
     System.out.print("AFTER SORTING = ");
 for(int i=0;i<size;i++) 
 {for(int j=0;j<size;j++) 
	{if(a[i]<a[j]) 
	  {int c=a[i];
		a[i]=a[j];
		a[j]=c;
	  }
	}
 }
for(int i=0;i<size;i++)System.out.print((a[i])+" ");    
s.close();
	}
}
