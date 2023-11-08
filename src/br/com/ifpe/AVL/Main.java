package br.com.ifpe.AVL;


public class Main {public static void main(String[] args) {

	try {
		
		AVL<Integer> avl = new AVL<Integer>();
		avl.insert(5);
		avl.insert(2);
		avl.insert(6);
		avl.insert(7);
		avl.insert(8);
		avl.insert(3);
		avl.insert(1);
		
		avl.inOrder();
		
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
		}
}}
