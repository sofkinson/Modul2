package recursion2;

public class Zadacha2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		System.out.println(evenRecursive(35));
		System.out.println(oddRecursive(35));

		}

		public static boolean evenRecursive(int n) {
		if (n == 0) {
		return true;
		} else if (n == 1) {
		return false;
		}
		return evenRecursive(n - 2);
		}

		public static boolean oddRecursive(int n) {
		if (n == 0) {
		return false;
		} else if (n == 1) {
		return true;
		}
		return oddRecursive(n - 2);
		}


}
