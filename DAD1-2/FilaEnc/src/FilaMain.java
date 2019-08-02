import javax.swing.JOptionPane;

public class FilaMain {

	public static void main(String[] args) {
		Fila p = new Fila(); 

		int op = -1;
		do {
			op = Menu();
			switch(op) {
			case 1: p.push(); break;
			case 2: p.pop(); break;
			case 3: p.printall(); break;
			case 4: p.popall(); break;
			case 5: p.printfront();break;
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
				+ "4-Para excluir tudo:\n"
				+ "5-PARA IMPRIMIR O PRIMEIRO NOME DA FILA:\n"
				+ "\n0-PARA SAIR"));
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "DIGITE APENAS NÚMEROS PARA EVITAR O ERRO: " + e);
			}
			if (op < 0 || op >5) {
				JOptionPane.showMessageDialog(null, "DIGITE UMA OPÇÃO VÁLIDA " );
			}
		return op;
		}while (op <0 || op > 5);
	}
}
