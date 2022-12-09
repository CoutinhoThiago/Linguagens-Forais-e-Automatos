package biblioteca.usuario;

import java.util.List;

import biblioteca.Reserva;
import biblioteca.livro.item.Emprestimo;

public interface IUsuario {
	public int getCodigo();
	public void setCodigo(int codigo);
	public String getNome();
	public void setNome(String nome);
	public int getTempoDeImprestimo();
	public void setTempoDeImprestimo(int tempoDeImprestimo);
	public int getQuantidadeDeItensReservados();
	public void setQuantidadeDeItensReservados(int quantidadeDeItensReservados);
	public boolean isAlunoDePosGraduacao();
	public void setAlunoDePosGraduacao(boolean alunoDePosGraduacao);
	public boolean isProfessor();
	public void setProfessor(boolean professor);
	public int getNotificacoes();
	public void setNotificacoes(int notificacoes);
	public List<Emprestimo> getEmprestimosCorrentes();
	public void setEmprestimosCorrentes(List<Emprestimo> emprestimosCorrentes);
	public void addEmprestimosCorrentes(Emprestimo emprestimo);
	public List<Emprestimo> getEmprestimosAntigos();
	public void setEmprestimosAntigos(List<Emprestimo> emprestimosAntigos);
	public void addEmprestimosAntigos(Emprestimo emprestimo);
	public List<Reserva> getReservas();
	public void setReservas(List<Reserva> reservas);
	public void addReservas(Reserva reserva);
}
