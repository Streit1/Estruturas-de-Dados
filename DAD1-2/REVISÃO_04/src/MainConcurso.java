/*
 *  Fazer um programa que: 
 *  a) leia o número de inscrição, altura e peso das moças inscritas em um concurso de beleza (utilize flag adequada para encerrar a leitura);
 *  b) calcule e imprima as moças aprovadas para o concurso, ou seja, as moças com IMC inferior a 18. IMC = índice de massa corporal (peso / altura2).
 */
import javax.swing.*;

public class MainConcurso {//ini class MainConcurso
	

	public static void main(String[] args) {//ini Main()
		Concurso conc[] = new Concurso[2];
		Concurso obj = new Concurso();
		int op = -1;
		
		do {
			op = Menu();
			switch(op){
			case 1: obj.leitura(conc); break;
			case 2: obj.calcula(conc); break;
			}
			
		}while (op >0);
		
		

	}//fim Main()
	
	public static int Menu() {// menu()
		int op = -1 ;
		do {
			try {
			op = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO AO CONCURSO!\n"
					+ "DIGITE A OPÇÃO DESEJADA!\n"
					+ "1-PARA SE INSCREVER\n"
					+ "2-PARA IMPRIMIR DADOS DAS CANDIDATAS CADASTRADAS\n\n"
					+ "DIGITE 0 (ZERO) PARA SAIR"));
			if(op>2) {
				JOptionPane.showMessageDialog(null, "DIGITE UMA OPÇÃO VÁLIDA!");
			}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, " DIGITE UMA OPÇÃO VÁLIDA!\n\nPARA EVITAR O ERRO: " + e + "!");
							}
		}while(op < 0 || op >2 );
		
		return op;
	}//fim menu()

}//fim class MainConcurso

