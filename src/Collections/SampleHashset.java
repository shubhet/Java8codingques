package Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SampleHashset {

	public static void main(String[] args) {
		Set<String> hs= new HashSet<>();
		hs.add("Hello");
		hs.add("Java");
	//	System.out.println(hs);

		hs.forEach(System.out::println);
		System.out.println(hs.remove("Java"));
	  
		hs.forEach(System.out::println);
		System.out.println(hs.removeAll(hs));
		System.out.println("=========");
		
		  
	}

}
