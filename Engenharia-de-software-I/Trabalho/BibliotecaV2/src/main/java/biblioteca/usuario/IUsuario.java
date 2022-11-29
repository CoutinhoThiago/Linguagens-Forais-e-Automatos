package biblioteca.usuario;

import java.util.List;

import biblioteca.itens.Emprestimo;
import biblioteca.itens.ItenObservado;
import biblioteca.itens.Reserva;

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
	public boolean isEmAtraso();
	public void setEmAtraso(boolean emAtraso);

	public List<Reserva> getListaDeReservas();
	public void setListaDeReservas(List<Reserva> listaDeReservas);
	public List<Emprestimo> getListaDeEmprestimos();
	public void setListaDeEmprestimos(List<Emprestimo> listaDeEmprestimos);
	public List<ItenObservado> getListaDeItensObservados();
	public void setListaDeItensObservados(List<ItenObservado> listaDeItensObservados);
}
