package recursion;

public class Zadacha1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	 System.out.println("Sum is " + sumMethod(30));
	}
	
	public static int sumMethod(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	
	}

}

