package biblioteca.usuario;

import java.util.List;
import java.util.Random;

import biblioteca.Emprestimo;
import biblioteca.Reserva;
import biblioteca.item.Livro;
import biblioteca.usuario.interfaces.Fncionalidades;

public class Usuario implements Fncionalidades {
	private int codigo = 0; // código do usuario para facilitar a busca
	private String nome;
	
	private int tempoDeEmprestimo = 3;
	private int quantidadeDeItensReservados;
	
	private boolean alunoDePosGraduacao = false;
	private boolean professor = false;
	
	private boolean emAtraso;
	
	public List<Reserva> listaDeReservas;
	public List<Emprestimo> listaDeEmprestimos;
	
	public void pegarLivroEmprestado() {
	}	
	public void reservarLivro() {
	}

	public int getTempoDeImprestimo() {return tempoDeEmprestimo;}
	public void setTempoDeEmprestimo(int tempoDeImprestimo) {this.tempoDeEmprestimo = tempoDeImprestimo;}
	public int getQuantidadeDeItensReservados() {return quantidadeDeItensReservados;}
	public void setQuantidadeDeItensReservados(int quantidadeDeItensReservados) {this.quantidadeDeItensReservados = quantidadeDeItensReservados;}

	public int getId() {return codigo;}
	public void setId() {
		Random gerador = new Random();
		this.codigo = gerador.nextInt(99);
		}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	
	public boolean isAlunoDePosGraduacao() {return alunoDePosGraduacao;}
	public void setAlunoDePosGraduacao(boolean alunoDePosGraduacao) {this.alunoDePosGraduacao = alunoDePosGraduacao;}
	public boolean isProfessor() {return professor;}
	public void setProfessor(boolean professor) {this.professor = professor;}
	
	public boolean isEmAtraso() {return emAtraso;}
	public void setEmAtraso(boolean emAtraso) {this.emAtraso = emAtraso;}
}
