package br.com.ifpe.SearchBynaryTree;


public class Main {public static void main(String[] args) {
	try {
		
		BST<Integer> arvore = new BST<Integer>();
		arvore.insert(5);
		arvore.insert(2);
		arvore.insert(4);
		arvore.insert(17);
		arvore.insert(9);
		arvore.insert(71);
		arvore.insert(100);
		arvore.insert(110);
		arvore.insert(120);
		arvore.insert(130);
		arvore.insert(140);
		arvore.insert(150);
		arvore.insert(160);
		arvore.insert(170);
		arvore.insert(180);
		arvore.insert(190);
		arvore.insert(200);
		arvore.insert(45);
		arvore.insert(38);
		arvore.remover(38);
		arvore.insert(25);
		arvore.insert(5);
	
		
		//arvore.inOrder();
		//arvore.convertToVector(arvore);
		
		
		
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
		}
	
	
	

}
}


