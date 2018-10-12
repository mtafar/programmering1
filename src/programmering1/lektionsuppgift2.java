package programmering1;
import java.util.Scanner;
public class lektionsuppgift2 {
public static void main(String[] args) {
	Scanner Input = new Scanner(System.in);
	System.out.println("skriv in en radie");
	int radie = Input.nextInt();
	System.out.println("skriv in en höjd");
	int hojd =  Input.nextInt();
	System.out.println(3.14*radie*radie*hojd +"cm2");
}
}
