package biblioteca.usuario.tipo;

import java.util.ArrayList;
import java.util.List;

import biblioteca.Reserva;
import biblioteca.livro.Livro;
import biblioteca.livro.item.Emprestimo;
import biblioteca.livro.item.Exemplar;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Observer;

public class AlunoDePosGraduacao implements Observer, IUsuario{
	private int codigo;
	private String nome;
	
	private int tempoDeImprestimo;
	private int quantidadeDeItensReservados;
	
	private boolean professor = true;
	private boolean alunoDePosGraduacao = true;
	
	private int notificacoes;
	
	private List<Emprestimo> emprestimosCorrentes;
	private List<Emprestimo> emprestimosAntigos;
	
	private List<Reserva> reservas;

//----------//-----Construtor-----//----------//
	public  AlunoDePosGraduacao(int codigo, String nome) {
		this.codigo = codigo;
        this.nome= nome;
        
        this.tempoDeImprestimo = 4; //4 dias
        this.quantidadeDeItensReservados = 4; // Sem limite de livros
        this.setNotificacoes(0);
        
        this.emprestimosCorrentes = new ArrayList<Emprestimo>();
    	this.emprestimosAntigos = new ArrayList<Emprestimo>();
    	this.reservas = new ArrayList<Reserva>();
	}
	
//----------//-----Observer-----//----------//
	public void update(Livro livro) {
		if(livro.getQuantidadeDeReservas() > 1) {
			int q = this.getNotificacoes();
			this.setNotificacoes(q+1);
			
			//System.out.println(this.getNotificacoes());
		}
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

	public int getNotificacoes() {return notificacoes;}
	public void setNotificacoes(int notificacoes) {this.notificacoes = notificacoes;}

	public List<Emprestimo> getEmprestimosCorrentes() {
		return emprestimosCorrentes;
	}
	public void setEmprestimosCorrentes(List<Emprestimo> emprestimosCorrentes) {
		this.emprestimosCorrentes = emprestimosCorrentes;
	}
	public void addEmprestimosCorrentes(Emprestimo emprestimo) {
		emprestimosCorrentes.add(emprestimo);
	}

	public List<Emprestimo> getEmprestimosAntigos() {
		return emprestimosAntigos;
	}
	public void setEmprestimosAntigos(List<Emprestimo> emprestimosAntigos) {
		this.emprestimosAntigos = emprestimosAntigos;
	}
	
	public void addEmprestimosAntigos(Emprestimo emprestimo) {
		emprestimosAntigos.add(emprestimo);
	}

	public List<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	public void addReservas(Reserva reserva) {
		reservas.add(reserva);
	}
}
