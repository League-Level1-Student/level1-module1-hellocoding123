package _06_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		vault.mysteriousVoice();
		String number = JOptionPane.showInputDialog(null, "What number would you like to guess to open the vault: \n Six digits: ******");
		int guess = Integer.parseInt(number);
		vault.tryCode(guess);
	}
}
