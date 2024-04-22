package biblioteca.usuario;

import java.util.List;

import biblioteca.livro.item.Emprestimo;
import biblioteca.livro.item.ItenObservado;

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
	
	public List<Emprestimo> getListaDeEmprestimosCorrentes();
	public void setListaDeEmprestimosCorrentes(List<Emprestimo> listaDeEmprestimosCorrentes);
	public List<Emprestimo> getListaDeEmprestimosAntigos();
	public void setListaDeEmprestimosAntigos(List<Emprestimo> listaDeEmprestimosAntigos);
	
	public List<ItenObservado> getListaDeItensObservados();
	public void setListaDeItensObservados(List<ItenObservado> listaDeItensObservados);
}
