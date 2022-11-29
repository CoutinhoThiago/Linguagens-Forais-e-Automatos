package biblioteca.usuario.tipo;

import java.util.List;

import biblioteca.Emprestimo;
import biblioteca.ItenObservado;
import biblioteca.Reserva;
import biblioteca.item.Livro;
import biblioteca.usuario.ICriadorContas;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.criador.CriadorContasAlunoDePosGraduacao;
import biblioteca.usuario.criador.CriadorContasProfessor;
import biblioteca.usuario.interfaces.Observer;

public class Professor implements ICriadorContas, Observer {
	private int codigo;
	private String nome;
	
	private int tempoDeImprestimo;
	private int quantidadeDeItensReservados;
	
	private boolean professor = true;
	
	private boolean emAtraso;
	
	public List<Reserva> listaDeReservas;
	public List<Emprestimo> listaDeEmprestimos;
	public List<ItenObservado> listaDeItensObservados;
	
	public Professor(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	@Override
	public Usuario criar(Usuario usuario) {
		return null;
	}
	public ICriadorContas obterCriadorContas() {
		return new CriadorContasProfessor();
	}
	@Override
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
