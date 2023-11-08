package br.com.ifpe.AVL;

public class Node<T> {
	T elemento;
	Node<T> Esquerda;
	Node<T> Direita;
	int fatorBalanceamento;

	public Node(T elemento) {
		this.elemento = elemento;
		this.Esquerda = null;
		this.Direita = null;
		
	}

}
