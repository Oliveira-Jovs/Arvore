package br.com.ifpe.ListDuplCir;

import br.com.ifpe.list.MyException;

public class mainntes {public static void main(String[] args) throws MyException {
	Se<Integer> teste = new Se<Integer>();
	
	teste.adicionarIndice(0,2);
	teste.adicionarIndice(1,4);
	teste.adicionarIndice(2,6);
	teste.adicionarIndice(3,8);
	teste.adicionarIndice(4,10);
	teste.adicionarIndice(2,12);
	
	System.out.println(teste.toString());
}

}
