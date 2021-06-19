package algorithmsEfficiency;

import java.util.LinkedList;
import java.util.Scanner;

public class Zadacha11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = input.nextLine();
		
		LinkedList<Character> max = new LinkedList<>();
		
		for (int i = 0; i < string.length(); i++) {
			LinkedList<Character> list = new LinkedList<>();
			list.add(string.charAt(i));
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(j) > list.getLast()) {
					list.add(string.charAt(j));
				}
			}
			
			if (list.size() > max.size()) {
				max.clear();
				max.addAll(list);
			}
			
			list.clear();
		}
		
		System.out.println(max.toString());
	}

}
