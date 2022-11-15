package biblioteca.usuario.tipo;

import biblioteca.item.Livro;
import biblioteca.usuario.criador.CriadorContasProfessor;
import biblioteca.usuario.interfaces.ICriadorContas;
import biblioteca.usuario.interfaces.IInscricao;
import biblioteca.usuario.interfaces.Observer;

public class Professor implements IInscricao, Observer {
	private String nome;
	private String sobrenome;
	
	private int tempoDeImprestimo;
	private int quantidadeDeItensReservados;
	
	public void update(Livro livro) {
		// TODO Auto-generated method stub
		
	}
	
	public Professor(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}	
	
	public String getNome() {return nome;}
	public String getSobrenome() {return sobrenome;}
	public ICriadorContas obterCriadorContas() {return new CriadorContasProfessor();}
	
	public int getTempoDeImprestimo() {return tempoDeImprestimo;}
	public void setTempoDeImprestimo(int tempoDeImprestimo) {this.tempoDeImprestimo = tempoDeImprestimo;}
	public int getQuantidadeDeItensReservados() {return quantidadeDeItensReservados;}
	public void setQuantidadeDeItensReservados(int quantidadeDeItensReservados) {this.quantidadeDeItensReservados = quantidadeDeItensReservados;}
}
