import javax.swing.JOptionPane;

public class MainPilha {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		int op = -1;
		
		do {
			op = Menu();
			switch(op) {
			case 1: p.push(); break;
			case 2: p.pop();break;
			case 3: p.printall(); break;
			}
		}while(op !=0);
		

	}//fim main	
	
	public static int Menu() {
		int op=-1;
		try {
		op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada!\n"
				+ "1-PARA INSERIR\n"
				+ "2-PARA EXCLUIR\n"
				+ "3-PARA IMPRIMIR A PILHA\n"
				+ "\n0 - PARA SAIR!"));
		}catch(NumberFormatException e) {
			JOptionPane.showInputDialog(e + "\n\nNão é uma opção válida!\nFAVOR DIGITE UM NÚMERO!");
		}
		if(op < 0 || op > 3) {
			JOptionPane.showMessageDialog(null,"Digite uma opção válida");
		}
		
		return op;
	}

}//fim class MainPilha
