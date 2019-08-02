import javax.swing.*;

class no{
	int n,x,y;
	no prox;
}// class no

public class Pilha {

	no topo = new no();

	int soma() {


		return Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR PARA SOMAR:"));


	}//fim soma

	public void push(int n) {

		no temp = new no();

		if (temp != null) {
			if (n > 0) {
				temp.n = n;
				temp.x = n-1;
				temp.prox = topo;
				topo = temp;
				//n = n -1;
				print(0);
				push(n-1);
			}else {
				temp.n = 0;
				temp.x = 0;
				temp.y = 1;
				temp.prox = topo;
				topo = temp;
				print(1);
			}

		}else{//fecha primeiro if
			JOptionPane.showMessageDialog(null,"NÃO FOI POSSÍVEL INSERIR");
		}


	}//fim push()

	public void print(int push_pop) {
	
		if (topo == null) 
			JOptionPane.showMessageDialog(null,"Pilha vazia..."); 
		else{ no temp_no = topo; String str = "Pilha:  n  x  y\n"; 
		while(temp_no != null){ 
			if (push_pop == 0) {
				str += "Push  ";
			}else {
				str += "Pop  "; 
				str += temp_no.n + "   " + temp_no.x + "   " + temp_no.y + " \n"; temp_no = temp_no.prox; 

			} JOptionPane.showMessageDialog(null,str); 
		}
		}
	} 


	public void pop() {

		no temp = new no();
		int soma = 0;
		if (topo != null) {
			temp = topo;
			topo= topo.prox;
			if (topo.x>=0) {//<<<<<<<<<<<<<<<<<<<
				topo.y = topo.x + temp.y;

			}else {
				topo.y=1;
				print(2);
			}//fecha segundo if
		}else {
			if(temp.n+temp.y!=0) {
				JOptionPane.showMessageDialog(null,"Soma: " + temp.n + temp.y);
				soma += temp.n + temp.y;
				System.out.println("Soma: " + soma);
			}else {
				JOptionPane.showMessageDialog(null,"PILHA VAZIA!");
			}
		}
		JOptionPane.showMessageDialog(null,"Soma:"+soma);
	}//fim pop()

}//fim class Pilha
