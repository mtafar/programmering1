package programmering1;

import java.util.Scanner;

public class uppgiftvecka41 {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("skriv in en radie");
double Radie = input.nextDouble();
System.out.println(volume(Radie));
}

public static  double  volume(double radie) {
	radie = 4 * 3.14* radie * radie * radie / 3;
	return radie; 
}	


}