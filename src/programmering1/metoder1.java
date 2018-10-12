package programmering1;

import java.util.Scanner;

public class metoder1 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("skriv in två tal");
		int a = Input.nextInt();
		int b = Input.nextInt();
		min(a,b);
	}

	public static void min(int a, int b) {
		if (a > b)
			System.out.println(a);
		else
			System.out.println(b);
	}

}
