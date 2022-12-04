package biblioteca.livro;

import java.time.LocalDate;

import biblioteca.usuario.Professor;

public class Emprestimo {
	private int codigo;
	private Professor usuario;
		
	private LocalDate dataDeEmprestimo;
	
	private LocalDate dataDeDevolucaoPrevista;
	private LocalDate dataDeDevolucao;
		
//----------//-----Construtor-----//----------//
	public Emprestimo(Professor usuario) {
		this.setUsuario(usuario);
			
		this.setDataDeEmprestimo(LocalDate.now());
	}

//----------//-----Getter and setter-----//----------//
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Professor getUsuario() {
		return usuario;
	}

	public void setUsuario(Professor usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataDeEmprestimo() {
		return dataDeEmprestimo;
	}

	public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
		this.dataDeEmprestimo = dataDeEmprestimo;
	}

	public LocalDate getDataDeDevolucao() {
		return dataDeDevolucao;
	}

	public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
		this.dataDeDevolucao = dataDeDevolucao;
	}

	public LocalDate getDataDeDevolucaoPrevista() {
		return dataDeDevolucaoPrevista;
	}

	public void setDataDeDevolucaoPrevista(LocalDate dataDeDevolucaoPrevista) {
		this.dataDeDevolucaoPrevista = dataDeDevolucaoPrevista;
	}
}
