package test;

import java.util.*;


public class PreLinkedList {

public static void main(String[] args) 
{
   LinkedList<Integer> ll=new LinkedList<Integer>();	
   //add the data
   System.out.println("content of ll="+ll);
   System.out.println("size of ll = "+ll.size());
   ll.add(10);
   ll.add(20);
   ll.add(30);
   ll.add(40);
   System.out.println("content of ll="+ll);
   System.out.println("size of ll = "+ll.size());
   ll.addFirst(100);
   ll.addLast(200);
   System.out.println("content of ll="+ll);
   System.out.println("size of ll = "+ll.size());
   ll.remove(2);
   System.out.println("content of ll="+ll);
   System.out.println("size of ll = "+ll.size());
   System.out.println("ele = "+ll.peek());
   System.out.println("------------------ ");
   System.out.println("ele of linkedlist toArray()");
   System.out.println("------------------ ");
   Object ob[]=ll.toArray();
   for(Object x:ob)
   System.out.println("\t"+x);
   System.out.println("------------------ ");
   for(int i=ob.length-1;i>=0;i--)
   {System.out.println("\t"+ob[i]);}
   System.out.println("------------------ ");
   System.out.println("ele of linkedlist List-iterator()--FD");
   System.out.println("------------------ ");
   Iterator<Integer> itr= ll.iterator();
   while(itr.hasNext()) 
   {
	   Object ob1=itr.next();
	   System.out.println(ob1);
   }
   System.out.println("------------------ ");
   System.out.println("------------------ ");
   System.out.println("ele of linkedlist List-iterator()--FD");
   System.out.println("------------------ ");
   Iterator<Integer> litr= ll.iterator();
   for(;litr.hasNext();) 
   {
	   Object ob2=litr.next();
	   System.out.println(ob2);
	   
   }
   System.out.println("------------------ ");
   System.out.println("ele of linkedlist List-iterator()--BD");
   System.out.println("------------------ ");
  // Iterator<Integer> litr= ll.iterator();
   for(;;) 
   {
	   Object ob2=litr.next();
	   System.out.println(ob2);
	   
   }



}

}
