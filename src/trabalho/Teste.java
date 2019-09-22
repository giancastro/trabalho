package trabalho;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		Pilha<String> pilha = new Pilha<String>();
		Fila<String> fila = new Fila<String>();
		ArrayList<String> lista_final = new ArrayList<String>();

		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);
		lista.adiciona(4);
		lista.adiciona(5);

		System.out.println("Mostrar lista inicial:");
		System.out.println(lista);

		int tamanho = lista.tamanho();

		System.out.println("\nRemover da lista para a pilha.");
		for (int i = 0; i < tamanho; i++) {
			pilha.insere(lista.pega(0).toString());
			lista.remove(0);
		}

		System.out.println("\nRemover da pilha para a fila.");
		for (int i = 0; i < tamanho; i++) {
			fila.insere(pilha.remove());
		}

		lista.adiciona(6);
		lista.adiciona(7);
		lista.adiciona(8);
		lista.adiciona(9);
		lista.adiciona(10);

		System.out.println("\nMostrar lista incremental:");
		System.out.println(lista);

		tamanho = lista.tamanho();

		System.out.println("\nRemover da lista para a pilha.");
		for (int i = 0; i < tamanho; i++) {
			pilha.insere(lista.pega(0).toString());
			lista.remove(0);
		}

		System.out.println("\nRemover da pilha para a fila.");
		for (int i = 0; i < tamanho; i++) {
			fila.insere(pilha.remove());
		}

		tamanho = fila.tamanho();

		System.out.println("\nRemover da fila para exibir em uma lista.");
		for (int i = 0; i < tamanho; i++) {
			lista_final.add(fila.remove());
		}

		System.out.println("\nMostrar lista final:");
		System.out.println(lista_final);
	}
}
