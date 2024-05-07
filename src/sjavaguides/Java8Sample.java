package sjavaguides;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Sample {

	public static void main(String[] args) {
		//find min and max number using java 8
		
		List<Integer> numbers = Arrays.asList(10,20,230,90,8);
		
		int max=numbers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max number :"+max);
		
		//min number
		
		int min = numbers.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Min number: "+min);

		//second largest number
		
		int secondLargest = numbers.stream().sorted(Comparator.reverseOrder())
				            .skip(1)
				            .findFirst()
				            .get();
		System.out.println("secondLargest :"+secondLargest);
		
		
		//frequency of character in string
		
		String s="helloprayagraj";
		IntStream stringStream = s.chars();
		Stream<Character> mapToObjString = stringStream.mapToObj(c->(char)c);
		Map<Character, Long> collect = mapToObjString.collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()
				));
	    System.out.println("Frequency:"+collect);
	    
	    //Reverse of string using java8
	    
	    String s1="Hello java programmer";
	    String regex = " ";
		String[] words = s1.split(regex);
	    List<String> reverseString = Arrays.stream(words).map((word)->new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
	    
	    System.out.println("Reverse String :"+reverseString);
	    
	    // duplicate number;
	    
	    List<Integer> list = Arrays.asList(10,20,230,90,82,20,10);
	    HashSet<Integer> set = new HashSet<>();
	    List<Integer> duplicateElements = list.stream().filter(i->!set.add(i)).collect(Collectors.toList());
	    System.out.println("DuplicateElements: "+duplicateElements);
	   
	    
	    //remove duplicate
	    
	    list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	    
	   //last elements of string
	    
	    List<String> s2= Arrays.asList("x","kk","llk","oo","yy");
	    
	    String string = s2.stream().skip(s2.size()-1)
	    .findFirst().get();
	    System.out.println("last element :"+string);
	    
	    //Age calculation
	    
	    LocalDate dob= LocalDate.parse("1991-02-12");
	    
	    LocalDate currentDate = LocalDate.now();
	    
	    Period period = Period.between(dob, currentDate);
	    System.out.println("Age: "+period.getYears());
	    
	    //even numbers
	    
	    List<Integer> list3 = Arrays.asList(1,23,34,45,22,3,45);
	    List<Integer> evenNumber = list3.stream().filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println("EvenNumbers :"+evenNumber);
	    
		//sum of digits
	    
	    int number=7879;
	    
	    //convert into string
	    String numberinString = String.valueOf(number);
	    IntStream intStream = numberinString.chars();
	    IntStream numericvalueFromchar = intStream.map(Character::getNumericValue);
	    int sum = numericvalueFromchar.sum();
	    
	    System.out.println("Number sum :"+sum);
	    
	    //sort list alphabetically
	    
	    List<String> listOfString = Arrays.asList("Hello","java","coding");
	    List<String> sortedvalue = listOfString.stream().sorted().collect(Collectors.toList());
	    System.out.println("Sorted Value :"+sortedvalue);
	    
	 
	    
	    
	    
 	}

}
