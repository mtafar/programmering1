package programmering1;

import java.util.Scanner;

public class uppgiftvecka41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// System.out.println("skriv in en radie");
		// double Radie = input.nextDouble();
		// System.out.println(volume(Radie) + "cm3");
		// System.out.println("skriv ditt namn");
		// String Reva = input.nextLine();
		// System.out.println(rev(Reva));
		System.out.println("skriv");
		String str = input.nextLine();
		System.out.println("skriv in ett bokstav");
		String cs = input.nextLine();
		char c = cs.charAt(0);
		count(str, c);
	}

	public static double volume(double radie) {
		radie = 4 * 3.14 * radie * radie * radie / 3;
		return radie;
	}

	public static String rev(String Reva) {
		String str = "";
		for (int i = Reva.length() - 1; i >= 0; i--) {
			str += Reva.charAt(i);

		}
		return str;

	}

	public static int count(String str, char c) {
		int count = 0;
		int h = str.length();
		for (int i = 0; i < str.length(); i++) {
			h--;
			if (str.charAt(h) == c) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

}
