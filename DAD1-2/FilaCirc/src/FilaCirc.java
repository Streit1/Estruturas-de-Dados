import javax.swing.*;
@SuppressWarnings("unused")

class no{// ini no
	String nome;
	no prox;
}//fim class no

public class FilaCirc {//ini class Lista

	private no fim;

	public void push() {
		no temp = new no();
		if (temp != null) {//se há espaço a memória
			temp.nome = JOptionPane.showInputDialog("Entre com o nome!");
			if(fim != null) {
				temp.prox = temp;
				fim.prox = temp;
			}else
				temp.prox = temp;
				fim = temp;
				printall();

			}else {
				JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL INSERIR!");
			}

		}//fim push()

		public void pop() {
			
		if (fim == null) {
			JOptionPane.showMessageDialog(null, "FILA VAZIA!");	
		}else {
			JOptionPane.showMessageDialog(null, "FILA VAZIA!");	
		}
		
		
		}//fim pop()

		public void printall() {
			System.out.println("print");
		}//fim print()


	}//fim class Lista
