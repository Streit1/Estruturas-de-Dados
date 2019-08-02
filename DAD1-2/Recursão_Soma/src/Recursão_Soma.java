import javax.swing.*;

public class Recursão_Soma {

	static int soma(int n) {
	if (n == 0 ) {
		return 0;
	}else {
		return n + soma(n-1);
	}
	
	}//fim soma()
	
	public 	static void main(String arg[]) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog ("Calcular a soma sucessiva de: ")); 
		JOptionPane.showMessageDialog(null,"A Soma sucessiva de " + numero + " eh: " + soma(numero));
	}
	
}//fim Recursão_Soma
