package LABPROG;

public class Pro5_copyArray {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("ENTER SIZE = ");
	    int size =s.nextInt();
	    Integer a[]=new Integer[size];
	    Integer copy[]=new Integer [size];
	    for(int i=0;i<size;i++)
	    {
	    	a[i]=new Integer(s.nextInt());
	    }
	   System.out.print("copy[i] = ");
	    for(int i=0;i<size;i++) 
	    {
	       copy[i]=a[i];
	 	   System.out.print(copy[i]+" ");
	      }
	    }
	
	
	
	

}
