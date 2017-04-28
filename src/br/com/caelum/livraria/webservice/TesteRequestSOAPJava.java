package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSOAPJava {

	public static void main(String[] args) throws RemoteException {
		LivrariaWS client = new LivrariaWSProxy();
		Livro[] livros = client.getLivrosPeloNome("Java");
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " + livro.getAutor().getNome());
		}
	}
}
