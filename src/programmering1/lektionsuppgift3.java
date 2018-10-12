package programmering1;
import java.util.Scanner;
public class lektionsuppgift3 { 
	public static void main(String[] args) {
		
		int Tal = input.nextInt();
		int sum = 0;
		while (Tal != 0)
		int sum = Tal % 10;
		Tal = Tal - Tal % 10;
		Tal = Tal/10;
		System.out.println(sum);	
	}
}

