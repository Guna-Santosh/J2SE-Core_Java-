package Arrays.StreamAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
public class Demo {

	public static  void sum(int i) {System.out.println(i+i);}
	public  void sum2(int i) {System.out.println(i+i);}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//		names.forEach(System.out::println); 
//		names.stream().filter(x->x.startsWith("A")).forEach(System.out::println);

		
		List<Integer> no1=Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> no2=Arrays.asList(1,2,3,4,5,6,7);
		
//		Stream.of(1,54,98,22,24,26).filter(i->i<60).skip(1).forEach(System.out::println);;
	
//		no.stream().filter(i->i%2==0).mapToInt(Integer::intValue).forEach(System.out::println);
//		System.out.println(sum);
//		no.stream().filter(i->i%2==0).forEach(i->{System.out.println(i+i);});
	
//		no.stream().filter(i->i%2==0).forEach(Demo::sum);
//		Demo ob=new Demo();
//		no.stream().filter(i->i%2==0).forEach(new Demo()::sum2);
		Stream.builder().add("");
		Stream<Integer> of = Stream.of(10,22,1,56,98,48);
//		of.forEach(System.out::println);
//		of.forEachOrdered(System.out::println);
//		of.filter(i->i<50).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		Stream<Integer> numbers = Stream.of(2, 3, 1, 4, 5);
//		numbers.forEach(System.out::println);
		// Output: Order can be arbitrary, e.g., 3 2 4 1 5

		// Using an arbitrary object method reference
		 List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");

	        // Using an arbitrary object method reference to join strings
//	        StringJoiner joiner = names1.stream().collect(StringJoiner::new, StringJoiner::add, StringJoiner::merge);
	        
//	        String result = joiner.toString();
//	        System.out.println(result);
		 LocalDateTime currentDateTime = LocalDateTime.now();
	        LocalDateTime newDateTime = currentDateTime.plusDays(1); // Add 1 day
//System.out.println(currentDateTime);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
	        String formattedDate = newDateTime.format(formatter);
//	        System.out.println(formattedDate);
	        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")));
	        System.out.println(LocalDateTime.now().plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")));
	      
	}

}
