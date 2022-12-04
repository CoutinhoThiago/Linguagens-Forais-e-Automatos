package biblioteca.livro;

import java.time.LocalDate;

import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Professor;

public class Emprestimo {
	private int codigo;
	private IUsuario usuario;
	private Livro livro;
	private Exemplar exemplar;
		
	private LocalDate dataDeEmprestimo;
	
	private LocalDate dataDeDevolucaoPrevista;
	private LocalDate dataDeDevolucao;
		
//----------//-----Construtor-----//----------//
	public Emprestimo(IUsuario usuario2, Livro livro, Exemplar exemplar) {
		this.usuario = (usuario2);
		this.livro = (livro);
		this.exemplar = exemplar;
			
		this.setDataDeEmprestimo(LocalDate.now());
		this.setDataDeDevolucaoPrevista(LocalDate.now());
	}

//----------//-----Getter and setter-----//----------//
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public IUsuario getUsuario() {
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

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
