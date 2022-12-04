package biblioteca;

import java.util.List;

import biblioteca.livro.Emprestimo;
import biblioteca.livro.Exemplar;
import biblioteca.livro.Livro;
import biblioteca.livro.Reserva;
import biblioteca.usuario.Professor;

public class Biblioteca {
	public static void devolver(Livro livro, Professor usuario) {
		Exemplar exemplar = consultarEmprestimos(livro, usuario);
		if(exemplar != null) {
			System.out.println("Realizando devolução");
			exemplar.setDisponivel(true);
			exemplar.setReservado(false);
			exemplar.setEmprestado(false);
			
			exemplar.getListaDeEmprestimosAntigos().add(exemplar.getEmprestimoCorrente());
			exemplar.setEmprestimoCorrente(null);
			
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
			exemplarReservado.setDisponivel(false);
			exemplarReservado.setReservado(false);
			exemplarReservado.setEmprestado(true);
			
			exemplarReservado.setEmprestimoCorrente(new Emprestimo(usuario));
			
			System.out.println("Emprestimo realizado com sucesso");
		}
		Exemplar exemplarDisponivel = consultarDisponibilidadeDosExemplares(livro);
		if(exemplarReservado == null && exemplarDisponivel != null) {
			System.out.println("Efetuando emprestimo");
			exemplarDisponivel.setDisponivel(false);
			exemplarDisponivel.setReservado(false);
			exemplarDisponivel.setEmprestado(true);
			
			exemplarDisponivel.setEmprestimoCorrente(new Emprestimo(usuario));
			
			System.out.println("Emprestimo realizado com sucesso");
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
			
			exemplar.setReservaCorrente(new Reserva(usuario));
			
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
}
