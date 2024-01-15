/*Que-4)
____________________
Develop a program to create an array with diff 
integer value and find the 
max and min value available in this array?
by creating a method
1.method name: maxArrayFind
return type: void 
having 1parameter int[]
2.method name: meanArrayFind 
return type: void having 1parameter int[]
*/package TASKPROG;

public class Pro4_D1_Max_Mean {
     void maxArrayFind(int a[]) 
     {int max = a[0];
    	 
    	 for(int i=0;i<a.length;i++)
    	  {
    		 if(a[i]>max) 
    		 {
    			 max=a[i];
    		 }
    	 }System.out.println("maxArray = "+max);
     }
     void meanArrayFind (int[] a)
     { int sum=0;int c=0;
    	 for(int i=0;i<a.length;i++) 
    	 {   c++;
    		sum=(sum+a[i]); 
    	 }
    	 System.out.println("meanArray = "+sum/c);
     }  
 	
	public static void main(String[] args) {
		System.out.print("enter size = ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int size =s.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++) 
		{
			a[i]=s.nextInt();
			
			}
		Pro4_D1_Max_Mean p=new Pro4_D1_Max_Mean();
		p.maxArrayFind(a);
		p.meanArrayFind(a);s.close();
	}
}
