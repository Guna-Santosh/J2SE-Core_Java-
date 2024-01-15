package MyOwnProg_s;
public class WordReverse{
	String  wordReverse(String s1){  
		int le=s1.length();
		String s2="";
		String s3="";
		for(int i=0;i<le;i++) {
			if(s1.charAt(i)==' ') {
				s3=s3+s2+s1.charAt(i);
				s2="";
			}//end of if
			s2=s1.charAt(i)+s2;
		}//end of for
		return s3+s2;
	}//end of wordReverse()
   public static void main(String[] args){ 
	   java.util.Scanner s=new java.util.Scanner(System.in);
	   WordReverse wr=new WordReverse();
      String s1=s.nextLine();
      System.out.println(wr.wordReverse(s1));
      s.close();
   }//end of main
}//end of class
