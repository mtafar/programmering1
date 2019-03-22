package programmering1;

public class hangman {
private static hangman __ME;
	
	private int liv;

	private hangman() {
		liv = 10;		
	}
	
	public static hangman getInstance(){
		
		if(__ME == null){
			__ME = new hangman();
		}	
		
		return __ME;
	}
	public void loseLife() {
		liv--;
	}
	
	public void print() {
	    System.out.flush();  
		switch (liv) {

		case 10:
			tioLiv();
			break;
		case 9:
			nioLiv();
			break;
		case 8:
			åttaLiv();
			break;
		case 7:
			sjuLiv();
			break;
		case 6:
			sexLiv();
			break;
		case 5:
			femLiv();
			break;
		case 4:
			fyraLiv();
			break;
		case 3:
			treLiv();
			break;
		case 2:
			tvåLiv();
			break;
		case 1:
			ettLiv();
			break;
		default:
		case 0:
			död();
			break;
		}
	}
	private void död() {
		System.out.println("   ___________  ");
		System.out.println("   | /       |  ");
		System.out.println("   |/        0  ");
		System.out.println("   |        /|\\");
		System.out.println("   |        / \\");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
		System.out.println("loser");
		Hangmangame.getInstance().gameOver();
		__ME = new hangman();
	}
	private void ettLiv() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        1 ");
		System.out.println("   |        /|\\");
		System.out.println("   |        /  ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void tvåLiv() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        2 ");
		System.out.println("   |        /|\\");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void treLiv() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        3 ");
		System.out.println("   |        /| ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void fyraLiv() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        4 ");
		System.out.println("   |         | ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void femLiv() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        5 ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void sexLiv() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/          ");
		System.out.println("   |           ");
		System.out.println("   |   6      ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void sjuLiv() {
		System.out.println("   ___________ ");
		System.out.println("   | /         ");
		System.out.println("   |/          ");
		System.out.println("   |           ");
		System.out.println("   |    7     ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void åttaLiv() {
		System.out.println("   ___________ ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |    8      ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void nioLiv() {
		System.out.println("               ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |   9       ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	private void tioLiv() {
		System.out.println("               ");
		System.out.println("               ");
		System.out.println("               ");
		System.out.println("               ");
		System.out.println("       10      ");
		System.out.println("               ");
		System.out.println(" _____         ");
		System.out.println("/     \\       ");
	}
	
}
