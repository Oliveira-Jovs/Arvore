package br.com.ifpe.ListDuplCir;

import br.com.ifpe.list.MyException;

public class Main {public static void main(String[] args) throws MyException {
	try {
		
	ListaDuplamenteCircular<Integer> lista = new ListaDuplamenteCircular<>();
	
	lista.adicionar(2);
	lista.adicionar(4);
	lista.adicionar(6);
	lista.adicionar(8);
	lista.adicionar(10);
	lista.adicionar(12);
	
	
	lista.remover(5);
	lista.remover(4);
	lista.remover(3);
	lista.remover(2);
	lista.remover(1);
	
	
	System.out.println(lista.toString());
	
	
	} catch (Exception e) {
		System.out.println(e);
	} 
}

}
