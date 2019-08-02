import javax.swing.*;

public class FilaMain {

	public static void main(String[] args) {
		Fila p = new Fila(2); 

		int op = -1;
		do {
			op = Menu();
			switch(op) {
			case 1: p.Push(); break;
			case 2: p.pop(); break;
			case 3: p.printall(); break;
			case 4: p.printini();break;
			case 5: p.popall(); break;
			}
			
		}while (op!=0);
		
	}// fim Main
	
	public static int Menu() {
		int op= -1;
		
		do {
			try {
		op= Integer.parseInt(JOptionPane.showInputDialog("DIGITE A OPÇÃO DESEJADA!\n"
				+ "1-PARA INSERIR\n"
				+ "2-PARA EXCLUIR\n"
				+ "3-PARA IMPRIMIR TODA A FILA\n"
				+ "4-PARA IMPRIMIR O PRIMEIRO NOME DA FILA\n"
				+ "5-PARA EXCLUIR TODA A FILA\n"
				+ "0-PARA SAIR"));
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "DIGITE APENAS NÚMEROS PARA EVITAR O ERRO: " + e);
			}
			if (op < 0 || op >5) {
				JOptionPane.showMessageDialog(null, "DIGITE UMA OPÇÃO VÁLIDA " );
			}
		return op;
		}while (op <0 || op > 5);
	}

}//fim FilaMain
