package List;
import java.util.*;
@SuppressWarnings({"unchecked", "rawtypes"})
public class DemoArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList ai2=null;// 
	     ai2=new ArrayList();
	     ai2.add(10);
	     ai2.add(1, 20);
	     
	     ai2.addAll(ai2);
	     ai2.addAll(3, ai2);
	     ArrayList c=(ArrayList) ai2.clone();
	     System.out.println( ai2.clone());
	     System.out.println( c);
	     ai2.add(50);
	     ai2.ensureCapacity(3);
	     ai2.add(42);
	     ai2.add(42);
	     ai2.add(42);
	     System.out.println(ai2.contains(c));
	     System.out.println(ai2);
	     System.out.println(ai2.size());
	     ai2.forEach((k)->{System.out.println(k);});
	     System.out.println(ai2.get(2));
	     
	     System.out.println(ai2.getClass());
	     System.out.println(ai2.hashCode());
	     
	     System.out.println(ai2.indexOf(50));
	     
	     //ai2.clear();
	     System.out.println(ai2.isEmpty());
	     System.out.println(ai2.iterator());
	     ai2.add(50);
	     
	     System.out.println(ai2.lastIndexOf(50));
	     System.out.println(ai2.listIterator());
	     
	    System.out.println(ai2.remove(8));
	     System.out.println(ai2);
	    
	    System.out.println( ai2.parallelStream());
	    Collections.sort(ai2);
	   
	     System.out.println(ai2);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
