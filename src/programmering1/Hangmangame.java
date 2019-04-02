package programmering1;
import java.util.ArrayList;
import java.util.Scanner;
public class Hangmangame {
	private static Hangmangame __ME;

	private String secretWord;
	/**
	 * denna kodsnut �r enn array string som tar ett av orden och g�mmer den
	 */
	private static String[] words = { "FERRARI", "DYKNING", "FISKAR", "FLYGPLAN", "GLOCK", "JUPITER" };
	private ArrayList<Character> gissningar = new ArrayList<Character>();
	private Scanner input = new Scanner(System.in);
/**
 * denna kod skriver ut en h�lsningsfras
 */
	private Hangmangame() {
		System.out.println("V�lkommen till H�nga gubbe!");
		System.out.println("V�nligen gissa p� en bokstav!");
	}
	/**
	 * denna kod skapar ett nytt spel
	 */
	private void newGame() {
		choseRandomWord();
		gissningar.clear();
		gissningar.add(' ');
		promptInput();		
	}
	/**
	 * denna kod tar ett hemligt ord
	 * @return
	 */
	@SuppressWarnings("unused")
	private String getSecretWord() {
		return secretWord;	
	}
	
	private void win() {	
	}
	/**
	 * denna kod kollar hur m�nga bokst�ver ordet har
	 */
	private void choseRandomWord() {
		secretWord = words[(int) (Math.random() * words.length)];	
	}
	/**
	 * denna kod skapar ett nytt spel
	 * @return
	 */
	public static Hangmangame getInstance() {
		if (__ME == null) {
			__ME = new Hangmangame();
		}
		
		return __ME;
	}
	/**
	 * denna kod skriver in din bokstav om bokstaven finns i ordet
	 */
	private void promptInput() {
		String line = input.nextLine();
		
		if(line.toUpperCase().equals(secretWord)){
			win();
		}
		else{
			makeGuess(line.charAt(0));
		}	
	}
	/**
	 * denna kod skriver om du har redan gissat p� en bokstav
	 * @param k
	 */
	private void makeGuess(char k){
		
		k = Character.toUpperCase(k);
		
		while(gissningar.contains(k)){	
			System.out.println("Du har redan gissat p� detta bokstaven " + k);
			System.out.print("V�nligen gissa p� en annan bokstav: ");
			k = input.nextLine().charAt(0);
			k = Character.toUpperCase(k);	
		}
		
		processGuess(k);	
		
	}
	/**
	 * denna kod forts�tter spelet om bokstaven �r r�tt
	 * @param gissa
	 */
	private void processGuess(char gissa) {
		boolean correct = false;
		String out = "";
		int i = 0;
		for(char letter : secretWord.toCharArray()){
			if(letter == gissa){	
				correct = true;
				out += letter;
				i++;
			}	
			
			else if(gissningar.contains(letter)){
				out += letter;	
				i++;
			}
			
			else{
				out += "-";	
			}	
		}
		if(i == secretWord.length()) {
			System.out.println("grattis du har vunnit");

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
