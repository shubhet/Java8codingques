package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {

		int[] number = new int[] { 2, 3, 4, 1, 56, 2 };

		List<Integer> list = new ArrayList<>();

		// array to list type1

		for (int i = 0; i < number.length; i++) {
			list.add(number[i]);
		}


		Set<Integer> set = new HashSet<>();

		list.stream().filter(i -> !set.add(i)).forEach(System.out::println);

	}

}
