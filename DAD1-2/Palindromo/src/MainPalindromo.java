import javax.swing.JOptionPane;

public class MainPalindromo {//ini mainPalindromo

	public static void main(String[] args) {//ini main
		Pilha p = new Pilha();
		
		String temp = JOptionPane.showInputDialog("Digite a palavra!");
		for(int i=0; i<temp.length();i++) {
			p.push(temp.charAt(i));
		}
		
		p.palindromo(temp);

	}//fim main
	

}//fim mainPalindromo
