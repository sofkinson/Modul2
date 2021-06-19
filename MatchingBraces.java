package stacksAndQueues;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class MatchingBraces {

	public static void main(String[] args) {
		Stack<Character> braces = new Stack<>();
		File myObj = new File("popo.txt");
		FileReader fr;
		try {
			fr = new FileReader(myObj);
			BufferedReader br = new BufferedReader(fr);
			int c = 0;
			boolean conflict = false;
			while ((c = br.read()) != -1) {
				char character = (char) c;
				if (character == '{' || character == '[' || character == '(') {
					braces.add(character);
				} else if (character == '}') {
					conflict = braces.pop() !='{';
				} else if (character == ']') {
					conflict = braces.pop() != '[';
				} else if (character == ')') {
					conflict = braces.pop() != '(';
				}
				
				if(conflict) {
					break;
				}
			}
			
			if (conflict || !braces.isEmpty()) {
				System.out.println("Mismatched braces");
			} else {
				System.out.println("No mismatched braces");
			}
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
