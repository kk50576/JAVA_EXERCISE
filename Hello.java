package tw.org.iii;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int year;
		Scanner y = new Scanner(System.in);
		year = y.nextInt();
		if (year % 400 == 0) {
			System.out.println("YES");
		} else {
			if (year % 100 == 0) {
				System.out.println("NO");
			} else {
				if (year % 4 == 0) {
					System.out.println("YES");
				}
			}
			System.out.println("No");
		}
	}
}
