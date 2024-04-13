package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithInteger {

	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);list2.add(60);list2.add(80);
		list2.add(70);list2.add(50);list2.add(10);
		list2.add(10);list2.add(70);list2.add(60);
		System.out.println(list2);
		
		//filter opr
		System.out.println(list2.stream().filter(i->i>50).collect(Collectors.toList()));
		
		//map opr
		
		System.out.println(list2.stream().map(i->i*5).collect(Collectors.toList()));
		
		//no of occ
		
		System.out.println(list2.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())));
	}

}
