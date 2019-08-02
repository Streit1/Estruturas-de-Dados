/*
 * Fazer um programa que leia uma série de strings (utilize flag para encerrar a leitura), 
 * em seguida exibir um menu com a opção de imprimir somente as strings que iniciarem com uma determinada letra 
 * (definida pelo usuário em tempo de execução), e a outra opção para imprimir todas as strings em ordem crescente. 
 * Bônus: adicione uma opção para imprimir todas as strings invertidas. Obs: impede-se o uso de sort e reverse
 */
import java.nio.charset.Charset;

import javax.swing.*;
public class Vetor2 {//ini vetor2

	private String nome []= null;
	private int qtd=0;
	
	
	public void ler() {//ini ler()
		qtd = Integer.parseInt(JOptionPane.showInputDialog("QUANTOS NOMES VAI CADASTRAR?\n"));
		nome = new String [qtd];
		do {
			for (int i = 0; i<nome.length;i++) {
				nome[i] = JOptionPane.showInputDialog ("DIGITE O NOME: ");
			}
		}while(nome.length != qtd );
		return;


	}//fim ler()
	 
	public void print() {// ini print()
		//IMPRIME STRINGS COM INICIAL QUE USUÁRIO DETERMINAR
		char letraini =  ;
		char op;
		
		String select = "O(s) NOME(s) ENCONTRADO(s) COM A INICIAL " + letraini +": \n";
		
		letraini = JOptionPane.showInputDialog("DIGITE A INICIAL PARA IMPRIMIR O(s) NOME(s):").charAt(0);
		
		for (int i = 0; i<nome.length;i++) {
			if (nome[i].charAt(letraini)==0) {
				select = select + nome[i];
			}
		}
		JOptionPane.showMessageDialog (null, select);
		
		//System.out.println("print()");
	}//fim print()

	public void printOrde() {//ini printOrde()
		//IMPRIME TODAS AS STRING DE FORMA DE CRESCENTE
		System.out.println("printOrde()");
	}//fim printOrde()

	
	public void printReverse() {//ini printReverse
		String saida = "NOMES INVERTIDOS: \n";
		for (int i = nome.length-1; i>=0; i--) {
			saida = saida + Character.toString(nome[i].charAt(i));
		}
		JOptionPane.showMessageDialog(null, saida);
		//System.out.println("printReverse()");
	}//fim printReverse()

}//fim vetor2
