package programmering2;
import java.util.Scanner;
public class repetition {
	private static Scanner input;

	public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.println("skriv in ett tal");
	int a = input.nextInt();	
	System.out.println("skriv in ett annat tal");
	int b = input.nextInt();	
	if (a>b) {
		System.out.println(a);
	} else {
System.out.println(b);
	}
	
}
}