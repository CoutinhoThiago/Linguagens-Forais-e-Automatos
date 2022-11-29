package biblioteca.usuario.tipo;

import java.util.List;

import biblioteca.itens.Emprestimo;
import biblioteca.itens.ItenObservado;
import biblioteca.itens.Reserva;
import biblioteca.usuario.IUsuario;

public class AlunoDePosGraduacao implements IUsuario {
	private int codigo;
	private String nome;
	
	private int tempoDeImprestimo;
	private int quantidadeDeItensReservados;
	
	private boolean professor = false;
	private boolean alunoDePosGraduacao = true;
	
	private boolean emAtraso;
	
	private List<Reserva> listaDeReservas;
	private List<Emprestimo> listaDeEmprestimos;
	private List<ItenObservado> listaDeItensObservados;
	
	public AlunoDePosGraduacao(int codigo, String nome) {
		this.codigo = codigo;
        this.nome= nome;
        
        this.tempoDeImprestimo = 4; //4 dias
        this.quantidadeDeItensReservados = 4; // 4 livros
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTempoDeImprestimo() {
		return tempoDeImprestimo;
	}
	public void setTempoDeImprestimo(int tempoDeImprestimo) {
		this.tempoDeImprestimo = tempoDeImprestimo;
	}
	public int getQuantidadeDeItensReservados() {
		return quantidadeDeItensReservados;
	}
	public void setQuantidadeDeItensReservados(int quantidadeDeItensReservados) {
		this.quantidadeDeItensReservados = quantidadeDeItensReservados;
	}
	public boolean isAlunoDePosGraduacao() {
		return alunoDePosGraduacao;
	}

	public void setAlunoDePosGraduacao(boolean alunoDePosGraduacao) {
		this.alunoDePosGraduacao = alunoDePosGraduacao;
	}
	public boolean isProfessor() {
		return professor;
	}
	public void setProfessor(boolean professor) {
		this.professor = professor;
	}
	public boolean isEmAtraso() {
		return emAtraso;
	}
	public void setEmAtraso(boolean emAtraso) {
		this.emAtraso = emAtraso;
	}
	
	public List<Reserva> getListaDeReservas() {
		return listaDeReservas;
	}
	public void setListaDeReservas(List<Reserva> listaDeReservas) {
		this.listaDeReservas = listaDeReservas;
	}
	public List<Emprestimo> getListaDeEmprestimos() {
		return listaDeEmprestimos;
	}
	public void setListaDeEmprestimos(List<Emprestimo> listaDeEmprestimos) {
		this.listaDeEmprestimos = listaDeEmprestimos;
	}
	public List<ItenObservado> getListaDeItensObservados() {
		return listaDeItensObservados;
	}
	public void setListaDeItensObservados(List<ItenObservado> listaDeItensObservados) {
		this.listaDeItensObservados = listaDeItensObservados;
	}
}
