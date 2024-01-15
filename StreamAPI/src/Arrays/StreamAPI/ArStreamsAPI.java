package Arrays.StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class ArStreamsAPI {
	@SuppressWarnings({ "removal", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Integer[]on=new Integer[5];
	for (int i = 0; i < on.length; i++)
	{
		on[i]=new java.util.Scanner(System.in).nextInt();
	}
	Stream<Integer> st=Arrays.stream(on);
	st.filter(x->x%2==1).forEach(p->{System.out.print(p);});
	
	
	
	
	
	Map mp=Map.of(new Integer(10),new String("hii"),new Integer(70),new String("bye"));
    mp.forEach((m,p)->{System.out.print("\n"+m+" "+p);});
 
	
	}

}
