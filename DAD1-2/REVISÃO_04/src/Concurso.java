import javax.swing.*;
//VER UMCONC


class Concurso {//ini class Concurso

	public String nome;
	public int inscricao;
	public float altura, peso;


	public Concurso() {//ini construtor()

		nome = "";
		inscricao = 0;
		altura = 0;
		peso  = 0;


	}//fim construtor()


	public void leitura(Concurso conc[]) {//ini class leitura()

		//System.out.println("PASSEI EM LEITURA!");//TESTA O MENU()
		for(int i=0 ; i<2 ; i++){
			conc[i] = new Concurso();
			//Evitar erro NullPointerException
			conc[i].nome = JOptionPane.showInputDialog("Entre com o nome: ");
			System.out.println("\nNome:" + conc[i].nome);
			conc[i].inscricao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a inscricao: "));
			System.out.println("Inscrição:" + conc[i].inscricao);
			conc[i].peso = Float.parseFloat(JOptionPane.showInputDialog("Entre com o peso: "));
			System.out.println("Peso:" + conc[i].peso );
			conc[i].altura = Float.parseFloat(JOptionPane.showInputDialog("Entre com a altura: "));
			System.out.println("Altura:" + conc[i].altura );
		}
		//TESTA O ARMAZENAMENTO DOS ATRIBUTOS
		//VER COMO CHAMA O MÉTODO IMPRIME() AQUI DENTRO
		/*for(int i=0 ; i<2 ; i++) {
		System.out.println("\n\nNome:" + conc[i].nome +
				"\nInscrição:" + conc[i].inscricao +
				"\nPeso:" + conc[i].peso + 
				"\nAltura:" + conc[i].altura);
		}*/
	}//fim leitura



	public void  calcula(Object[] conc) {//ini calcula()
		System.out.println("PASSEI EM CALCULA!");//TESTA O MENU()
		String str = "Aprovadas: ";

		for(int i=0 ; i<2 ; i++){
			if(conc[i].peso/(float)Math.pow(conc[i].altura)<18) {
				
			}//fecha o if
		}//fecha o for

	}//fim calcula



}// fim class Concurso









