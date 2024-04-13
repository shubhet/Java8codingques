package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Converstion {

	public static void main(String[] args) {
		String s="hello";
		System.out.println(s);
		
		//string to array
		
		char[] s2= s.toCharArray();
		System.out.println("String to Array");
		for(char c:s2)System.out.print(c+" ");
		System.out.println();
		
		
		String [] s5= {"ll","kkhk","io"};
		
		//Array to string
		char [] s3= {'k','j','a','r','i','a'};
		
		String s4= String.valueOf(s3);
		System.out.println("Array to String"+" "+s4);
		
		System.out.println();
		
		//from string array to object
		List l1= new ArrayList<>(Arrays.asList(s5));
		System.out.println("Array to Object"+l1);
		
		//from object to array
		Object [] obj = l1.toArray();
		System.out.println("Object to Array");
		for(Object s1:obj) {
			System.out.print(s1+" ");
		}
	   
		

	}

}
