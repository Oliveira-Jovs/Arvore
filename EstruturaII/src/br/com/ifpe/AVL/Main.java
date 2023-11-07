package br.com.ifpe.AVL;


public class Main {public static void main(String[] args) {

	try {
		
		AVL<Integer> avl = new AVL<Integer>();
		avl.insert(5);
		avl.insert(2);
		avl.insert(4);
		avl.insert(17);
		avl.insert(9);
		avl.insert(71);
		avl.insert(100);
		avl.insert(110);
		avl.insert(120);	
		
		avl.inOrder();
		
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
		}
}}
