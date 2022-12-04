package biblioteca;

import java.util.ArrayList;
import java.util.List;

import biblioteca.livro.Emprestimo;
import biblioteca.livro.Exemplar;
import biblioteca.livro.Livro;
import biblioteca.livro.Reserva;
import biblioteca.usuario.Professor;

public class Biblioteca {
	public static void registerObserver(Livro livro, Professor usuario) {
		livro.registerObserver(usuario);
		System.out.println("Usuario registrado como observador");
		
	}
	
	public static void devolver(Livro livro, Professor usuario) {
		Exemplar exemplar = consultarEmprestimos(livro, usuario);
		if(exemplar != null) {
			System.out.println("Realizando devolução");
			exemplar.setDisponivel(true);
			exemplar.setReservado(false);
			exemplar.setEmprestado(false);
			
			Emprestimo emprestimo = exemplar.getEmprestimoCorrente();
			exemplar.addListaDeEmprestimosAntigos(emprestimo);
			usuario.addEmprestimosAntigos(emprestimo);
			exemplar.setEmprestimoCorrente(null);
			
			int q = livro.getQuantidadeDeReservas();
			livro.setQuantidadeDeReservas(q-1);
			
			System.out.println("Item Devolvido com sucesso");
		}
	}
	
	private static Exemplar consultarEmprestimos(Livro livro, Professor usuario) {
		List<Exemplar> exemplares = livro.getExemplares();
		for(int j = 0; j < exemplares.size(); j++){
			System.out.println("Verificando emprestimos do usuario...");
			Exemplar exemplar = exemplares.get(j);
			if(exemplar.isEmprestado() == true && 
					exemplar.getEmprestimoCorrente().getUsuario().getNome() == usuario.getNome()) {
				return exemplar;
			}
		}
		
		System.out.println("Ousuario não possui emprestimos para este livro");
		return null;
	}

	public static void pegarEmprestado(Livro livro, Professor usuario) {
		Exemplar exemplarReservado = consultarReservasDoUsuario(livro, usuario);
		if(exemplarReservado != null) {
			System.out.println("Efetuando emprestimo");
			List<Reserva> reservas = usuario.getReservas();
			reservas.remove(exemplarReservado);
			usuario.setReservas(reservas);
			
			exemplarReservado.setDisponivel(false);
			exemplarReservado.setReservado(false);
			exemplarReservado.setEmprestado(true);
			
			Emprestimo emprestimo = new Emprestimo(usuario, livro, exemplarReservado);
			exemplarReservado.setEmprestimoCorrente(emprestimo);
			usuario.addEmprestimosCorrentes(emprestimo);
			
			System.out.println("Emprestimo realizado com sucesso");
		} 
		else {
			Exemplar exemplarDisponivel = consultarDisponibilidadeDosExemplares(livro);
			if(exemplarReservado == null && exemplarDisponivel != null) {
				System.out.println("Efetuando emprestimo");
				exemplarDisponivel.setDisponivel(false);
				exemplarDisponivel.setReservado(false);
				exemplarDisponivel.setEmprestado(true);
				
				Emprestimo emprestimo = new Emprestimo(usuario, livro, exemplarDisponivel);
				exemplarDisponivel.setEmprestimoCorrente(emprestimo);
				usuario.addEmprestimosCorrentes(emprestimo);
						
				System.out.println("Emprestimo realizado com sucesso");
			}
		}
	}
	
	private static Exemplar consultarReservasDoUsuario(Livro livro, Professor usuario) {
		List<Exemplar> exemplares = livro.getExemplares();
		for(int j = 0; j < exemplares.size(); j++){
			System.out.println("Verificando reservas do usuario...");
			Exemplar exemplar = exemplares.get(j);
			//System.out.println(exemplar.isReservado());
			if(exemplar.isReservado() == true && 
					exemplar.getReservaCorrente().getUsuario().getNome()==usuario.getNome()) {
				System.out.println("Exemplar " + exemplar.getCodigoDoExemplar() + " reservado pelo usuario");
				return exemplar;
			}
		}

		
		System.out.println("Ousuario não possui emprestimos para este livro");
		return null;
	}

	public static void reservar(Livro livro, Professor usuario) {
		Exemplar exemplar = consultarDisponibilidadeDosExemplares(livro);
		if(exemplar != null) {
			System.out.println("Efetuando reserva");
			exemplar.setDisponivel(false);
			exemplar.setReservado(true);
			exemplar.setEmprestado(false);
			
			int q = livro.getQuantidadeDeReservas();
			livro.setQuantidadeDeReservas(q+1);
			
			Reserva reserva = new Reserva(usuario, livro, exemplar);
			exemplar.setReservaCorrente(reserva);
			usuario.addReservas(reserva);
			
			System.out.println("Reserva realizada com sucesso");
		}
	}
	public static Exemplar consultarDisponibilidadeDosExemplares(Livro livro) {
		List<Exemplar> exemplares = livro.getExemplares();
		for(int j = 0; j < exemplares.size(); j++){
			System.out.println("Verificando disponibilidade dos exemplares...");
			Exemplar exemplar = exemplares.get(j);
			if(exemplar.isDisponivel() == true) {
				System.out.println("Exemplar " + exemplar.getCodigoDoExemplar() + " disponivel");
				return exemplares.get(j);
			}
		}
		System.out.println("Não existem exemplares disponiveis para emprestimo");
		return null;
	}
	
//----------//----------//-----Consultas-----//----------//----------//

	public static void consultarNotificacoes(Professor usuario) {
		if(usuario.getNotificacoes() == 0) {
			System.out.println(" O usuario " + usuario.getNome() + " não foi notificado nenhuma vez");
		}
		else if (usuario.getNotificacoes() == 1) {
			System.out.println("O usuario " + usuario.getNome() + " foi notificado apenas uma vez");
		}
		else if (usuario.getNotificacoes() > 1) {
			System.out.println("O usuario " + usuario.getNome() + " foi notificado " + usuario.getNotificacoes() + " vezes");
		}
	}
	public static void consultarUsuario(Professor usuario, List<Livro> livros) {
		List<Emprestimo> emprestimosCorrentes = usuario.getEmprestimosCorrentes();
		List<Emprestimo> emprestimosAntigos = usuario.getEmprestimosAntigos();
		List<Reserva> reservas = usuario.getReservas();
			
		System.out.println("Lista de emprestimos correntes do usuario: ");
		for(int j = 0; j < emprestimosCorrentes.size(); j++){
			Emprestimo emprestimo = emprestimosCorrentes.get(j);
			System.out.println(emprestimo.getLivro().getNome());
			System.out.println(emprestimo.getDataDeEmprestimo());
			System.out.println(emprestimo.getDataDeDevolucaoPrevista());
		}
		System.out.println("Lista de emprestimos antigos do usuario: ");
		for(int j = 0; j < emprestimosAntigos.size(); j++){
			Emprestimo emprestimo = emprestimosAntigos.get(j);
			System.out.println(emprestimo.getLivro().getNome());
			System.out.println(emprestimo.getDataDeEmprestimo());
			System.out.println(emprestimo.getDataDeDevolucaoPrevista());
		}
			
		System.out.println("Lista de reservas do usuario: ");
		for(int j = 0; j < reservas.size(); j++) {
			Reserva reserva = reservas.get(j);
			System.out.println(reserva.getLivro().getNome());
			System.out.println(reserva.getDataDaSolicitacao());
		}
	}

	public static void consultarLivro(Professor usuario, Livro livro) {
		System.out.println();
		System.out.println("Livro: " + livro.getNome());
		int quantidadeDeReservas = livro.getQuantidadeDeReservas();
		if (quantidadeDeReservas > 0) {
			List<Exemplar> exemplares = livro.getExemplares();
			for(int j = 0; j < exemplares.size(); j++){
				Exemplar exemplar = exemplares.get(j);
				System.out.println("Reserva: " + (j+1));
				System.out.println("	Usuario: " + exemplar.getReservaCorrente().getUsuario().getNome());
				System.out.println("	Data da solicitação: " + exemplar.getReservaCorrente().getDataDaSolicitacao());
				List<Reserva> reservasAntigas = exemplar.getListaDeReservaAntigas();
				for(int k = 0; k < reservasAntigas.size(); k++){
					System.out.println("	Usuario: " + reservasAntigas.get(k).getUsuario().getNome());
					System.out.println("	Data da solicitação: " + reservasAntigas.get(k).getDataDaSolicitacao());
				}
			}
			System.out.println("Emprestimos: ");
			for(int j = 0; j < exemplares.size(); j++){
				Exemplar exemplar = exemplares.get(j);
				System.out.println("Exemplar " + (j+1));
				String status = "Disponivel";
				if(exemplar.isEmprestado()) {
					status = "Emprestado";
					System.out.println("	Status: " + status);
					System.out.println("	Emprestado para: " + exemplar.getEmprestimoCorrente().getUsuario().getNome());
					System.out.println("	Data do emprestimo: " + exemplar.getEmprestimoCorrente().getDataDeDevolucao());
					System.out.println("	Data prevista para a devolução: " + exemplar.getEmprestimoCorrente().getDataDeDevolucaoPrevista());
				}
				else {
					System.out.println("Status: " + status);
				}
			}
		}
	}
}
