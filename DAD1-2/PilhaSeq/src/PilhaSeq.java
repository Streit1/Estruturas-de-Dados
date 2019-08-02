import javax.swing.*;
public class PilhaSeq {//ini pilhaseq

	private int tamanho;
	private char[] pilha;
	private int topo;

	PilhaSeq(int x){//ini construtor
		tamanho = x;
		pilha = new char[tamanho];
		topo = -1;//topo recebe -1 pois o topo sendo = 0 (zero) já é o primeiro elemento na pilha;
	}//fim construtor

	void push() {//ini push()
		if(topo == tamanho-1){
			JOptionPane.showMessageDialog(null,"Pilha cheia...");
			return;
		}
		topo++;
		pilha[topo] = JOptionPane.showInputDialog("Entre com um caracter para empilhar:").charAt(0);
	}//fim  push()

	void pop() {//ini pop()
		if(topo == -1){
			JOptionPane.showMessageDialog(null,"Pilha vazia...");
			return;
		}else{
			JOptionPane.showMessageDialog(null,"Item " + pilha[topo]+ " removido.");
			topo--; }

	}//fim pop()

	void printall() {//ini printall()
		char[] pilhaaux = new char[tamanho] ;
		int  topoaux;
		String str = "IMPRESSÃO DA PILHA: ";
		if(topo == -1) {
			JOptionPane.showMessageDialog(null,"IMPOSSÍVEL IMPRIMIR UMA PILHA VAZIA!");
			return;
		}

		for (int i = 0; i < pilha.length; i++) {
			str = str + topo  + "\n";
			topoaux = topo;
			topo --;
			pilhaaux[i] = (char) topoaux;
		}
		
		JOptionPane.showMessageDialog(null, str);

	}//ini printall()

	void printtop() {// ini printtop() 
		System.out.println("Passei no printtop()");
		
	}// fim printtop()

}//fimpilhaseq
