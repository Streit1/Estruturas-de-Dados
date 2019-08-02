import javax.swing.JOptionPane;

public class MainPilha {//ini class MainPilha

	public static void main(String[] args) {//ini main()

		Pilha p = new Pilha();
		int op = 0;
		do {
			op=Menu();
			switch (op) {
			case 1: p.push();break;
			case 2: p.Printall(); break;
			case 3: p.PrintTop();break;
			case 4: p.soma(); break;
			case 5: p.media();break;
			case 6: p.pop();break;
			}

		}while (op!=0);


	}//fim main()



	public static int Menu() {
		int op;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog("DIGITE A OPÇÃO DESEJADA: \n"
					+ "1- INSERIR NOVO ALUNO:\n"
					+ "2- IMPRIMIR LISTA DE ALUNOS:\n"
					+ "3- IMPRIMIR O TOPO DA PILHA:\n" 
					+"4- PARA IMPRIMIR A SOMA:\n"
					+"5- PARA IMPRIMIR A MÉDIA\\n:\n"
					+ "6- EXCLUIR ELEMENTO DA PILHA\n"
					+ "\nDIGITE 0 PARA SAIR"));
			if(op < 0 || op > 6) {
				JOptionPane.showMessageDialog(null, "DIGITE UMA POÇÃO VÁLIDA!");
			}
		}while(op<0||op>6);

		return op;	
	}

}//fim class MainPilha

