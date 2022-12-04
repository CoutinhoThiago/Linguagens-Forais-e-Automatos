package biblioteca.livro;

import java.time.LocalDate;
import java.util.ArrayList;

import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Professor;

public class Reserva {
	private IUsuario usuario;
	private Livro livro;
	private Exemplar exemplar;
	
	private boolean corrente;
	
	private LocalDate dataDaSolicitacao;
	
	public Reserva(IUsuario usuario, Livro livro, Exemplar exemplar) {
		this.usuario = usuario;
		this.setLivro(livro);
		this.setExemplar(exemplar);
		
		this.corrente = true;
		this.setDataDaSolicitacao(LocalDate.now());
	}

	public IUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Professor usuario) {
		this.usuario = usuario;
	}

	public boolean isCorrente() {
		return corrente;
	}

	public void setCorrente(boolean corrente) {
		this.corrente = corrente;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}

	public LocalDate getDataDaSolicitacao() {
		return dataDaSolicitacao;
	}

	public void setDataDaSolicitacao(LocalDate dataDaSolicitacao) {
		this.dataDaSolicitacao = dataDaSolicitacao;
	}
}
