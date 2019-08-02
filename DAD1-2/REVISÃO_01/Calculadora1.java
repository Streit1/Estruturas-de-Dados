import javax.swing.*;
public class Calculadora1 {// inicio class calc

	public int n1,n2;
	
	public Calculadora1() {//construtor
		n1 = 0;
		n2 = 0;
	}
	
	public int menu(){//ini menu
		int op = 0;
		do {
			try {
				op=Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE A OPÇÃO DESEJADA!\n"+
						"1- LER INTEIROS\n"+
				"2-SOMAR\n"+
								"3-SUBTRAIR\n"+
				"4-DIVIDIR\n"+
								"5-MULTIPLICAR\n"+
				"6-SAIR\n"));
			}catch(NumberFormatException erro){
				JOptionPane.showMessageDialog(null,"ERRO:" + erro);
			}
		
		
		}while(op <1||op>6);
		
		return op;
	}//fim menu
	
	public void ler() {//ini ler()
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"ENTRE COM O PRIMEIRO NUMERO"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"ENTRE COM O SEGUNDO NUMERO"));
	}//fim ler()
	
	public void soma() {//ini soma
		int soma;
		soma = n1 + n2;
		JOptionPane.showMessageDialog(null,"A SOMA DE "+n1+" + "+n2+" É "+soma);
	}//fim soma
	
	public void subtrai() {//ini subtrai
		int sub = 0;
		sub = n1 - n2;
		JOptionPane.showMessageDialog(null,"A SUBTRAÇÃO É: "+sub);
	}//fim subtrai
	
	public void multiplica() {//ini multiplica
		int mult = 0;
		mult = n1 * n2;
		JOptionPane.showMessageDialog(null,"O RESULTADO DA MULTIPLICÃO E: "+mult);
	}//fim multiplica
	
	public void div() {//ini div
		int div=0;
		div = n1/n2;
		JOptionPane.showMessageDialog(null,"O RESULTADO DA DIVIÇÃO E: "+div);
	}//fim div
	
	
	
}//fim class calc
