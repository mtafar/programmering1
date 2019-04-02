package programmering1;

import java.util.Scanner;

public class planering {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("skriv in ett tal mellan 1-10");
			int random = (int) (Math.random() * 10) + 1;
			if (a == random) {
				System.out.println("du vann och talet var "+ random);
			} else {
				for (int i = 0; i < 4; i++) {
					
				}
			}
		
	}
}
