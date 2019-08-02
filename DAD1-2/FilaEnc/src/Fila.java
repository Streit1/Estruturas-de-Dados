import javax.swing.JOptionPane;

class no{
	String nome;
	no prox;
}
public class Fila {//fila 

	private no ini = null, fim = null;

	public void push() {
		no temp = new no();//instancia um objeto com nome temp do tipo no
		if(temp != null) {
			temp.nome = JOptionPane.showInputDialog("Digite o nome: ");
			if(fim == null) {//se é o primeiro a ser inserido
				ini=fim=temp;
			}else {
				fim.prox = temp;//fim.prox = endereço do novo elemento
				fim = temp;//fim recebe o novo elemento digitado
			}
		}
	}//fim push()

	public void pop() {
		if(ini==null) {
			JOptionPane.showMessageDialog(null,"IMPOSSÍVEL EXCLUIR!\nFila vazia!");
			return;
		}
		ini = ini.prox;//temp recebe o endereço do próximo elemento da fila
		if(ini==null) {//se foi removido o último
			fim = null;
		}//fim if
	
	}//fim pop()
	
	public void popall() {
		if(ini==null) {
			JOptionPane.showMessageDialog(null,"IMPOSSÍVEL EXCLUIR!\nFila vazia!");
			return;
		}
		while(ini!=null) {
		ini = ini.prox;
		}
		
		JOptionPane.showMessageDialog(null,"FILA EXCLUÍDA COM SUCESSO!");
	}
	
	public void printfront() {
		
		if(ini==null) {
			JOptionPane.showMessageDialog(null,"IMPOSSÍVEL IMPRIMIR\nFila vazia!");
			return;
		}
		
		JOptionPane.showMessageDialog(null,"PRIMEIRO NOME DA FILA: " + ini.nome);
	}//fim printfront()

	public void printall() {

		if(ini==null) {
			JOptionPane.showMessageDialog(null,"IMPOSSÍVEL IMPRIMIR\nFila vazia!");
			return;
		}

		String str = "Fila \n";
		no temp = ini;//novo no chamado temp, recebe o endereço de ini
		while(temp != null) {//enquanto não chegar ao final da fila
			str += temp.nome + " "; //str = str + temp.nome + " ";
			temp = temp.prox;//temp recebe o endereço do próximo elemento da fila
			
		}//fim while
		
		JOptionPane.showMessageDialog(null, str);


	}//fim printall()

}//fim class Fila
