package biblioteca.livro.item;

import java.sql.Date;
import java.time.LocalDate;

import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;

public class Emprestimo {
	private int codigo;
	private IUsuario usuario;
	private Livro livro;
	
	private LocalDate dataDeEmprestimo;
	private String status;
	private LocalDate dataDeDevolucaoPrevista;
	private LocalDate dataDeDevolucao;
	
//----------//-----Construtor-----//----------//
	public Emprestimo(int codigo, IUsuario usuario, Livro livro) {
		this.setCodigo(codigo);
		this.setUsuario(usuario);
		this.setLivro(livro);
		
		this.dataDeEmprestimo = LocalDate.now();
		this.status = "em curso"; //finalizado
	}

//----------//-----Getter and setter-----//----------//
	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	
	public IUsuario getUsuario() {return usuario;}
	public void setUsuario(IUsuario usuario) {this.usuario = usuario;}
	public Livro getLivro() {return livro;}
	public void setLivro(Livro livro) {this.livro = livro;}

	public LocalDate getDataDeEmprestimo() {return dataDeEmprestimo;}
	public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {this.dataDeEmprestimo = dataDeEmprestimo;}
	public String getStatus() {return status;}
	public void setStatus(String status) {this.status = status;}

	public LocalDate getDataDeDevolucaoPrevista() {
		return dataDeDevolucaoPrevista;
	}

	public void setDataDeDevolucaoPrevista(LocalDate dataDeDevolucaoPrevista) {
		this.dataDeDevolucaoPrevista = dataDeDevolucaoPrevista;
	}

	public LocalDate getDataDeDevolucao() {
		return dataDeDevolucao;
	}

	public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
		this.dataDeDevolucao = dataDeDevolucao;
	}
}
