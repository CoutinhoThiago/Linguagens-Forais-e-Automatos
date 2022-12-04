package biblioteca.usuario;

import java.util.List;

import biblioteca.livro.Livro;

public class Professor {
	private int codigo;
	private String nome;
	
	private int tempoDeImprestimo;
	private int quantidadeDeItensReservados;
	
	private boolean professor = true;
	private boolean alunoDePosGraduacao = true;
	
	private boolean emAtraso;
	
	private int notificacoes;
	
	//private List<ItenObservado> listaDeItensObservados;

//----------//-----Construtor-----//----------//
	public  Professor(int codigo, String nome) {
		this.codigo = codigo;
        this.nome= nome;
        
        this.tempoDeImprestimo = 7; //7 dias
        this.quantidadeDeItensReservados = 9999; // Sem limite de livros
        this.setNotificacoes(0);
	}
	
//----------//-----Observer-----//----------//
	public void update(Livro livro) {
		System.out.println("Falta fazer");
		System.out.println("Va fazer essa porraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Va fazer essa porraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Va fazer essa porraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Va fazer essa porraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Va fazer essa porraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Va fazer essa porraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("Va fazer essa porraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
//----------//-----Getter and setter-----//----------//	
	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public int getTempoDeImprestimo() {return tempoDeImprestimo;}
	public void setTempoDeImprestimo(int tempoDeImprestimo) {this.tempoDeImprestimo = tempoDeImprestimo;}
	public int getQuantidadeDeItensReservados() {return quantidadeDeItensReservados;}
	public void setQuantidadeDeItensReservados(int quantidadeDeItensReservados) {this.quantidadeDeItensReservados = quantidadeDeItensReservados;}
	public boolean isAlunoDePosGraduacao() {return alunoDePosGraduacao;}
	public void setAlunoDePosGraduacao(boolean alunoDePosGraduacao) {this.alunoDePosGraduacao = alunoDePosGraduacao;}
	public boolean isProfessor() {return professor;}
	public void setProfessor(boolean professor) {this.professor = professor;}
	public boolean isEmAtraso() {return emAtraso;}
	public void setEmAtraso(boolean emAtraso) {this.emAtraso = emAtraso;}

	public int getNotificacoes() {return notificacoes;}
	public void setNotificacoes(int notificacoes) {this.notificacoes = notificacoes;}
}
