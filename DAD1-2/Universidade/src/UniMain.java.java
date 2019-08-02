

/*ERROS A VERIFICAR
 * VERIFICAR COMO USAR A VARIÁVEL SEXO COM (CHAR) POIS NÃO FUNCIONOU, DEU ERRO NA LINHA 48 DE UNIVERSIDADE
 * ERRO NA LINHA 44 DA CLASSE UNIVERSIDADE
 * NÃO ESTÁ RODANDO O MÉTODO REPROVADOS
 * VERIFICAR COMO IMPRIME EM LISTA OS APROVADOS E OS REPROVADOS
 */

public class UniMain {//inicio UniMain


	
	public static void main(String[] args) {//Inicio Main
		Universidade u = new Universidade();	
		int opcao;
		do {
			
			opcao = u.menu();//o objeto chama o método menu();
			
			switch (opcao) {//switch só funciona com variável do tipo inteiro
			case 1: u.ler();
			
			break;
			case 2: u.aprovados();//Imprime lista de aprovados
			
			break;
			
			case 3: u.exame();//Imprime lista de alunos em exame
			
			break;
			
			case 4: u.Maior_Menor();//Imprime a maior e a Menor nota
				
			break;
				
			case 5: System.exit(0);

			}
		}while(opcao!=5);
	}//fim main
			
		

}//fim UniMain
