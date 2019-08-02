import javax.swing.*;
public class Vetor1 {

	int A[];
	private boolean ordenado = false;

	public Vetor1(){// inicio construtor
		A = null;//inicializa o vetor com posições vazias
	}// fim construtor

	public void Ler() {//inicia lerN()

		int N = 0;

		do {
			try { 
				N = Integer.parseInt(JOptionPane.showInputDialog( "DIGITE O VALOR DE N: (Quantas posições terá o vetor)"));
			}catch(NumberFormatException erro ) {
				JOptionPane.showInputDialog( "DIGITE SOMENTE NÚMEROS");
			}			
		}while(N<1 || N>100);//fecha o do-while

		A = new int [N];

		for (int i = 0; i<N; i++) {//abre o for
			A[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE O VALOR DE A: "));			
		}//fecha o for

		ordenado = false;//

	}//fim Ler()

	public void Ordena() {//ini Ordena() IMPRIME O VETOR DE FORMA ORDENADA
		boolean trocou;
		int aux, j, i;
		j = A.length;// j recebe o tamanho do vetor
		do {//MÉTODO BOLHA<<<<<<<<<<<<<<<
			trocou = false;
			for(i=0 ;i<j-1; i++) {//
				if(A[i]>A[i+1]) {//Verifica se o segundo valor é maior que o primeiro
					aux = A[i];
					A[i] = A [i+1];
					A[i+1] = aux;
					trocou = true;
				}//fecha o if

			}//fecha o for
			j--;//a cada repetição o for, percorre um valor a menos no método bolha

		}while (trocou);

		String str = "VETOR ORDENADO: \n";
		for (i = 0; i<A.length; i++) {
			str = str + A[i] + "  ";
		}
		JOptionPane.showMessageDialog(null, str);
		ordenado = true;

	}//fim Ordena()<<<<<<<<<<<<<<<<<<PAREI DE COPIAR AQUI KKKKKKKKKKK

	public void Repete() {//inicio Repete()
		if (!ordenado) {
			return;
		}

		String str = "REPETIÇÕES: /n";

		int qtde = 0;
		for (int i = 0; i<A.length-1; i++) {
			if (A[i] == A[i+1]) {
				qtde ++;
			}else {
				str += A[i] + "Possui " + qtde + "repet.\n";
				
			}//fecha o else
		}//fecha o for
		
		if (qtde == 0) {
			JOptionPane.showMessageDialog(null, "NÃO HÁ NÚMEROS REPETIDOS NO VETOR");
		}else{
			JOptionPane.showMessageDialog(null, "possui " + qtde + " repetidos.");
		}



	}//fim Repete()

	public void Delete() {//inicio Delete()
		if (A == null || !ordenado) {
			return;
		}
		
		int B[] = new int [A.length], iB, i=0;
		
		for ( i=0, iB = 0; i < A.length-1; i++ ) {
			if (A[i]!=A[i+1]) {
				B[iB++] = A[i];
			}
		}
		
		B[iB]=A[i];
		String str = "VETOR SEM REPETIÇÕES \n";
		for (i=0;i<=iB;i++) {
			str += B[i]+" ";
		}
		JOptionPane.showMessageDialog(null,  str);
	}//fim Delete()

	public void Media() {//inicio Media()
		
		double soma = 0; //variável que recebe a soma dos números do vetor A
		for (int i = 0; i < A.length; i++) {//for para percorrer o vetor A 
			soma = soma + A[i];//soma recebe os seus próprios valores somando com o novo valor do vetor
		}
		
		JOptionPane.showMessageDialog(null,"A Média dos valores digitados é: " + soma/A.length);// imprime a média, soma dividido pelo tamanho do vetor
		
	}//fim Media()



}
