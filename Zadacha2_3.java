package recursion2;

import java.util.Scanner;

public class Zadacha2_3 {
	
	private static int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number of disks: ");
			int n = input.nextInt();

			System.out.println("The moves are: ");
			moveDisks(n, 'A', 'C', 'B');
			System.out.println(num);

			}

			public static void  moveDisks(int n, char fromTower, char toTower, char auxTower) {
			if (n == 1) {
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			num++;
			} else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower +  " to " + toTower);
			num++;
			moveDisks(n - 1, auxTower, toTower, fromTower);
			}

	}

}
