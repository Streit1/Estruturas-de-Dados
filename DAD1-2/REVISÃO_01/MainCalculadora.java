
public class MainCalculadora {//ini class Main

	public static void main(String[] args) {//ini main
		// TODO Auto-generated method stub
		Calculadora1 i = new Calculadora1();
		
		int op = 0;
		
		
		
		do {
			op = i.menu();
			
			switch (op){
			
				case 1: i.ler();break;
				case 2: i.soma();break;
				case 3: i.subtrai();break;
				case 4: i.div(); break;
				case 5: i.multiplica();break;
				case 6: System.exit(0);
			}
		}while (op != 6);
		
		
	}//fim main

}//fim class main
