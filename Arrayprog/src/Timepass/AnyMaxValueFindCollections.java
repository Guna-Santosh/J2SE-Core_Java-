package Timepass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import javax.management.Query;

@SuppressWarnings("rawtypes")
public class AnyMaxValueFindCollections extends Object {
	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) {
	int a[]= {10,10,2,5,44,7,2,5};

//	TreeSet ob1=null;
	
//	ob1 =new TreeSet(Arrays.asList(a));
//	System.out.println(ob1);
//	ob1.forEach(p->{System.out.println(p);});
	
	
	
	
//	List<Integer> ob=new ArrayList<Integer>();
	ArrayList ob=new ArrayList(Arrays.asList(Arrays.toString(a)));
	ob.forEach(p->{System.out.println(p+" ");});
	ob.forEach(System.out::println);
	
	
//	System.out.println(ob);
	
 HashMap djob=new HashMap<>();
 djob.put(djob, a);
	
	
	Query ojhm=new Query();
	PriorityQueue oerk=new PriorityQueue<>();
	oerk.add(8);
	oerk.poll();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int c=0;
//	for(int i=0;i<a.length;i++) 
//	{
//		 ob.add(a[i]);
//	}
//	System.out.println(ob);
//	
//	
//	ob.forEach(p->{System.out.print(p+" ");});
//	
//	int b[]=new int[ob.size()];
//	for(int i=0;i<b.length;i++) 
//	{
////		b[i]=ob.toArray();
//	}
//	System.err.println(b.length);
	
	
//System.out.println(Arrays.toString(a));

	}

}
