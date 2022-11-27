package biblioteca.item.estados;

import biblioteca.item.Estado;
import biblioteca.item.Livro;

public class Disponivel implements Estado {
	public void pegarEmprestado(Livro livro) {
		System.out.println("Consultando seu cadastro");
		//if(usuario is not em atraso ) {}
		System.out.println("Consultando disponibilidade");
		//if(usuario is not emprestado ) {}
		System.out.println("Consultando reservas");
		//if(usuario is not reservado ) {}
		System.out.println("Disponivel");
		System.out.println("Cadasteando registro de novo emprestimo");
		livro.estado = new Emprestado();
	}
	public void Devolver(Livro livro) {
		System.out.println("Vc deseja doar um exemplar ?");
	}
	public void Reservar(Livro livro) {
		System.out.println("Consultando sistema");
		System.out.println("Reservando");
		livro.estado = new Reservado();
	}
}
