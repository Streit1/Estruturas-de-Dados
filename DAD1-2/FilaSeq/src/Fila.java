import javax.swing.*;

public class Fila {

	private int tamanho;
	private String[] Fila;
	private int qtde;


	public Fila(int x) {
		tamanho = x;
		Fila = new String [tamanho] ;
		qtde = -1;
	}// fim construtor

	public void Push() {
		if (qtde == tamanho - 1) {
			JOptionPane.showMessageDialog(null, "Fila cheia...");
			return;
		}

		Fila[++qtde] = JOptionPane.showInputDialog("DIGITE UM NOME:");


		printall();
	}//fim push()

	public void pop() {

		if(qtde == -1){
			JOptionPane.showMessageDialog(null,"Pilha vazia...");
			return;
		}else{
			JOptionPane.showMessageDialog(null,"Nome" + Fila[0]+ " removido.");
			Fila[0]=null;
			String[] filaaux = new String [tamanho];

			for(int i = 1, j = 0; i <= qtde; i++,j++ ) {
				filaaux[j] = Fila[i]; //primeira posição de filaaux recebe o primeiro elemento de Fila
				Fila[i] = null;// paga 
			}
			Fila = filaaux;//Fila principal recebeu a fila auxiliar
			qtde--;
		}


	}// fim pop()
	
	public void popall() {
		
			for (int i=0;i<Fila.length;i++) {
				Fila[i] = null;
				qtde--;
			
		}
		JOptionPane.showMessageDialog(null,"FILA EXCLUÍDA COM SUCESSO!");
	}//fim popall()
	
	public void printini() {
		if(qtde == -1) {
			JOptionPane.showMessageDialog(null,"IMPOSSÍVEL IMPRIMIR UMA FILA VAZIA!");
			return;
		}
		
		JOptionPane.showMessageDialog(null,"O Primeiro nome é: "+Fila[0]);
		
	}//fim printini()

	public void printall() {
		
		if(qtde == -1) {
			JOptionPane.showMessageDialog(null,"IMPOSSÍVEL IMPRIMIR UMA FILA VAZIA!");
			return;
		}
		String str = "IMPRESSÃO DA FILA: \n";
		String[] Filaaux = new String[tamanho] ;
	
		
		for (int i = 0; i < Fila.length; i++) {
			Filaaux[i] = Fila[i];
			str += Fila[i]  + " ";
			//Fila[i] = null;
			
			
		}
		Fila = Filaaux;
	

		JOptionPane.showMessageDialog(null, str);
	}

}//fim class Fila
