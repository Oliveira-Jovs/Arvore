package br.com.ifpe.SearchBynaryTree;

import br.com.ifpe.list.MyException;

public class Maine {public static void main(String[] args) throws MyException {

	Serar<Integer> arvre = new Serar<Integer>();

	arvre.insert(110);
	arvre.insert(50);
	arvre.insert(100);
	arvre.insert(40);
	arvre.insert(90);
	arvre.insert(70);
	arvre.insert(10);
	arvre.insert(20);
	arvre.insert(80);
	arvre.insert(60);
	arvre.insert(30);
	
	arvre.inOrder();
	
	arvre.toString();
	
	//arvre.convertToVector(arvre);

}}
