package _06_vault;

import java.util.Random;

/**
 * 
 * A vault with a secret code
 *
 */
public class Vault {
	private int secret = new Random().nextInt(1000000);
	
	/**
	 * Tries to access the vault
	 * 
	 * @param guess the code being attempted
	 * @return true if the guess matches the code, false otherwise
	 */
	public boolean tryCode(int guess) {
		return guess == secret;
	}
	 void mysteriousVoice() {
		 System.out.println("Mysterious Voice: *whispers* ttthhee ccodeee isss " + secret + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n Mysterious voice: *whispers* ssscrolll uuupppp" );
	 }
}
