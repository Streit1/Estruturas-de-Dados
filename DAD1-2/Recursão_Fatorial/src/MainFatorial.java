import javax.swing.*;
public class MainFatorial {

	static int fatorial(int n){ 
		if (n > 0) return n * fatorial(n-1); 
		else return 1; }
	
	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog ("Calcular o fatorial de: ")); 
		JOptionPane.showMessageDialog(null,"O fatorial de " + numero + " eh: " + fatorial(numero));

	}

}
