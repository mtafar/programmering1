package programmering1;
import java.util.Scanner;
public class test1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("skriv in en stad i Sverige");
	String s = input.nextLine();
	System.out.println("skriv in ditt namn i "+s+ " om du är där");
    String namn = input.nextLine();	
    System.out.println(namn+ " har den minsta kuken i "+ s+ " källa: wikipedia");
	
	
}
}
