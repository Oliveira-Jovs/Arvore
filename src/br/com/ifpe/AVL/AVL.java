package br.com.ifpe.AVL;

public class AVL<T extends Comparable<T>> {
	Node<T> raiz;
	int pos;
	int cont;

	public void insert(T e) throws MyException {
		insertRec(this.raiz, e);

	}

	public void insertRec(Node<T> node, T e) throws MyException {
		
		if (e == null) {
			throw new MyException("O valor inserido é inválido");
		}
		if (this.raiz == null) {
			
			this.raiz = new Node<T>(e);
			

		} else {
			//node.fatorBalanceamento = 0;
			if (e.compareTo(node.elemento) < 0) {
				if (node.Esquerda != null) {
					node.fatorBalanceamento --;
					
					insertRec(node.Esquerda, e);
				} else {
					node.fatorBalanceamento --;
					node.Esquerda = new Node<T>(e);
				}

			} else if (e.compareTo(node.elemento) > 0) {
				if (node.Direita != null) {
					node.fatorBalanceamento ++;
					
					insertRec(node.Direita, e);
				} else {
					node.fatorBalanceamento ++;
					node.Direita = new Node<T>(e);
					
					


				}
			}
		}
	}

	public void inOrder() {
		inOrderRec(raiz);
	}

	public void inOrderRec(Node<T> raiz) {
		if (raiz != null) {

			inOrderRec(raiz.Esquerda);
			
			System.out.print(raiz.elemento + " ");
			System.out.println(raiz.fatorBalanceamento);
			inOrderRec(raiz.Direita);
		}
	}
	
	public void girando(Node<T> node, T e){
		if (node.fatorBalanceamento > 1) {
			if (raiz.Direita.fatorBalanceamento < 0 ) {
				System.out.println("Rotacao dupla pra esquerda");
				
			}else {
				System.out.println("Rotacao a esquerda");
			}
			
		}else if (node.fatorBalanceamento < 1) {
			if (raiz.Esquerda.fatorBalanceamento > 0 ) {
				System.out.println("Rotacao dupla pra direita");
				
			}else {
				System.out.println("Rotacao direita");
			}
		}
		
	}
}
