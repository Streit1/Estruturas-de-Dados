import javax.swing.*;
public class FilaCircMain {

	public static void main(String[] args) {
		int op = 1;
		FilaCirc a = new FilaCirc();
		do {
			op = Menu();
			switch(op) {
			case 1:a.push(); break;
			case 2:a.pop(); break;
			case 3:a.printall(); break;
			}
			
		}while (op != 0);

	}//fim main()
	
	public static int Menu() {
		int op = -1;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A OPÇÃO DESEJADA!\n"
				+ "1- PARA INSERIR\n"
				+ "2- PARA EXCLUIR\n"
				+ "3- PARA IMPRIMIR\n"
				+" 0 PARA SAIR!"));
		
		return op;
	}//fim menu

}
