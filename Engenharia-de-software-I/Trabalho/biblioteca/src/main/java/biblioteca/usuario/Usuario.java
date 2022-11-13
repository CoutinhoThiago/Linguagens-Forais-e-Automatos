package biblioteca.usuario;

import biblioteca.usuario.interfaces.Fncionalidades;

public class Usuario implements Fncionalidades {
	private String nome;
	private String sobrenome;
	
	private int tempoDeImprestimo = 3;
	private int quantidadeDeItensReservados;
	
	private boolean alunoDePosGraduacao;
	private boolean professor;
	
	public void pegarLivroEmprestado() {
	}	
	public void reservarLivro() {
	}

	public int getTempoDeImprestimo() {return tempoDeImprestimo;}
	public void setTempoDeImprestimo(int tempoDeImprestimo) {this.tempoDeImprestimo = tempoDeImprestimo;}
	public int getQuantidadeDeItensReservados() {return quantidadeDeItensReservados;}
	public void setQuantidadeDeItensReservados(int quantidadeDeItensReservados) {this.quantidadeDeItensReservados = quantidadeDeItensReservados;}

	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getSobrenome() {return sobrenome;}
	public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}
	public boolean isAlunoDePosGraduacao() {return alunoDePosGraduacao;}
	public void setAlunoDePosGraduacao(boolean alunoDePosGraduacao) {this.alunoDePosGraduacao = alunoDePosGraduacao;}
	public boolean isProfessor() {return professor;}
	public void setProfessor(boolean professor) {this.professor = professor;}
}
