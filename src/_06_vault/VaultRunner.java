package _06_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		String number = JOptionPane.showInputDialog(null, "What number would you like to guess to open the vault: n/ Six digits: ******");
		vault.mysteriousVoice();
		int guess = Integer.parseInt(number);
		vault.tryCode(guess);
	}
}
