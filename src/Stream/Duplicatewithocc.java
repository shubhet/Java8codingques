package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicatewithocc {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		list1.add("Mango");list1.add("Banana");
		list1.add("Guava");list1.add("Mango");
		list1.add("Banana");list1.add("Mango");
		
		//forEach
		System.out.println(list1);
		
		//no of occurences
		
		System.out.println(list1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())));
		
		//no of occurrences of char
		
		String s="helloooo";
		
		System.out.println(s.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(i->i,Collectors.counting())));
		
		//filter operation
		
		System.out.println(list1.stream().filter(i->i.length()<6).collect(Collectors.toList()));
		
		//map operation
		
		System.out.println(list1.stream().map(i->i+"Hello").collect(Collectors.toList()));

	}

}
