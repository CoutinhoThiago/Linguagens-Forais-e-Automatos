package biblioteca.usuario.tipo;

import biblioteca.item.Livro;
import biblioteca.usuario.ICriadorContas;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.criador.CriadorContasAlunoDeGraduacao;
import biblioteca.usuario.criador.CriadorContasAlunoDePosGraduacao;
import biblioteca.usuario.interfaces.Observer;

public class AlunoDeGraduacao implements ICriadorContas, Observer {
	private int codigo;
	private String nome;
	
	private int tempoDeImprestimo;
	private int quantidadeDeItensReservados;
	
	public AlunoDeGraduacao(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}	
	@Override
	public Usuario criar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}
	public ICriadorContas obterCriadorContas() {
		return new CriadorContasAlunoDeGraduacao();
	}
	public void update(Livro livro) {
		// TODO Auto-generated method stub
		
	}
	
	public String getNome() {return nome;}
	public int getCodigo() {return codigo;}

	public int getTempoDeImprestimo() {return tempoDeImprestimo;}
	public void setTempoDeImprestimo(int tempoDeImprestimo) {this.tempoDeImprestimo = tempoDeImprestimo;}
	public int getQuantidadeDeItensReservados() {return quantidadeDeItensReservados;}
	public void setQuantidadeDeItensReservados(int quantidadeDeItensReservados) {this.quantidadeDeItensReservados = quantidadeDeItensReservados;}
}
