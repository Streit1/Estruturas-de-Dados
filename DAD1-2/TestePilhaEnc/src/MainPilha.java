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
		op = Integer.parseInt(JOptionPane.showInputDialog("Digite a op��o desejada!\n"
				+ "1-PARA INSERIR\n"
				+ "2-PARA EXCLUIR\n"
				+ "3-PARA IMPRIMIR A PILHA\n"
				+ "\n0 - PARA SAIR!"));
		}catch(NumberFormatException e) {
			JOptionPane.showInputDialog(e + "\n\nN�o � uma op��o v�lida!\nFAVOR DIGITE UM N�MERO!");
		}
		if(op < 0 || op > 3) {
			JOptionPane.showMessageDialog(null,"Digite uma op��o v�lida");
		}
		
		return op;
	}

}//fim class MainPilha
