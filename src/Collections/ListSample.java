package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		List<String> ls= new ArrayList<>();
		ls.add("hello");
		ls.add("python");
		
		ls.stream().forEach(s->System.out.print(s));
		ls.stream().forEach(System.out::print);
		ls.stream().forEach(System.out::println);
		System.out.println("==============");
		
		ls.stream().filter(i->i.length()>5).forEach(s->System.out.print(s));
		System.out.println();
		ls.stream().filter(i->i.length()>5).map(i->i+" programming ").forEach(System.out::println);
		
		
	}

}
