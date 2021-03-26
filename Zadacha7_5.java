package collections;

import java.util.LinkedList;

public class Zadacha7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> numbers = new LinkedList<>();
		for (int i = 0; i < 5_000_000; i++) {
			numbers.add(i);
		}
		
		/*int a = 0;
		for (Integer number : numbers) {
			a = number;
		}
		
		System.out.println(a);
		*/
		
		int a = 0;
		for (int i = 0; i < 5_000_000; i++) {
			a = numbers.get(i);
		}
		
		System.out.println(a);

	}

}
