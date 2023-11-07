package br.com.ifpe.ListDuplCir;

import br.com.ifpe.list.MyException;

public class ListaDuplamenteCircular<T> {
	Node<T> inicio;
	Node<T> fim;
	Integer tamanho;

	public ListaDuplamenteCircular() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public int tamanho() {
		return tamanho;
	}

	public boolean isEmpty() {
		return tamanho == 0;
	}

	public void adicionar(T elemen) {
		Node<T> NovoNo = new Node<>(elemen);
		if (isEmpty()) {
			inicio = NovoNo;
			fim = NovoNo;
			inicio.proximo = fim;
			inicio.anterior = fim;
			fim.proximo = inicio;
			fim.anterior = inicio;
		} else {
			fim.proximo = NovoNo;
			NovoNo.anterior = fim;
			NovoNo.proximo = inicio;
			inicio.anterior = NovoNo;
			fim = NovoNo;
		}
		tamanho++;
	}

	public void remover(int posicao) throws MyException {
		if (isEmpty() || posicao < 0 || posicao >= tamanho) {
			throw new MyException("Indice invalido ou Lista vazia. Não possível foi remover elementos!!!");
		}
		Node<T> NoAtual = inicio;
		int cont = 0;

		while (cont < posicao) {
			NoAtual = NoAtual.proximo;
			cont++;
		}

		Node<T> NoAnterior = NoAtual.anterior;
		Node<T> ProximoNo = NoAtual.proximo;
		NoAnterior.proximo = ProximoNo;
		ProximoNo.anterior = NoAnterior;

		if (NoAtual == inicio) {
			inicio = ProximoNo;
		}
		if (NoAtual == fim) {
			fim = NoAnterior;
		}
		tamanho--;

	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "A lista está vazia.";
		}

		StringBuilder sb = new StringBuilder();
		Node<T> NoAtual = inicio;
		int count = 0;

		do {
			sb.append("Node ").append(count).append(": ").append("Anterior: ").append(NoAtual.anterior.elemento)
					.append(", ").append("Elemento: ").append(NoAtual.elemento).append(", ").append("Próximo: ")
					.append(NoAtual.proximo.elemento).append(System.lineSeparator());

			NoAtual = NoAtual.proximo;
			count++;
		} while (NoAtual != inicio);

		return sb.toString();
	}

}
