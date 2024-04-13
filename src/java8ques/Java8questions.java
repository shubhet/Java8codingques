package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8questions {

	static void distictNumber() {
		int[] array = new int[] { 2, 3, 5, 6, 8, 9, 6, 8, 9 };
		IntStream stream = Arrays.stream(array);
		Stream<Integer> distinct = stream.boxed().distinct();
		List<Integer> collect = distinct.collect(Collectors.toList());
		System.out.println(collect);
	}

	static void countNoofOccurences() {
		String[] values = new String[] { "hello", "programmer", "java", "hello" };
		Stream<String> stream = Arrays.stream(values);
		Map<String, Long> collect = stream.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(collect);

	}

	static void arraynoofCount() {
		int[] array = new int[] { 2, 3, 5, 6, 8, 9, 6, 8, 9 };
		long count = Arrays.stream(array).boxed().count();
		System.out.println(count);

	}

	static void removeDuplicate() {
		String[] values = new String[] { "hello", "programmer", "java", "hello" };
		List<String> collect = Arrays.stream(values).distinct().collect(Collectors.toList());
		System.out.println(collect);

	}

	static void arraySum() {
		int[] array = new int[] { 2, 3, 5, 6, 8, 9, 6, 8, 9 };
		int sum = Arrays.stream(array).boxed().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

	}

	static void arrayDistinctSum() {
		int[] array = new int[] { 2, 3, 5, 6, 8, 9, 6, 8, 9 };
          int sum = Arrays.stream(array).boxed().mapToInt(Integer::intValue).distinct().sum();
          System.out.println(sum);
	}

	static void arrayAverage() {
		int[] array = new int[] { 2, 3, 5, 6, 8, 9, 6, 8, 9 };
          double sum = Arrays.stream(array).boxed().mapToInt(Integer::intValue).average().getAsDouble();
          System.out.println(sum);
	} 
	
	static void arrayMax() {
		int[] array = new int[] { 2, 3, 5, 6, 8, 9, 6, 8, 9 };
         int asInt = Arrays.stream(array).max().getAsInt();
         System.out.println(asInt);
	} 
	
	static void arrayMin() {
		int[] array = new int[] { 2, 3, 5, 6, 8, 9, 6, 8, 9 };
         int asInt = Arrays.stream(array).min().getAsInt();
         System.out.println(asInt);
	}
	
	static void arrayAscendingSorting() {
//		int[] array = new int[] { 2, 3, 5, 6, 8, 9, 6, 8, 9 };
//         Arrays.stream(array).sorted().forEach(i->System.out.print(i+" "));
		 List<Integer> list = Arrays.asList(2, 3, 5, 6, 8, 9, 6, 8, 9); 
		 List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		 System.out.println(collect);
        
	}
	
	static void arrayDescendingSorting() {
		 List<Integer> list = Arrays.asList(2, 3, 5, 6, 8, 9, 6, 8, 9); 
//		 List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		 System.out.println(collect);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
		
	}
	
	public static void main(String[] args) {
		// distictNumber();

		// countNoofOccurences();

		// arraynoofCount();

		// removeDuplicate();

		// arraySum();

		//arrayDistinctSum();
		
		//arrayAverage();

		//arrayMax();
		
		//arrayMin();
		
		//arrayAscendingSorting();
		
		arrayDescendingSorting();
	}

}
