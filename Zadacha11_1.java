package algorithmsEfficiency;

import java.util.Scanner;

public class Zadacha11_1 {
	
	//O(n*m)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String s2 = sc.nextLine();
		
		int index = -1;
		int count = 0;
		
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0) && count == 0) {
				index = i;
				count++;
			} else if (s1.charAt(i) == s2.charAt(count)) {
				count++;
			} else if (count != 0) {
				count = 0;
				index = -1;
				i-= count;
			}
			
			if (count == s2.length()) {
				break;
			}
		}
		
		if (count != s2.length()) {
			index = -1;
		}
		
		if (index > -1) {
			System.out.println("Matched at index " + index);
		} else {
			System.out.println("String 2 is not a substring of String 1");
		}

	}

}
