package trabalho;

import java.util.LinkedList;

public class Fila<T> {

	private LinkedList<T> objetos = new LinkedList<T>();
	private int totalDeElementos;

	public void insere(T t) {
		this.objetos.add(t);
		this.totalDeElementos++;
	}

	public T remove() {
		this.totalDeElementos--;
		return this.objetos.remove(0);
	}

	public boolean vazia() {
		return this.objetos.size() == 0;
	}

	public int tamanho() {
		return this.totalDeElementos;
	}
}