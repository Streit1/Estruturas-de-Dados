/*
 * Escreva um programa que empilhe notas quaisquer na pilha 1 e na pilha 2, 
 * observando que as notas dos meninos devem estar na pilha 1, já as notas das meninas na pilha 2.
 *  Crie uma função que concatene ambas as pilhas (gerando uma terceira pilha),
 *  contendo as notas dos meninos e das meninas. Imprimir todas as pilhas.
 */
import javax.swing.*;
public class PilhaMain {//ini class PilhaMain

	
	
	public static void main(String[] args) {//ini main()
		Pilha o = new Pilha();
		Concatenar b = new Concatenar();
		no no = new no();
		
		int op;
		do {
			op=Menu();
			switch (op) {
			case 1:o.push(); break;
			case 2:o.pop();break;
			case 3:b.conc(); break;
			}
		}while(op!=0);

	}//fim main()
	
	public static int Menu(){
		int op =-1;
		
		op= Integer.parseInt(JOptionPane.showInputDialog("DIGITE A OPÇÃO DESEJADA\n"
				+ "1- PARA ENTRAR COM A NOTA:\n"
				+ "2- PARA EXCLUIR NOTA:\n"
				+ "3- PARA IMPRIMIR TODAS AS NOTAS:\n"
				+ "DIGITE 0 (ZERO) PARA ENCERRAR"));
		if(op<0||op>3) {
			JOptionPane.showMessageDialog(null,"DIGITE UMA OPÇÃO VÁLIDA!");
		}//fecha o if
		
		return op;
	}//fim Menu()

}//fim class PilhaMain
