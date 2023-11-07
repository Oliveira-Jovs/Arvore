package br.com.ifpe.AVL;


public class AVL<T extends Comparable<T>> {
	Node<T> root;
	int pos;
	int cont;
	
	
	public void inOrder() {
		inOrderRec(root);
	}

	public void inOrderRec(Node<T> root) {
		if (root != null) {
			
			inOrderRec(root.Esquerda);
			System.out.print(root.elemento + " ");
			inOrderRec(root.Direita);
		}
	}
	
	public void insert(T e) throws MyException {
		insertRec(this.root, e);
	}
	
	public void insertRec(Node<T> node, T e) throws MyException {
		if (e == null) {
			throw new MyException("O valor inserido é inválido");
		}
		if (this.root == null) {
			this.root = new Node<T>(e);
		} else {
			if (e.compareTo(node.elemento) < 0) {
				if (node.Esquerda != null) {
					insertRec(node.Esquerda, e);
				} else {
					node.Esquerda = new Node<T>(e);
				}
			} else if (e.compareTo(node.elemento) > 0) {
				if (node.Direita != null) {
					insertRec(node.Direita, e);
				} else {
					node.Direita = new Node<T>(e);
				}
			}
		}
	}
	
}
