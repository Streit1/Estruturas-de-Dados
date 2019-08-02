
public class Àrvore {

	public node remover(node aux, int num) {
		if (aux.info ==num) {
			if (aux.esq==aux.dir) {
				return null;
			}else {
				if(aux.esq == null) {
					return aux.dir;
				}else {
					if (aux.dir ==null) {
						return aux.esq;
					}else {
						p2 =p=aux.dir;
						while(p.esq!=null) {
							p =p.esq;
						}
							p.esq = aux.esq;
							return p2;
						
					}
				}
			}
		}else {
			if(aux.info<num) {
				aux.dir=remover(aux.dir,num);
			}else {
				aux.esq=remover(aux.esq,num);

			}
		}
		retunr aux;
	}
	
	public int prof(node raiz) {
		if (raiz == null)
			return -1;
		else {
			int esq = prof(raiz.esq);
			int dir = prof(raiz.dir);
			if (esq>dir) {
				return esq +1;
				
			}else {
				return dir +1;
			}
		}
	}//fim prof

}//árvore
