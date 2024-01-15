package test;
import java.util.*;
public class DemoGeneric 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
//	        //Using Raw Type
//			java.util.HashSet ob1 = new java.util.HashSet();
//			ob1.add(new Integer(12));
//			ob1.add(new Float(12.34F));
//			ob1.add(new Character('A'));
//			ob1.add(new String("nit"));
//			ob1.add(new StringBuffer("HYD"));
//			System.out.println("****display from HashSet<E>****");
//			System.out.println(ob1.toString());
//			 
//	        //Set<E> to hold Integer Objects
//			java.util.HashSet<Integer> ob2 = new java.util.HashSet<Integer>();
//			ob2.add(new Integer(121));
//			ob2.add(new Integer(122));
//			ob2.add(new Integer(124));
//			ob2.add(new Integer(120));
//			System.out.println("****display from HashSet<E>****");
//			System.out.println(ob2.toString());
//			
//			//Set<E> to hold String Objects
//			java.util.HashSet<String> ob3 = new java.util.HashSet<String>();
//			ob3.add(new String("nit"));
//			ob3.add(new String("hyd"));
//			ob3.add(new String("xyz"));
//			ob3.add(new String("pqr"));
//			System.out.println("****display from HashSet<E>****");
//			System.out.println(ob3.toString());
	     
		       
               HashSet ob1=null;
            		   ob1=new HashSet();
               ob1.add("hiii");
               ob1.add(12);
               ob1.add(12.25);
               ob1.add(12.25);//duplicate not allow
               ob1.add('a');
               ob1.add(true);
               System.out.println(ob1);
               System.out.println(ob1.getClass());
               
               System.out.println("------------------------------------");
               Set ob=new HashSet();
               ob.add("hiii");
               ob.add('a');
               ob.add(12);
               ob.add(true);
               ob.add(12.25);
               ob.add(12.25);//duplicate not allow
               System.out.println(ob);
               System.out.println(ob.getClass());
			
		}
}