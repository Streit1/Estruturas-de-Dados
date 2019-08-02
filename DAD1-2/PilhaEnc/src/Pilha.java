import javax.swing.*;
class no{
	int idade;
	no prox;
	String nome;
}

public class Pilha {//ini class Pilha

	private no topo = null;
	public Pilha() {// ini construtor

	}//fim construtor

	public void push() {//ini push()
		no temp = new no(); //cria uma nova posição na memória
		if(temp !=null) {
			temp.nome = JOptionPane.showInputDialog("DIGITE O NONE DO ALUNO: \n");
			temp.idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A IDADE DO ALUNO: \n"));
			temp.prox = topo;//recebe a referência de memória
			topo = temp;//topo recebe o valor que foi inserido
		}//fecha o if
	}//fim push()

	public void pop() {//ini pop()

		if(topo==null) {//verifica se a pilha esta vazia
			JOptionPane.showMessageDialog(null,"PILHA VAZIA!");
			return;
		}
		
		topo = topo.prox;
		
	}//fim pop() 

	public void Printall() {

		if (topo == null) {//verifica se a pilha está vazia
			JOptionPane.showMessageDialog(null,"PILHA VAZIA!");
			return;
		}//

		no temp = topo;//guarda os endereços de referência dos dados da pilha
		String str = "PILHA: \n";
		while(temp!=null) {//enquanto não chegar ao final
			str += "Aluno: " + temp.nome + " Idade: "+ temp.idade +"\n";//concatena o valor da referência
			temp = temp.prox;
		}//fecha o wwhile
		JOptionPane.showMessageDialog(null,str);
	}//fim printall()
	
	public void PrintTop() {//ini printtop()
		
	if(topo == null) {//verifica se a pilha esta vazia
		JOptionPane.showMessageDialog(null,"PILHA VAZIA!");
		return;
	}
	JOptionPane.showMessageDialog(null,"TOPO DA PILHA \n" + topo.nome + " Idade: " + topo.idade);
		
	}//fim printTop()
	
	public void soma() {//ini soma()
		if (topo == null) {//verifica se a pilha está vazia
			JOptionPane.showMessageDialog(null,"PILHA VAZIA!");
			return;
		}//

		no temp = topo;//guarda os endereços de referência dos dados da pilha
		int soma = 0;
		while(temp!=null) {//enquanto não chegar ao final
			soma += temp.idade ;//concatena o valor da referência
			temp = temp.prox;
		}//fecha o wwhile
		JOptionPane.showMessageDialog(null,"A SOMA DAS IDADES É: " + soma);
	}//fim soma()
	
	public void media() {//ini media()
		if (topo == null) {//verifica se a pilha está vazia
			JOptionPane.showMessageDialog(null,"PILHA VAZIA!");
			return;
		}//

		no temp = topo;//guarda os endereços de referência dos dados da pilha
		int soma = 0;
		int cont = 0;
		while(temp!=null) {//enquanto não chegar ao final
			cont ++;
			soma += temp.idade ;//concatena o valor da referência
			temp = temp.prox;
		}//fecha o wwhile
		JOptionPane.showMessageDialog(null,"A MÉDIA DAS IDADES É: " + soma/cont);
	}//fim media()

}//fim class Pilha
