import javax.swing.JOptionPane;

class no{
	char letra;
	no prox;
}

public class Pilha{//ini palindromo

	private no topo;


	public void push(char letra) {//ini push()
		no novo = new no();

		if (novo == null) {
			return;
		}
		novo.letra = letra;
		novo.prox = topo;
		topo = novo;

	}//fim push()

	public char pop() {//ini pop()
		char letra = topo.letra;
		topo = topo.prox;
		return letra;
	}//fim pop()

	public void palindromo(String temp) {//ini 
		String str = "";
		while (topo!= null) {
			str += pop();
			if (temp.equals(str)) {
				JOptionPane.showMessageDialog(null,str + " É Palindromo!");
			}else {
				JOptionPane.showMessageDialog(null,str + " Não é Palindromo!");
			}
		}
	}//fim palindromo

}//fim palindromo
