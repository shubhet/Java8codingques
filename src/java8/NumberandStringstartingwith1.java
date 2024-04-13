package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberandStringstartingwith1 {
	
	public static void main(String[] args) {
		
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
          myList.stream()
                .map(s->s+"") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println); 
		
		
		
	}

}
