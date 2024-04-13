package java8;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EvenNumber {

	public static void main(String[] args) {
		//way1
		int [] numbers= new int[] {2,4,6,43,24,9};
		IntStream streamofnumber = Arrays.stream(numbers);
		
		//way2
		Stream<Integer> numbers2 = Stream.of(2,4,6,43,22);
		
		
		
	
		IntStream evennumbers = streamofnumber.filter(i->i%2==0);
		evennumbers.forEach(System.out::println);
	
		System.out.println();
		
		Stream<Integer> evennumbers2 = numbers2.filter(i->i%2==0);
		evennumbers2.forEach(i->System.out.println(i));
		

	}

}
