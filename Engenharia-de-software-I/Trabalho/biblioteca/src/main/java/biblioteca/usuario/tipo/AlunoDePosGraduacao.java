package biblioteca.usuario.tipo;

import biblioteca.item.Livro;
import biblioteca.usuario.criador.CriadorContasAlunoDePosGraduacao;
import biblioteca.usuario.interfaces.ICriadorContas;
import biblioteca.usuario.interfaces.IUsuario;
import biblioteca.usuario.interfaces.Observer;

public class AlunoDePosGraduacao implements IUsuario, Observer {
	private String nome;
	private String sobrenome;
	
	private int tempoDeImprestimo;
	private int quantidadeDeItensReservados;
	
	public void update(Livro livro) {
		// TODO Auto-generated method stub
		
	}
	
	public AlunoDePosGraduacao(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}	
	
	public String getNome() {return nome;}
	public String getSobrenome() {return sobrenome;}
	public ICriadorContas obterCriadorContas() {return new CriadorContasAlunoDePosGraduacao();}
	
	public int getTempoDeImprestimo() {return tempoDeImprestimo;}
	public void setTempoDeImprestimo(int tempoDeImprestimo) {this.tempoDeImprestimo = tempoDeImprestimo;}
	public int getQuantidadeDeItensReservados() {return quantidadeDeItensReservados;}
	public void setQuantidadeDeItensReservados(int quantidadeDeItensReservados) {this.quantidadeDeItensReservados = quantidadeDeItensReservados;}
}
