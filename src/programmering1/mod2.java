package programmering1;

import java.util.Scanner;

public class mod2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int H = input.nextInt();	
	int M = input.nextInt();
	
	if (H -1 < 0) {
	H = H + 24;	
	}
	if (M - 45 < 0) {
	 H = H - 1;
	 M = M + 15;
	}else {
		M = M - 45;
	}
	

	System.out.println(H+" "+M);
	 
}
}
