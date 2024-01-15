package LABPROG;

public class pro4_delete {{System.out.println("BOTH WILL WORK");}
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
      /*System.out.print("WHICH VALUE U WANT TO DELETE = ");
      int delete=s.nextInt();
      
      if(delete>=size+1)
      {System.out.println("invalid position");}
      else 
      {
    	  for(int i=delete-1;i<size-1;i++) 
    	  {
    		a[i]=a[i+1];
    	  } for(int j=0;j<size-1;j++) System.out.println(a[j]);
     	 
       }*/
      System.out.print("WHICH INDEX  WANT TO DELETE = ");
      int delete=s.nextInt();
      for(int i=delete;i<size-1;i++) 
      {
    	  a[i]=a[i+1];
      }
      for(int i=0;i<size-1;i++) 
      {
    	System.out.println(a[i]);  
      }
      
      
      
      s.close();
	}

}
