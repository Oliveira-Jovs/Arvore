package br.com.ifpe.SearchBynaryTree;


import java.util.ArrayList;

import br.com.ifpe.list.MyException;

public class Serar<T extends Comparable<T>> {
	Node<T> root;
	ArrayList<T> sergio = new ArrayList<T>();
	public T[] convertToVector(Serar<T> tree) {
		
		//tree.inOrder();
		System.out.println("--> " );
		//T[] array = (T[]) new Object();
		
		CovertRecur(root);
		for (T t : sergio) {
			System.out.println(t);
			System.out.println();
			//array = Arrays.copyOf(t,sergio.size())
			
		}
		return null;

	}
	public void CovertRecur(Node<T> root) {
		
		if (root != null) {
			CovertRecur(root.Esquerda);
			sergio.add(root.elemento);
			
			CovertRecur(root.Direita);
			
		}
	}
	
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
	
	
	
	@Override
	public String toString() {
		return "Serar [root=" + root + ", sergio=" + sergio + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void remover(T elemento) {
		root = removerRecursivo(root, elemento);
	}

	public Node<T> removerRecursivo(Node<T> root, T elemento) {
		if (root == null) {
			return root;
		}
		if (elemento.compareTo(root.elemento) < 0) {
			root.Esquerda = removerRecursivo(root.Esquerda, elemento);

		} else if (elemento.compareTo(root.elemento) > 0) {
			root.Direita = removerRecursivo(root.Direita, elemento);

		} else {
			if (root.Esquerda == null) {
				return root.Direita;

			} else if (root.Direita == null) {
				return root.Esquerda;
			}
			root.elemento = minValue(root.Direita);
			root.Direita = removerRecursivo(root.Direita, root.elemento);
		}
		return root;
	}

	public T minValue(Node<T> root) {
		T valueMin = root.elemento;
		while (root.Esquerda != null) {
			valueMin = root.Esquerda.elemento;
			root = root.Esquerda;
		}
		return valueMin;
	}

	public void preOrder() {
		preOrderRec(root);
	}

	private void preOrderRec(Node<T> root) {
		if (root != null) {
			System.out.print(root.elemento + " ");
			preOrderRec(root.Esquerda);
			preOrderRec(root.Direita);
		}
	}

	public void posOrder() {
		posOrderRec(root);
	}

	private void posOrderRec(Node<T> root) {
		if (root != null) {
			posOrderRec(root.Esquerda);
			posOrderRec(root.Direita);
			System.out.print(root.elemento + " ");
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

