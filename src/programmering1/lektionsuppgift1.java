package programmering1;

import java.util.Scanner;

public class lektionsuppgift1 {
public static void main(String[] args) {
	Scanner Input = new Scanner(System.in);
	System.out.println("skriv två tal");
		int ett =  Input.nextInt();
	int tva =  Input.nextInt();
	if (ett<tva) System.out.println(tva);
	else System.out.println(ett);
}
}
