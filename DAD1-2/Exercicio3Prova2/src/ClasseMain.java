import javax.swing.JOptionPane;

public class ClasseMain {

	public static void main(String[] args) {
		int op= -1;
		Classes obj = new Classes();

		do {
			op = menu();

			switch(op){
			case 1: obj.push();break;
			case 2: obj.pop();break;
			case 3: obj.print();break;

			}
		}while (op!=0);


	}//FIM MAIN

	public static int menu() {
		int op = -1;
		do {


			op = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NÚMERO: \n"
					+ "1-PARA INSERIR\n"
					+ "2- PARA transferir\n"
					+"3- para imprimir"
					+ "0 PARA SAIR\n"));
		}while (op < 0 || op > 2);
		return op;
	}//FIM MENU()

}//FIM CLASSEMAIN
