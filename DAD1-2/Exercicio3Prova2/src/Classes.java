import javax.swing.JOptionPane;

class no{
	int num;
	no ant;
	no prox;
}//fim class no

public class Classes {//ini classes

	private no ini_fila, fim_fila;//fila
	private no ini, fim; //lista

	void push() {//push() Fila
		no temp = new no();//instancia um objeto com nome temp do tipo no
		if(temp != null) {
			temp.num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
			if(fim_fila == null) {//se é o primeiro a ser inserido
				ini_fila=fim_fila=temp;
			}else {
				fim_fila.prox = temp;//fim.prox = endereço do novo elemento
				fim_fila = temp;//fim recebe o novo elemento digitado
			}
		}
	}//fim push()

	no pop() {//
		no temp;

		if(ini_fila==null) {
			JOptionPane.showMessageDialog(null,"IMPOSSÍVEL EXCLUIR!\nFila vazia!");
			return null;
		}
		temp = ini_fila;
		ini_fila = ini_fila.prox;//temp recebe o endereço do próximo elemento da fila

		if(ini_fila==null) {//se foi removido o último
			fim_fila = null;
		}//fim if

		return temp;

	}//fim pop() da fila

	void push_lista() {

		no temp = pop();
		if (temp == null) {//verifica se foi alocado memoria para temp
			JOptionPane.showMessageDialog(null, "NÃO HÁ MEMÓRIA PARA CRIAR UMA LISTA!");
			return;
		}//CÓDIGO MORTO???
		temp.num = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE UM NUMERO PARA INCLUIR: \n"));	
		//System.out.print("Num vale: " + temp.num);//<<<<<<<<<<<<<<<<<<<<<<<<<<<<

		if (ini ==null) {//se o primeiro a ser inserido
			temp.prox = null;
			temp.ant = null;
			ini = fim = temp;
			//LINHA PA A TESTE
			//System.out.println("ini vale" + ini+"\n"+"fim vale: "+fim+"\ntemp.ant recebeu: "+temp.ant);

		}else{
			if (temp.num<=ini.num) {//se o numero digitado é <= que o primeiro
				temp.prox=ini;
				ini.ant= temp;
				ini=temp;

				//temp.ant=null;
				//LINHA PARA TESTE
				//System.out.println("\n\ntemp.prox recebe: " + temp.prox +"\nini recebe: "+ini+"\ntemp.ant recebe: "+temp.ant);
			}else {
				if(temp.num >= fim.num) {//se o numero digitado é >= que o ultimo
					fim.prox = temp;//
					temp.ant = fim.prox;//temp.ant recebe o endereço de memória de fim;
					fim = temp;// fim recebe temp					
					temp.prox = null;//
					//LINHA PARA TESTE
					//System.out.println("\n\nfim.prox recebeu: "+fim.prox+"\ntemp.ant recebeu: " +temp.ant+"\nfim recebeu: "+fim+"\ntemp.prox recebeu: "+temp.prox);

				}else {//para inserir no meio
					no aux = ini;
					do{
						if (temp.num<=aux.prox.num) {//no meio 

							temp.prox = aux.prox;
							temp.ant = aux;
							aux.prox.ant = temp;
							aux.prox = temp;
							//aux.ant = temp.ant;

							break;
						}
						aux = aux.prox;
						//System.out.println("TESTE INSERIR NO MEIO");
					}while(true);
				}
			}
		}


	}//fim push-lista()

	void print() {

		int n = 0;

		String str = " ";
		if (fim != null) {
			no temp = ini.prox;
			do {
				n++;
				str += temp.num + " ";
				temp = temp.prox;
			}while (temp != ini.prox);
			String inver[] = new String[n];
			temp = fim.prox;
			n=0;

			do {
				inver[n++] = 
						[temp.num;
				temp = temp.prox;
			}while (temp != fim.prox);

			for (int i= n-1; i >= 0; i--) {
				str += inver[i] + " ";
			}

		}

	}//fim print()



}//fim classes
