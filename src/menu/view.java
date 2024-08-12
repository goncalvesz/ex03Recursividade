package menu;

import javax.swing.JOptionPane;

import controller.RecursividadeController;

class view{
	
	public static void main(String[] args) {
		int x = -3;
		RecursividadeController fatorial = new RecursividadeController();
		
		while (x<0 || x>12) {
			try {
				x = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ter seu fatorial calculado. Valor máximo = 12"));
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Insira um valor inteiro");
			} 
			
			if (x>12) {
				JOptionPane.showMessageDialog(null, "O valor máximo é 12");
			}
			if (x<0) {
				JOptionPane.showMessageDialog(null, "O menor valor para um fatorial é 0");
			}
			else {
				JOptionPane.showMessageDialog(null, "O fatorial de " + x + " é: " + fatorial.Fatorial(x));
				
			}
		}	
	}
}

