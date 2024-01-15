/*Program-53
Create a method that accepts a number and modifies 
it such that the each of the digit in the newly formed 
number is equal to the difference between two consecutive digits 
in the original number. The digit in the units place can be left as it is. 

Note: Take the absolute value of the difference. Ex: 6-8 = 2

Method Name 	modifyNumber 
Algorithm
1.	Convert number into String 
2.	Extract each char using charAt method Convert char to int and find the difference 
3.	Create new StringBuffer object and keep adding the difference 
4.	Finally convert StringBuffer to int 
Argument    	int number1 
Return Type 	int 
For example. 
           	  Input: 45862 
              Output:13242 
*/package Labpdf1;
public class Prog53_45862_TO_13242_IMP 
{    StringBuffer sb=null;
   int modifyNumber(int number1) 
   {  String s1="";  String str=String.valueOf(number1);                                     //StringBuffer s2=null;//StringBuffer sb=null; //s1=s1+number1;//char a[]=s1.toCharArray();
	 for(int i=0;i<str.length();i++) 
	 {
		 if(i==str.length()-1) 
		 {  
			 s1+=str.charAt(i); 
			 sb=new StringBuffer(s1);                                                //String str =new String(sb);//s2=s2+str;//s3=Integer.parseInt(s2);
         }
		 else 
			 if(str.charAt(i)>str.charAt(i+1))
		       {   
			      s1+=str.charAt(i)-str.charAt(i+1);
			      sb=new StringBuffer(s1);  									     //String str =new String(sb);//s2=s2+str;//s3=Integer.parseInt(s2);
			   }		 
		 else 
		 {     
		   s1+=str.charAt(i+1)-str.charAt(i);
		   sb=new StringBuffer(s1);												     //String str =new String(sb);//s2=s2+str;//s3=Integer.parseInt(s2);
	     }
     }
	int n=Integer.parseInt(new String(sb));									         //System.out.println((char)s3);
	return n;
	}//end of modifyNumber()
   public static void main(String[] args) 										     // s3=s3+(int)s1.charAt(i);
   {
	   java.util.Scanner s=new java.util.Scanner(System.in);
	   System.out.print("ENTER NUMBER = ");
	   int number1=s.nextInt();
	   Prog53_45862_TO_13242_IMP sp3=new Prog53_45862_TO_13242_IMP();
	   System.out.println(sp3.modifyNumber(number1));
   }//end of main()
}//END OF CLASS

   
   



















 //  if(i==a.length-1)
//		  //System.out.println(a[i]); 
//		     s2=s2+a[i];
//		   else if(a[i]<a[i+1])
//			      s2= (s2+a[i+1]-a[i]);
//			      //System.out.println(s2);
//			   
//		   else {s2=s2+a[i]-a[i+1];
//		 }}
   
  
//		 s2=(char) (s2-a[i]);
//	 System.out.println(s2);
//	// else s2=(char) (a[i]-s2);
//	 }
//	// System.out.println(s2);