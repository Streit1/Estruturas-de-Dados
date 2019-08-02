import javax.swing.*;

class no {
	int num;
	no prox;

	no(){
		num = 0;
		prox = null;
	}//fim construtor
}//fim class no

public class Pilha {

	private no temp = new no();
	private no topo;

	public void PilhaVazia() {
		if (topo == null) {
			JOptionPane.showMessageDialog(null,"PILHA VAZIA!");
			return;
		}//fim if
	}//fim PilhaVazia

	public void push(){

		temp.num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NÚMERO PARA EMPILHAR"));
		temp.prox = temp;
		topo = temp;


	}//fim push()

	public void pop() {
		System.out.println("pop()");
	}//fim pop()

	public void printall() {
		PilhaVazia();
		String str = "PILHA:\n";
		no aux = new no();
		
		while(topo != null) {
			str += temp.num;
			aux = temp;
			aux.prox = temp.prox;
			temp = temp.prox;
		}
		JOptionPane.showMessageDialog(null, str);
	}//fim printall

}//fim class Pilha
