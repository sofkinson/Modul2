package recursion;

public class Zadacha4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum is " + xMethod(5 , 1));
		System.out.println("Sum is " + yMethod(5));

	}
	
	public static int xMethod(int n) {
		return xMethod(n , 1);
	}
	
	public static int xMethod(int n, int result) {
		if (n == 1) {
			return result;
		}

		else {
			return n + xMethod(n - 1);
		}
	}
		
		public static int yMethod(int n) {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			return sum;

	}

}
