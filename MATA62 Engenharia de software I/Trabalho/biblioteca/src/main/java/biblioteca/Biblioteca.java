package biblioteca;

import java.util.List;

import biblioteca.item.Livro;
import biblioteca.item.estados.Disponivel;
import biblioteca.usuario.Usuario;

public class Biblioteca {

	public Emprestimo pegarEmprestado(Usuario usuario, Livro livro) {
		List<Reserva> reservas = usuario.listaDeReservas;
		if (reservas.size() == 0) {
			System.out.println("O usuario não possui reservas para o livro");
			boolean disponivel = consultarDisponibilidade();
			
			if (disponivel == true) {
				Emprestimo emprestimo = criarEmprestimo(000, usuario, livro);
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
	private boolean consultarDisponibilidade() {
		return false;
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
	private Emprestimo criarEmprestimo(int codigo, Usuario usuario, Livro livro) {
		Emprestimo emprestimo = new Emprestimo(codigo, usuario, livro);
		return emprestimo;
	}
	private void excluirReserva(List<Reserva> reservas, Reserva reserva) {
		reservas.remove(reserva);
	}
	
//--------------------//--------------------//--------------------//--------------------//--------------------//
	public void reservar(Usuario usuario, Livro livro) {
		int codigo = 000;
		Reserva reserva = criarReserva(codigo, usuario, livro);
		List<Reserva> reservas = usuario.listaDeReservas;
		reservas.add(reserva);
	}
	
	private Reserva criarReserva(int codigo, Usuario usuario, Livro livro) {
		Reserva reserva = new Reserva(codigo, usuario, livro);
		return reserva;
	}
	 
	public void devolver(Usuario usuario, Livro livro) {
		Emprestimo emprestimo = localizarEmprestimo(livro, usuario.listaDeEmprestimos);
		usuario.listaDeEmprestimos.remove(emprestimo);
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
	
	public void registrarObservador(Usuario usuario, Livro livro) {
		
	}

	public void consultarUsuario(Usuario usuario) {}

	public void consultarLivro(Livro livro) {}

	public void consultarNotificacoes(Usuario usuario) {}
}
