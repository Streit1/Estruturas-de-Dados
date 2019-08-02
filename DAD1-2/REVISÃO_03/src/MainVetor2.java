import javax.swing.JOptionPane;

/*
 * Fazer um programa que leia uma s�rie de strings (utilize flag para encerrar a leitura), 
 * em seguida exibir um menu com a op��o de imprimir somente as strings que iniciarem com uma determinada letra 
 * (definida pelo usu�rio em tempo de execu��o), e a outra op��o para imprimir todas as strings em ordem crescente. 
 * B�nus: adicione uma op��o para imprimir todas as strings invertidas. Obs: impede-se o uso de sort e reverse
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
				op = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A OP��O DESEJADA!\n"
						+ "1- LER STRINGS\n"
						+ "2- SELECIONAR A IMPRESS�O\n"
						+ "3- IMPRIMIR EM ORDEM CRESCENTE\n"
						+ "4- IMPRIMIR STRING INVERTIDA\n\n"
						+ "DIGITE '0' PARA SAIR"));
				if (op>4) {//verifica se a op��o digitada � v�lida
					JOptionPane.showMessageDialog(null,"DIGITE UMA OP��O V�LIDA! \n\n");
				}
			}catch (NumberFormatException e) {//verifica se a op��o digitada � v�lida, se � letra ou n�mero
				JOptionPane.showMessageDialog(null,"DIGITE APENAS N�MEROS! \n\n" + e);//imprime o erro gerado pela op��o inv�lida digitada
			}

		}while (op < 0 || op > 4);

		return op;
	}

}//fom class MainVetor2
