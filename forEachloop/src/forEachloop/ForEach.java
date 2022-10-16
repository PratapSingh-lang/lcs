package forEachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr [] = {"5","9","4","8"};
		int arr1 [] = {1,3,6,9,4};
//		for(int i : arr) {
//			System.out.println("Result with for Each loop");
//			System.out.println(i);
//		}
		
//		List <Integer> arrList = new ArrayList<>();
//		 Arrays.asList(arr).forEach(i -> System.out.println(i));
		 Arrays.asList(arr1).forEach(i -> System.out.println(i.getClass()));
//		arrList.forEach((i )-> System.out.println(i));
		List<String> strList = new ArrayList<String>();
		strList.add("first");
		strList.add("first1");
		strList.add("first2");
		strList.add("first3");
		strList.add("first4");
//		strList.forEach((temp) -> System.out.println(temp));

		List<Integer> ll = new ArrayList<>();
		ll.add(11);
		ll.add(22);
		ll.add(118778);
		ll.add(1145);
		ll.add(4411);
//		ll.forEach(i -> System.out.println(i));

	}

}
