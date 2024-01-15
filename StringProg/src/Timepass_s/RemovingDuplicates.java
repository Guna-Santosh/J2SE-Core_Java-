package Timepass_s;
public class RemovingDuplicates
{
	public static void main(String[] args) 
	{
      java.util.Scanner s=new java.util.Scanner(System.in);
      System.out.print("ENTER STRING = ");
      String name=s.nextLine();//for user entry i.e 1 name
      String s1="";//to store the 2nd name 
     //int le=name.length();//strong length of string
     int c;//count have same letter or not
     System.out.println("BEFORE REMOVING DUPLICATES = "+name);
     System.out.print("AFTER REMOVING DUPLICATES =   ");
     for(int i=0;i<name.length();i++)//1st word
     {
    	 c=0;//it checks every time
    	 for(int j=i+1;j<name.length();j++) //2nd word
    	 {
    		 if(name.charAt(i)==name.charAt(j))//camparing
    			 c++;//when comparing will find same 
    	 }
    	 if(c==0)//only story one letter i.e queen(quen)
    		 s1=s1+name.charAt(i);//storng 2nd name 
     }System.out.print(s1);//printing 2nd name 
     s.close();
	}//end of main()
}//end of class
//it will use to string dublicate and number duplicate also