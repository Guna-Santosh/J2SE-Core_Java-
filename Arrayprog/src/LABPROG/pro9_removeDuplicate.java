package LABPROG;
public class pro9_removeDuplicate 
{
	public static void main(String[] args)
	{
     System.out.print("a[i] size = ");
     java.util.Scanner s= new java.util.Scanner(System.in);
     int size=s.nextInt();
     int k=0;
     int a[]=new int[size];
     //int b[]=new int [size];
     for(int i=0;i<size;i++) 
     {
    	 a[i]=s.nextInt();
     }
     //-------ALL DUPLICATES REMOVE-------------
     /* a[i] size = 9
        1 5 8 1 2 4 5 2 7
        8 4 7  */
     for(int i=0;i<size;i++) 
     {  int c=0;
    	 for(int j=0;j<size;j++) 
    		
    	 {                        
    		 if(a[i]==a[j])
    		 c++;
    	 }	 
		if(c==1)
		{ 
	      System.out.print(a[i]+" ");
	    }
    }
     //System.out.println("sum = "+k);
     
    
//     // -------- SINGLE DUPLICATE ALLOW---------------
     for(int i=0;i<a.length;i++)
     {
    	 int c=1;
    	 for(int j=i+1;j<a.length;j++)
    	 {
    		 if(a[i]==a[j])c++;
    	 }
    	 if(c==1)
    	 System.err.print(a[i]+" ");}
//
//    	 /*a[i] size = 9
//       1 5 8 1 2 4 5 2 7
//       8 1 4 5 2 7 */
//     }
     
     
     
     
   }
}
