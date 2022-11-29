package biblioteca.livro.estado;

import biblioteca.Livro;
import biblioteca.livro.Estado;

public class Emprestado implements Estado {
	public void pegarEmprestado(Livro livro) {
		System.out.println("Consultando reservas");
		System.out.println("Consultando disponibilidade");
		System.out.println("Não existem itens disponiveis para emprestimo");
	}
	public void Devolver(Livro livro) {
		System.out.println("Devolvendo");
		livro.estado= new Disponivel();
	}
	public void Reservar(Livro livro) {
		System.out.println("Consultando sistema");
		System.out.println("Reservando");
		livro.estado= new Reservado();
	}
}
