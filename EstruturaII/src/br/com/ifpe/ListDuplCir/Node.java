package br.com.ifpe.ListDuplCir;

public class Node<T> {
		
		T elemento;
		Node<T> proximo;
		Node<T> anterior;
		
		public Node(T elemento) {
			this.elemento = elemento;
			this.proximo = null;
			this.anterior= null;
			}

		
		
}
