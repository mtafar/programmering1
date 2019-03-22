package programmering1;
import java.util.ArrayList;
import java.util.Scanner;
public class Hangmangame {
	private static Hangmangame __ME;

	private String secretWord;
	private static String[] words = { "CHOKLAD", "SOMMAR", "VATTEN", "FLYGPLAN" };
	private ArrayList<Character> gissningar = new ArrayList<Character>();
	private Scanner input = new Scanner(System.in);

	private Hangmangame() {
		System.out.println("Välkommen till Hänga gubbe!");
		System.out.println("Vänligen gissa på en bokstav!");
	}
	
	private void newGame() {
		choseRandomWord();
		gissningar.clear();
		gissningar.add(' ');
		promptInput();		
	}
	
	@SuppressWarnings("unused")
	private String getSecretWord() {
		return secretWord;	
	}
	
	private void win() {	
	}
	
	private void choseRandomWord() {
		secretWord = words[(int) (Math.random() * words.length)];	
	}
	
	public static Hangmangame getInstance() {
		if (__ME == null) {
			__ME = new Hangmangame();
		}
		
		return __ME;
	}
	
	private void promptInput() {
		String line = input.nextLine();
		
		if(line.toUpperCase().equals(secretWord)){
			win();
		}
		else{
			makeGuess(line.charAt(0));
		}	
	}
	
	private void makeGuess(char k){
		
		k = Character.toUpperCase(k);
		
		while(gissningar.contains(k)){	
			System.out.println("Du har redan gissat på detta bokstaven " + k);
			System.out.print("Vänligen gissa på en annan bokstav: ");
			k = input.nextLine().charAt(0);
			k = Character.toUpperCase(k);	
		}
		
		processGuess(k);	
		
	}
	private void processGuess(char gissa) {
		boolean correct = false;
		String out = "";
		for(char letter : secretWord.toCharArray()){
			if(letter == gissa){	
				correct = true;
				out += letter;		
			}	
			
			else if(gissningar.contains(letter)){
				out += letter;	
			}
			
			else{
				out += "-";	
			}	
		}
		
		gissningar.add(gissa);

		if(!correct){
			hangman.getInstance().loseLife();
		}
		
		hangman.getInstance().print();
		System.out.println(out);
		promptInput();		
		
	}
	public void gameOver() {
		newGame();	
	}
	
	public void start() {
		newGame();
	}
}
