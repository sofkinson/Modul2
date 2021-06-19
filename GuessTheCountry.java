package setsAndMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class GuessTheCountry {

	public static void main(String[] args) {
		Map<String, String> countryToCapitalMap = new HashMap<String, String>() {{
			put("Ukraine", "Kiev");
			put("Russia", "Moskow");
			put("China", "Beijing");
			put("Japan", "Tokyo");
			put("New Zealand", "Wellington");
			put("Greece", "Athens");
			put("Australia", "Canberra");
		}};
		
		int points = 0;
		System.out.println("Guess the capital of the country. Only countries with one single capital are included. ");
		
		List<String> countries = new ArrayList(countryToCapitalMap.keySet());
		Collections.shuffle(countries);
		Scanner sc = new Scanner(System.in);
		
		for (String country: countries) {
			System.out.println("What is the capital of " + country + "?");
			String capital = sc.nextLine();
			countryToCapitalMap.get(country);
			
			if (capital.equals(countryToCapitalMap.get(country))) {
				points++;
			} else {
				points--;
			}
			
		}
		
		System.out.println("Your points are " + points + "!");
		
	}

}
