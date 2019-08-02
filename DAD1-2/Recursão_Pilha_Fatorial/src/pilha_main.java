import javax.swing.*;

public class pilha_main {
	
	public static void main(String args[]) {
	
	pilha p = new pilha();
	int numero;
	
	numero=Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor para calcular o fatorial: "));
	p.push_fat (numero);
	p.pop_fat();
	
	}//fim main
	
}//fim class pilha_main
