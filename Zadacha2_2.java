package recursion2;

public class Zadacha2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decToBin(631));

	}

	public static String decToBin(int value) {
	if (value == 1) {
	return "1";
	}

	return decToBin(value / 2) + value % 2;

	}

}
