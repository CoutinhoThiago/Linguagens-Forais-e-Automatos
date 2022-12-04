package biblioteca.usuario.tipo;

import java.util.List;

import biblioteca.livro.Livro;
import biblioteca.livro.item.Emprestimo;
import biblioteca.livro.item.ItenObservado;
import biblioteca.livro.item.Reserva;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Observer;

public class Professor implements IUsuario, Observer {
	private int codigo;
	private String nome;
	
	private int tempoDeImprestimo;
	private int quantidadeDeItensReservados;
	
	private boolean professor = true;
	private boolean alunoDePosGraduacao = true;
	
	private boolean emAtraso;
	
	private int notificacoes;
	
	private List<Emprestimo> listaDeEmprestimosCorrentes;
	private List<Emprestimo> listaDeEmprestimosAntigos;
	
	private List<ItenObservado> listaDeItensObservados;

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
	public List<Emprestimo> getListaDeEmprestimosCorrentes() {return listaDeEmprestimosCorrentes;}
	public void setListaDeEmprestimosCorrentes(List<Emprestimo> listaDeEmprestimosCorrentes) {this.listaDeEmprestimosCorrentes = listaDeEmprestimosCorrentes;}
	public List<Emprestimo> getListaDeEmprestimosAntigos() {return listaDeEmprestimosAntigos;}
	public void setListaDeEmprestimosAntigos(List<Emprestimo> listaDeEmprestimosAntigos) {this.listaDeEmprestimosAntigos = listaDeEmprestimosAntigos;}
	public List<ItenObservado> getListaDeItensObservados() {return listaDeItensObservados;}
	public void setListaDeItensObservados(List<ItenObservado> listaDeItensObservados) {this.listaDeItensObservados = listaDeItensObservados;}

	public int getNotificacoes() {return notificacoes;}
	public void setNotificacoes(int notificacoes) {this.notificacoes = notificacoes;}
}
