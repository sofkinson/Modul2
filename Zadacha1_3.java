package recursion;

public class Zadacha1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(pow2Recursive(7));
		System.out.println(pow2Interative(7));

	}
	
	public static int pow2Recursive(int n) {
		if (n == 0) {
			return 1;
		}
		return 2 * pow2Recursive(n - 1);
	}
	
	public static int pow2Interative(int n) {
		   int result = 1;
		   for (int i = 1; i <= n; i++) {
		       result = result * 2;
		   }
		   return result;
		}


}
