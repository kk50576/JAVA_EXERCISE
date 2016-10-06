package tw.org.iii;

public class J_0820_7_for {

	public static void main(String[] args) {
		for (int k = 0; k < 2; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = 2; i <= 5; i++) {
					int newi = i + k * 4;
					
					System.out.print(newi + "*" + j + "=" + newi*j + "\t");
				}
				System.out.println();

			}
			System.out.println("---------------------------");
		}
	}
}