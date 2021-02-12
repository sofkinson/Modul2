package recursion;

public class Zadacha1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powRecursive(5 , 3));
		System.out.println(pow(5 , 3));

	}
	
	public static int powRecursive(int x, int n) {
		if (n == 0) {
			return 1;
		}
		
		return x * powRecursive(x , n - 1);
	}
	
	public static int pow(int n, int x) {
		   int result = 1;
		   for (int i = 1; i <= x; i++) {
		       result = result * n;
		   }
		   return result;
		}

}
