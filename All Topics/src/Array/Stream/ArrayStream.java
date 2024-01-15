package Array.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Integer a[]= {14,24,41,54,23,2};
//		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 54));
		
		
		Stream <Integer>sm=Arrays.stream(a);
		sm.filter(x->x%2==0).forEach(y->{System.out.println(y);});
		
	}

}
