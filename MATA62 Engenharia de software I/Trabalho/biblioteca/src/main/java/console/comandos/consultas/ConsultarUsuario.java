package console.comandos.consultas;

import java.util.List;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import console.Comando;

public class ConsultarUsuario implements Comando { // Ex: "usu"
	@Override
	public void executar(Usuario usuario, Livro livro) {
		//Dado um usuário
		//o sistema deverá apresentar 
		System.out.println("lista de todos os seus empréstimos correntes");
			//A listagem de cada empréstimo deverá apresentar 
				System.out.println("o título do livro");
				System.out.println("a data do empréstimo");
				System.out.println("o status atual daquele empréstimo (em curso ou finalizado)");
				System.out.println("e a data da devolução já realizada ou prevista.");
		System.out.println("lista de todos os seus empréstimos passados");
			//A listagem de cada empréstimo deverá apresentar 
				System.out.println("o título do livro");
				System.out.println("a data do empréstimo"); 
				System.out.println("o status atual daquele empréstimo (em curso ou finalizado)");
				System.out.println("e a data da devolução já realizada ou prevista.");
		System.out.println("lista de todas as suas reservas");
			//A listagem das reservas deverá apresentar 
				System.out.println("o título do livro reservado"); 
				System.out.println("a data da solicitação da reserva.");
	}
}
