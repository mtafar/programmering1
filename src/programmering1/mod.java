package programmering1;

import java.util.Scanner;

public class mod {
public static void main(String[] args) {
	Scanner Input = new Scanner(System.in); 		
	int Y = Input.nextInt();			
	int X = Input.nextInt();
	int N = Input.nextInt();
	
	for (int i = 1 ; i <= N; i++) {
		
	if	(i%Y == 0)
		System.out.println("fizz");
	else if (i%X == 0)
		System.out.println("buzz");
	else if (i%Y == 0 &&
			i%X == 0)
		System.out.println("fizzbuzz");

	else System.out.println(i);
	}
	
}
}
