import javax.swing.*;

class Dados{//inicio dados
	String inscr;
	char sexo;// VERIFICAR --> COMO CHAR DEU ERRO NA LINHA 48
	float Nota1, Nota2;
	
}//fim dados

public class Universidade {//incio Universidade
	Dados vet[] = new Dados [100];//cria o vetor vet com 100 posições
	private int qtde = 0;//cria a variável qtde iniciada com 0
	
	
	public int menu() {//inicio menu()
		int op=0;//variável inteira para receber a opção do usuário
		do {
			try {
			op=Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE A OPÇÃO DESEJADA \n"+
		"1-RECEBER ALUNOS:\n"+//ler()
		"2-IMPRIMIR LISTA DE APROVADOS\n"+//aprovados()
		"3-IMPRIMIR LISTA DE ALUNOS EM EXAME\n"+//exame()
		"4-IMPRIMIR MAIOR NOTA E A MENOR NOTA\n"+//Maior_Menor()
		"5- SAIR!"));//SAIR DO PROGRAMA
			}catch	(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "ERRO! DIGITE UMA OPÇÃO VÁLIDA");
			
			}
		 
		} while (op<1||op>5);
				
		return op;//retorna a opção digitada
		
	}//fim menu
				
		
	

	public void ler() {//incio ler()
		if (qtde ==5)return;//MUDAR A QUANTIDADE 5
		do {
			vet[qtde]= new Dados();//a primeira posição
			vet[qtde].inscr = JOptionPane.showInputDialog("Digite a inscrição: \n(ZERO PARA SAIR!)\t");
			if(vet[qtde].inscr.charAt(0) =='0') {//Quando digitar 0 (zero) SAI MÉTODO
				vet[qtde]=null;
				break;
			}
			vet[qtde].sexo = JOptionPane.showInputDialog(null,"Digite: \n [M] PARA MASCULINO \n [F] PARA FEMININO: ").charAt(0);//PRECISA COLOCAR O CHARAT (O), ONDE ZERO SIGNIFICA QUE IRÁ PEGAR A PRIMEIRA LETRA A SER DIGITADA
			vet[qtde].Nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a Nota 1: "));
			
			vet[qtde].Nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a Nota 2: "));
			
			qtde ++;
		}while(qtde<5);//MUDAR A QUANTIDADE 5
	}//fim ler()
	
	public void aprovados() {//inicio aprovados()
		for (int i =0; i< qtde;i++) {//FIZ UM TESTE PARA IMPRESSÃO -->JOptionPane.showMessageDialog(null, "LISTA DE ALUNOS: " + vet[i].sexo + vet[i].Nota1 +vet[i].Nota2);
			if ((vet[i].Nota1 + vet[i].Nota2) / 2 >=7) {
				JOptionPane.showMessageDialog(null,"APROVADO: \n" + "INCRIÇÃO: " +vet[i].inscr + "\n" + "SEXO: "+vet[i].sexo);
			}
		}
	}//fim aprovados()
	
	public void exame() {//incio exame()
		//JOptionPane.showMessageDialog(null, "MÉTODO EXAME!");
		for (int a =0; a< qtde;a++) {//foi usado a variável (i) e tbm não deu certo
			if ((vet[a].Nota1 + vet[a].Nota2) / 2 <7) {
				JOptionPane.showMessageDialog(null,"REPROVADO: \n" + "INCRIÇÃO: " +vet[a].inscr + "\n" + "SEXO: "+vet[a].sexo);
			}
		}
	}//fim exame()

	public void Maior_Menor() {//incio Maior_Menor()
		//VERIFICAR O MOTIVO PORQUE ESTE MÉTODO NÃO ESTÁ RODANDO
		//IMPRIMIR O ALUNO COM A MAIOR MÉDIA E O ALUNO COM A MENOR MÉDIA
		float maior = 0 ,menor = 0; 
		for(int i =0; i <qtde; i++) {
			if(vet[qtde].Nota1 > maior){   
                maior = vet[qtde].Nota1;  
            }  
			if(vet[qtde].Nota1 < menor){  
                menor = vet[qtde].Nota1;  
            }
        JOptionPane.showMessageDialog(null,"A Maior nota é: " + maior + "\nDo aluno/inscrição: " + vet[i].inscr);
        if(vet[qtde].Nota2 > maior){   
            maior = vet[qtde].Nota2;  
        }
		if(vet[qtde].Nota2 < menor){  
            menor = vet[qtde].Nota2;  
        }  
        JOptionPane.showMessageDialog(null,"A Menor nota é: " + menor + "\nDo Aluno/inscrição: " + vet[i].inscr);
		}
	    
		
	}//fim Maior_Menor()
	

	

}//fim Universidade
