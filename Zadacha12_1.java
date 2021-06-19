package algorithmsEfficiency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zadacha12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2, 3, -8, 5, 7, 1, 4};
		int sum = 14;
		System.out.println(hasPair_BruteForce(list, sum));
	}
	
	public static boolean hasPair_BruteForce(int[] list, int sum) {
		//O(n^2)
		for(int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] + list[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasPair_BinarySearch(int[] list, int sum) {
		//O(n log(n))
		for (int i = 0; i < list.length; i++) {
			if (BinarySearch.binarySearch(list, sum - list[i]) > 0) {
		return true;
		}
	}
		
		return false;
	}
		
	
	public static boolean hasPair_FromBothEnds(int[] list, int sum) {
		//0(n)
		int lastIndex = list.length - 1;
		int firstIndex = 0;
		while (lastIndex > firstIndex) {
			int currentSum = list[lastIndex] + list[firstIndex];
			if(currentSum > sum) {
				lastIndex--;
			} else if (currentSum < sum ) {
				firstIndex++;
			} else {
				return true; 
			}
		}
		return false;
	}
	
	public static boolean hasPair_HashSet(int[] list, int sum) {
		//O(n)
		Set<Integer> rests = new HashSet<Integer>();
		for (int i = 0; i < list.length; i++) {
			if(rests.contains(list[i])) {
				return true;
			}
			rests.add(sum - list[i]);
			
		}
		return false;
	}

}
