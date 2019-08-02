import javax.swing.JOptionPane;

/*
 * Fazer um programa que leia uma série de strings (utilize flag para encerrar a leitura), 
 * em seguida exibir um menu com a opção de imprimir somente as strings que iniciarem com uma determinada letra 
 * (definida pelo usuário em tempo de execução), e a outra opção para imprimir todas as strings em ordem crescente. 
 * Bônus: adicione uma opção para imprimir todas as strings invertidas. Obs: impede-se o uso de sort e reverse
 */
public class MainVetor2 {//ini class MainVetor2


	public static void main(String[] args) {//ini main()
		Vetor2 obj = new Vetor2();

		int op = 0;

		do {

			op = Menu();
			switch (op) {
			case 1: obj.ler(); break;
			case 2: obj.print(); break;
			case 3: obj.printOrde(); break;
			case 4: obj.printReverse(); break;
			}

		}while (op > 0);


	}//fim main()

	public static int Menu() {
		int op = -1;


		do {
			try {
				op = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A OPÇÃO DESEJADA!\n"
						+ "1- LER STRINGS\n"
						+ "2- SELECIONAR A IMPRESSÃO\n"
						+ "3- IMPRIMIR EM ORDEM CRESCENTE\n"
						+ "4- IMPRIMIR STRING INVERTIDA\n\n"
						+ "DIGITE '0' PARA SAIR"));
				if (op>4) {//verifica se a opção digitada é válida
					JOptionPane.showMessageDialog(null,"DIGITE UMA OPÇÃO VÁLIDA! \n\n");
				}
			}catch (NumberFormatException e) {//verifica se a opção digitada é válida, se é letra ou número
				JOptionPane.showMessageDialog(null,"DIGITE APENAS NÚMEROS! \n\n" + e);//imprime o erro gerado pela opção inválida digitada
			}

		}while (op < 0 || op > 4);

		return op;
	}

}//fom class MainVetor2
