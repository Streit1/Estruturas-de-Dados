/*
 * Escreva um programa que empilhe notas quaisquer na pilha 1 e na pilha 2, 
 * observando que as notas dos meninos devem estar na pilha 1, j� as notas das meninas na pilha 2.
 *  Crie uma fun��o que concatene ambas as pilhas (gerando uma terceira pilha),
 *  contendo as notas dos meninos e das meninas. Imprimir todas as pilhas.
 */
import javax.swing.*;

class no{//ini class no

	float nota;
	no prox;

}//fim class no

public class Pilha {//ini Pilha

	private no topom;
	private no topof;

	public Pilha() {//ini construtor


	}//fim construtor

	public void push(){//ini push()
		no temp = new no();
		char sexo;
		sexo = JOptionPane.showInputDialog( "DIGITE 'M' PARA MASCULINO\n      'F' PARA FEMININO\n").charAt(0);
		if(sexo == 'M' || sexo == 'm') {
			temp.nota = Float.parseFloat(JOptionPane.showInputDialog("DIGITE A NOTA!"));
			temp.prox = topom;
			topom = temp;
		}
			if (sexo == 'F' || sexo == 'f') {
				temp.nota = Float.parseFloat(JOptionPane.showInputDialog("DIGITE A NOTA!"));
				temp.prox = topof;
				topof = temp;
			}
		

		printall();
	}//fim push()

	public void pop() {//ini pop()
		if (topom == null) {
			JOptionPane.showMessageDialog(null, "PILHA VAZIA");
			return;
		}


	}//fim pop()

	public void printall() {//ini printall()

		String str = "NOTAS MASCULINAS: ";
		String str2 = "NOTAS FEMININAS: ";
		no temp = topom;
		no temp2 = topof;
				
		if (topom == null) {
			JOptionPane.showMessageDialog(null,"N�O H� NOTAS MASCULINAS PARA IMPRIMIR!\n");
		}else {
			str += temp.nota + "\n";
			temp = temp.prox;
			JOptionPane.showMessageDialog(null, str );
		}
		if(topof == null) {
			JOptionPane.showMessageDialog(null,"N�O H� NOTAS FEMININAS PARA IMPRIMIR!\n");
		}else {
			str2 += temp2.nota + "\n";
			temp2 = temp2.prox;
			JOptionPane.showMessageDialog( null, str2);
		}

		

	}//fim printall()


}//fim Piha
