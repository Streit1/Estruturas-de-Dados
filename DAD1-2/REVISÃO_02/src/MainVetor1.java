import javax.swing.JOptionPane;
//Classe principal do programa vetor1
public class MainVetor1 {//inIcio class MainVetor1

	public static void main(String[] args) {//inicio main()
		
		Vetor1 a = new Vetor1();

		int op = 0;
		do {
			
			op=Menu();
			
			switch (op) {
			
			case 1: a.Ler(); break;
			case 2: a.Ordena(); break;
			case 3: a.Repete(); break;
			case 4: a.Delete(); break;
			case 5: a.Media(); break;
			case 6: System.exit(0);
			}
			
		}while (op!=6);
		
		
	}//fim main()
	
	public static int Menu() {//incio Menu()
		
		
		
		
		int op=0;
		do {

			op = Integer.parseInt(JOptionPane.showInputDialog(null,"ESCOLHA UMA DAS OP��ES ABAIXO!\n\n"
				
				+ "1 - LER VALORES\n"
				+ "2 - ORDENAR\n"
				+ "3 - IMPRIMIR QUANTIDADE DE REPETI��ES\n"
				+ "4 - GERAR LISTA SEM REPETI��ES\n"
				+ "5 - IMPRIMIR M�DIA\n"
				+ "6 - PARA SAIR\n"));
		
		}while (op < 1 || op > 6);

		return op;
		
	}//fim Menu()

}//fim class MainVetor1
