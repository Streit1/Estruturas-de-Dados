
import javax.swing.*;


public class PilhaSeqMain {// ini PilhaSeqMain


	public static void main(String[] args) {//ini Main
		PilhaSeq ob = new PilhaSeq(2);//passando 2 como parâmetro para o costrutor
		int op = -1;
		do {
		op = menu();
		
		switch (op){

		case 1: ob.push(); break;
		case 2: ob.printall(); break;
		case 3: ob.pop();break;
		case 4: ob.printtop(); break;
		}
		}while (op != 0);

	}//fim main

	public static int menu() {
		int op = -1;

		do {				
			try {
			op = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A OPÇÃO DESEJADA!\n"
					+ "1- PARA EMPILHAR:\n"
					+ "2- PARA IMPRIMIR A PILHA:\n"
					+ "3- PARA DESEMPILHAR\n:"
					+ "4- PARA IMPRIMIR O TOPO DA PILHA\n:"
					+ "\n0- PARA SAIR!"));
			if(op < 0 || op > 4) {
				JOptionPane.showMessageDialog(null,"DIGITE UMA OPÇÃO INVÁLIDA!\n");
			}
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"DIGITE APENAS NÚMEROS! \n" + e + "\nOPÇÃO INVÁLIDA!");
			}
		}while (op < 0);
		return op;
	}//fim mennu

}//fim PilahSeqMain
