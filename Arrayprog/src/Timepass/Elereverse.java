package Timepass;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Elereverse {
	public static void main(String[] args) {
//		int a[]= {15,85,99,78,100};
//		for(int i=0;i<a.length;i++)
//		{
//			int rev=a[i];
//			int ele=0;
//			while(rev>0) 
//			{
//				ele=ele*10+rev%10;
//				rev=rev/10;
//			}
//			a[i]=ele;
//		}
//		System.out.println(Arrays.toString(a));
		
		
		int[] array = {12, 45, 85};
		array = IntStream.of(array).map(i -> 
		Integer.parseInt(new StringBuilder().append(i).reverse().toString())).toArray();
		System.out.println(Arrays.toString(array));
	}

}
