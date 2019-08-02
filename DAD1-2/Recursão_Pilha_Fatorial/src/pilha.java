import javax.swing.*;
/*Recursividade usando pilha
 * 
 */
class no_pilha{//ini class no
	int n,x,y;
	no_pilha proximo;
}//fim class no

public class pilha {//ini class pilha
	private no_pilha topo = null;

	void push_fat(int num) {
		no_pilha temp_no = new no_pilha();
		if (temp_no!=null) {
			if (num>0) {
				temp_no.n=num;
				temp_no.x=num-1;
				temp_no.proximo=topo;
				topo=temp_no;
				imprime(1);
				push_fat(num-1);
			}else {
				temp_no.n=0;
				temp_no.x=0;
				temp_no.y=1;
				temp_no.proximo=topo;
				topo = temp_no;
				imprime (1);
			}
		}else//dead code
			JOptionPane.showMessageDialog(null,"NÃO FOI POSSÍVEL INSERIR!");
	}
	void pop_fat() {
		no_pilha temp_no =new no_pilha();
		if (topo!=null) {
			temp_no = topo;
			topo = topo.proximo;
			if(topo!=null) {
				if (topo.x!=0)
					topo.y=topo.x*temp_no.y;
			}else {
				topo.y=1;
				imprime(2);
				pop_fat();
			}
		}else {
			if(temp_no.n * temp_no.y!=0) {	
				JOptionPane.showMessageDialog(null,"Fatorial: "+temp_no.n*temp_no.y);
			}else {
				JOptionPane.showMessageDialog(null,"Fatorial 1: ");
				imprime(2);

			}//else { <<<<<<<<<<<<<<<<<<<<<<<<<<VERIFICAR O PROBLEMA DAS CHAVES
				JOptionPane.showMessageDialog(null,"Pilha vazia!");
			}
		}//fim pop_fat()

		void imprime(int push_pop) {//ini imprime()



			if (topo == null) {
				JOptionPane.showMessageDialog(null,"Pilha vazia...");
			}else {
				no_pilha temp_no = topo;//duplicado o nome temp_no
				String str = "Pilha: n  x  y\n";
				while(temp_no != null) {
					if (push_pop ==0) {
						str += "Push ";
					}else {
						str += "Pop ";
						str += temp_no.n + "  " + temp_no.x + "  " + temp_no.y + "\n";
						temp_no = temp_no.proximo;
					}
					JOptionPane.showMessageDialog(null,str);
				}
			}
		}//fim imprime()
	}//fim class piha
