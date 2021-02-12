package recursion;

public class Zadacha1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delenieMethod(226532105);
		
	}
	
	public static void delenieMethod(int n) {
		while (n > 0) {
			System.out.println(n % 10);
			n /= 10;
		}
	}

}
