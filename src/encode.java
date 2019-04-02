import java.util.Scanner;

public class encode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		sc.nextLine();

		String input = sc.nextLine();

		int size = (int) Math.sqrt(input.length());

		char[][] encrypted = new char[size][size];
		char[][] decoded = new char[size][size];

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {
				encrypted[i][j] = input.charAt(i * 3 + j);
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = size - 1; j >= 0; j--) {
				System.out.print(encrypted[j][i]);
			}
		}

	}
}
