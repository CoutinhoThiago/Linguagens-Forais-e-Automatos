package console.comandos.consultas;

import java.util.List;

import biblioteca.livro.Livro;
import biblioteca.livro.item.Emprestimo;
import biblioteca.livro.item.Reserva;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Observer;
import biblioteca.usuario.Usuario;
import console.comandos.Comando;

public class ConsultarUsuario implements Comando { // Ex: "usu"
	public void executar(IUsuario usuario, Livro livro) {
		List<Emprestimo> listaDeEmprestimoCorrentes = usuario.getListaDeEmprestimosCorrentes();
		//lista de todos os seus empréstimos correntes
		if(listaDeEmprestimoCorrentes.size() >=0) {
			System.out.println("Emprestimos Correntes");
			for (int i = 0; i < listaDeEmprestimoCorrentes.size(); i++) {
				System.out.println("Emprestimo n" + listaDeEmprestimoCorrentes.get(i).getCodigo());
				System.out.println("Nome " + listaDeEmprestimoCorrentes.get(i).getLivro().getNome());
				System.out.println("Data de emprestimo " + listaDeEmprestimoCorrentes.get(i).getDataDeEmprestimo());
				System.out.println("Status " + listaDeEmprestimoCorrentes.get(i).getStatus());
				System.out.println("Data de devolução prevista " + listaDeEmprestimoCorrentes.get(i).getDataDeDevolucaoPrevista());
			}
		}
		List<Emprestimo> listaDeEmprestimosAntigos = usuario.getListaDeEmprestimosAntigos();
		//lista de todos os seus empréstimos correntes
		if(listaDeEmprestimosAntigos.size() >=0) {
			System.out.println("Emprestimos Antigos");
			for (int i = 0; i < listaDeEmprestimosAntigos.size(); i++) {
				System.out.println("Emprestimo n" + listaDeEmprestimosAntigos.get(i).getCodigo());
				System.out.println("Nome " + listaDeEmprestimosAntigos.get(i).getLivro().getNome());
				System.out.println("Data de emprestimo " + listaDeEmprestimosAntigos.get(i).getDataDeEmprestimo());
				System.out.println("Status " + listaDeEmprestimosAntigos.get(i).getStatus());
				System.out.println("Data de devolução prevista " + listaDeEmprestimosAntigos.get(i).getDataDeDevolucao());
			}
		}
		List<Reserva> listaDeReservas = usuario.getListaDeReservas();
		//lista de todos as suas reservas
		if(listaDeReservas.size() >=0) {
			System.out.println("Reservas Antigas");
			//título do livro reservado e a data da solicitação da reserva.
			for (int i = 0; i < listaDeReservas.size(); i++) {
				System.out.println("Reserva " +  listaDeReservas.get(i).getCodigo());
				System.out.println("Nome " + listaDeReservas.get(i).getLivro().getNome());
				System.out.println("Data da solicitação da reserva " + "AINDA FALTA IMPLEMENTAR");
			}
		}
	}
}
