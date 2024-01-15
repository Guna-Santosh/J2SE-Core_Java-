package StringProg;

public class StringAllMethods
{
   void seeMethods()
   {
	   System.out.println("IMPLEMENTING STRING CLASS METHODS");
	   String s1="java";
	   String s2=new String("java");
	   String s3="java";
       String s4=new String("java");
 //equal():String class equals() will checks the contents present in the string
       /*public boolean equals(java.lang.Object);*/
 //eqauls() method is used to compare two Strings and generate boolean result.
       System.out.println("====eqalus() methods==== ");
       System.out.println("\t"+s1.equals(s2)); 
   
       System.out.println("\t"+s1.equals(s4));   
       System.out.println("\t"+s1.equals(s3));
       System.out.println("\t"+"java".equals ("java"));
       //System.out.println("\t"+"JAVA".equals(s1));   
       System.out.println("\t"+"JAVA".equals(s1));
       //equalIsIgnoreCase() 
       System.out.println("\tJAVA".equalsIgnoreCase(s1));
       //it will cheeks the address location of string object 
       System.out.println(s1==s2);
       System.out.println(s2==s3);
       System.out.println(s1==s4);
       System.out.println(s2==s4);
       System.out.println(s1==s3);
       System.out.println("java"=="java");
       System.out.println("java"==new String("java"));
       System.out.println(s2==new String("java"));
       System.out.println("-----------------------");
       //System.out.println("length()= "s1.lenthg);// error will come 
       
       // to find the length we have the pre-defined method is called length()
      //length keyword is used to find the array length.
       
   System.out.println("lentgh()="+s1.length());
   System.out.println("cancat() = "+s1.concat(" is awesome"));
   System.out.println("lenght() with cancat()= "+s1.concat("").length());
   //not add the old string bcz of string immutable;
   System.out.println("lenght() with cancat()= "+s1.concat("is awesome").length());
   System.out.println("s1= "+s1);
   System.out.println("charAt() ="+s1.charAt(2));  //j a v a
                                                   //0 1 2 3
     System.out.println("charAt() = "+s1.charAt(s1.length()-4));
     System.out.println();
     
     
     
     
     
     System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
     System.out.println("1.java".length());
     System.out.println("2.java".concat(" is awesome"));
     System.out.println("3.java".charAt(2));
     System.out.println("---java".concat("hi").length());
     System.out.println("----java".concat("hi").length()-3);
     System.out.println("4.java".startsWith("j"));//boolean process
     System.out.println("----java is super".startsWith("java"));
     System.out.println("5.java is super".endsWith("is"));
     System.out.println("6.JAVA".toLowerCase());
     System.out.println("7.java".toUpperCase());
     System.out.println("8.java".replace("a", "A"));
     System.out.println("9.java is super".substring(5));
     System.out.println("10.java is super".substring(2,10));
     System.out.println("11.java".indexOf("a"));
     System.out.println("12javais appla".lastIndexOf("a"));
     System.out.println("13.java is program".trim());
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   }
   public static void main(String[] args) 
   {
	   StringAllMethods sAm=new StringAllMethods();
      sAm.seeMethods();
   }
}
