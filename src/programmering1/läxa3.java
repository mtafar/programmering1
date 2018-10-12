package programmering1;
import java.util.Scanner;

public class läxa3 {
	public static void main(String[] args) {
		int summa = 0;
		 
		for (int i = 0; i < 100; i += 1) {
			System.out.println(i);
			 summa = (summa+i);		}
		System.out.println("" +summa);
		 
		System.out.println();

		for (int i = 25; i < 50; i += 1) {
			System.out.println(i);
			 summa = (0+i);		}
		System.out.println("" +summa);
		
		System.out.println();
		Scanner input = new Scanner (System.in);
		for (int i = 20; i > 0; i -= 1) {
			System.out.println(i);
			 summa = (0+i);		}
		System.out.println("skriv ett tal från 1-10");
		int nummer = input.nextInt();
for (int i = 1; i <= 10; i++) {
System.out.println(i*nummer);	}
		
		
		
		
		
	}
}
