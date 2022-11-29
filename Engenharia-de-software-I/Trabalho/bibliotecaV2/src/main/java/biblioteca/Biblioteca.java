package biblioteca;

import java.util.List;

import biblioteca.itens.Emprestimo;
import biblioteca.itens.Reserva;
import biblioteca.livro.estado.Disponivel;
import biblioteca.usuario.IUsuario;


public class Biblioteca {
	public Emprestimo pegarEmprestado(IUsuario usuario, Livro livro) {
		
		Dados dados = new Dados();
		List<Livro> livros = dados.getListaDeLivros();
		List<IUsuario> usuarios = dados.getListaDeUsuarios();
		
		List<Reserva> reservas = usuario.getListaDeReservas();
		
		if (reservas == null) {
			System.out.println("O usuario não possui reservas para o livro");
			Livro lista = consultarDisponibilidade(livros, livro);
			
			if (lista != null) {
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
		return emprestimo;
	}
	private void excluirReserva(List<Reserva> reservas, Reserva reserva) {
		reservas.remove(reserva);
	}
	
//--------------------//--------------------//--------------------//--------------------//--------------------//
	public void reservar(IUsuario usuario, Livro livro) {
		int codigo = 000;
		Reserva reserva = criarReserva(codigo, usuario, livro);
		List<Reserva> reservas = usuario.getListaDeReservas();
		reservas.add(reserva);
	}
	
	private Reserva criarReserva(int codigo, IUsuario usuario, Livro livro) {
		Reserva reserva = new Reserva(codigo, usuario, livro);
		return reserva;
	}
	 
	public void devolver(IUsuario usuario, Livro livro) {
		Emprestimo emprestimo = localizarEmprestimo(livro, usuario.getListaDeEmprestimos());
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

	public void consultarUsuario(IUsuario usuario) {}

	public void consultarLivro(Livro livro) {}

	public void consultarNotificacoes(IUsuario usuario) {}
}
