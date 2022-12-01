package biblioteca;

import java.util.List;

import biblioteca.livro.Livro;
import biblioteca.livro.estado.Disponivel;
import biblioteca.livro.estado.Emprestado;
import biblioteca.livro.item.Emprestimo;
import biblioteca.livro.item.Reserva;
import biblioteca.usuario.IUsuario;


public class Biblioteca {
	public Emprestimo pegarEmprestado(IUsuario usuario, Livro livro) {
		
		Dados dados = new Dados();
		List<Livro> livros = dados.getListaDeLivros();
		List<IUsuario> usuarios = dados.getListaDeUsuarios();
		
		List<Reserva> reservas = usuario.getListaDeReservas();
		
		if (reservas == null) {
			System.out.println("O usuario não possui reservas para o livro");
			Livro listaDeLivros = consultarDisponibilidade(livros, livro);
			
			if (listaDeLivros != null) {
				System.out.println("Livro Disponivel para emprestimo");
				Emprestimo emprestimo = criarEmprestimo(000, usuario, livro);
				System.out.println("Emprestimo realizado com sucesso");
				return emprestimo;
			}
			else {
				System.out.println("Não existem livros disponiveis para emprestimo");
				return null;
			}
		}
		else {
			Reserva reserva = localizarReserva(livro, reservas);
			
			if (reserva == null) {
				System.out.println("O usuario não possui reservas para o livro");
			}
			
			else {
				Emprestimo emprestimo = criarEmprestimo(reserva.getCodigo(), reserva.getUsuario(), reserva.getLivro());
				excluirReserva(reservas, reserva);
				return emprestimo;
			}
		}
		return null;
	}
	private Livro consultarDisponibilidade(List<Livro> livros, Livro livro) {
		for(int i = 0; i < livros.size(); i++){
			if(livros.get(i).getCodigo() == livro.getCodigo()) {
//					System.out.println(livros.get(i).getNome());
				if (livros.get(i).estado instanceof Disponivel) {
					return livros.get(i);
				}
			}
		}
		return null;
	}
	private Reserva localizarReserva(Livro livro, List<Reserva> reservas) {
		for(int i = 0; i < reservas.size(); i++){
			System.out.println("buscando reserva...");
			if(reservas.get(i).getLivro().getCodigo() == livro.getCodigo()) {
//					System.out.println(livros.get(i).getNome());
				if (reservas.get(i).getLivro().estado instanceof Disponivel) {
					return reservas.get(i);
				}
			}
		}
		return null;
	}
	private Emprestimo criarEmprestimo(int codigo, IUsuario usuario, Livro livro) {
		System.out.println("Cadastrando novo emprestimo");
		Emprestimo emprestimo = new Emprestimo(codigo, usuario, livro);
		System.out.println("Emprestimo cadastrado com sucesso");
		return emprestimo;
	}
	private void excluirReserva(List<Reserva> reservas, Reserva reserva) {
		reservas.remove(reserva);
		System.out.println("Reserva excluida com sucesso");
	}
	
//--------------------//--------------------//--------------------//--------------------//--------------------//
	public void reservar(IUsuario usuario, Livro livro) {
		int codigo = 000;
		Reserva reserva = new Reserva(codigo, usuario, livro);
		List<Reserva> reservas = usuario.getListaDeReservas();
		reservas.add(reserva);
	}
	 
	public void devolver(IUsuario usuario, Livro livro) {
		Emprestimo emprestimo = localizarEmprestimo(livro, usuario.getListaDeEmprestimosCorrentes());
		//usuario.listaDeEmprestimos.remove(emprestimo);
	}
	private Emprestimo localizarEmprestimo(Livro livro, List<Emprestimo> emprestimos) {
		for(int i = 0; i < emprestimos.size(); i++){
			System.out.println("buscando reserva...");
			if(emprestimos.get(i).getLivro().getCodigo() == livro.getCodigo()) {
//					System.out.println(livros.get(i).getNome());
				return emprestimos.get(i);
			}
		}
		return null;
	}
	
	public void registrarObservador(IUsuario usuario, Livro livro) {
		
	}

	public void consultarUsuario(IUsuario usuario) {
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

	public void consultarLivro(Livro livro) {
//		o sistema deve apresentar suas informações da seguinte
	//	forma: (i) título, (ii) quantidade de reservas para aquele livro, e, se diferente de zero,
	//	devem ser também apresentados o nome dos usuários que realizaram cada reserva, (iii)
	//	para cada exemplar, deve ser apresentado seu código, seu status (disponível ou
	//	emprestado), e em caso do exemplar estar emprestado deverá ser exibido o nome do
	//	usuário que realizou o empréstimo, a data de empréstimo e a data prevista para
	//	devolução. Para solicitar tal consulta, o usuário deverá digitar o comando “liv”, seguido
	//	do código do livro.
		
		System.out.println("Título" + livro.getNome());
		int quantidadeDeReservas = livro.getQuantidadeDeReservas();
		System.out.println("Quantidade de reservas: " + quantidadeDeReservas);
		if (quantidadeDeReservas == 0) {
			//devem ser também apresentados o nome dos usuários que realizaram cada reserva
			System.out.println("IMPLEMENTAR");
		}
	
		boolean emprestado = livro.estado instanceof Emprestado;
		System.out.println("Status: " + emprestado);
		//e em caso do exemplar estar emprestado deverá ser exibido
		if (emprestado == true) {
			//o nome do usuário que realizou o empréstimo
			//a data de empréstimo e a data prevista para devolução. 
		}
	}
	
//	List<Emprestimo> listaDeEmprestimos = usuario.
//	//lista de todos os seus empréstimos correntes
//	if(listaDeLivros.size() >=0) {
//		System.out.println("Emprestimos Correntes");
//		for (int i = 0; i < listaDeEmprestimoCorrentes.size(); i++) {
//			System.out.println("Emprestimo n" + listaDeEmprestimoCorrentes.get(i).getCodigo());
//			System.out.println("Nome " + listaDeEmprestimoCorrentes.get(i).getLivro().getNome());
//			System.out.println("Data de emprestimo " + listaDeEmprestimoCorrentes.get(i).getDataDeEmprestimo());
//			System.out.println("Status " + listaDeEmprestimoCorrentes.get(i).getStatus());
//			System.out.println("Data de devolução prevista " + listaDeEmprestimoCorrentes.get(i).getDataDeDevolucaoPrevista());
//		}
//	}
//}

	public void consultarNotificacoes(IUsuario usuario) {}
}
