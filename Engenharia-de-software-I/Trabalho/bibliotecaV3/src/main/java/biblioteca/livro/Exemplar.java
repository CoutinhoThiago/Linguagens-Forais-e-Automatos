package biblioteca.livro;

import java.util.ArrayList;
import java.util.List;

public class Exemplar {
	private int codigoDoExemplar = 0;
	
	private boolean disponivel;
	private boolean emprestado;
	private boolean reservado;
	
	private Emprestimo emprestimoCorrente;
	private List<Emprestimo> listaDeEmprestimosAntigos;
	
	private Reserva reservaCorrente;
	private List<Reserva> listaDeReservaAntigas;
	
	public Exemplar() {
		this.codigoDoExemplar = codigoDoExemplar + 1;
		
		this.setDisponivel(true);
		this.setEmprestado(false);
		this.setReservado(false);
		
		this.listaDeEmprestimosAntigos = new ArrayList<Emprestimo>();
		this.listaDeReservaAntigas = new ArrayList<Reserva>();
	}
	public int getCodigoDoExemplar() {return codigoDoExemplar;}
	public void setCodigoDoExemplar(int codigoDoExemplar) {this.codigoDoExemplar = codigoDoExemplar;}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public Emprestimo getEmprestimoCorrente() {
		return emprestimoCorrente;
	}
	public void setEmprestimoCorrente(Emprestimo emprestimoCorrente) {
		this.emprestimoCorrente = emprestimoCorrente;
	}
	
	public List<Emprestimo> getListaDeEmprestimosAntigos() {
		return listaDeEmprestimosAntigos;
	}
	public void setListaDeEmprestimosAntigos(List<Emprestimo> listaDeEmprestimosAntigos) {
		this.listaDeEmprestimosAntigos = listaDeEmprestimosAntigos;
	}
	public void addListaDeEmprestimosAntigos(Emprestimo emprestimo) {
		this.listaDeEmprestimosAntigos.add(emprestimo);
	}
	public Reserva getReservaCorrente() {
		return reservaCorrente;
	}
	public void setReservaCorrente(Reserva reservaCorrente) {
		this.reservaCorrente = reservaCorrente;
	}
	public List<Reserva> getListaDeReservaAntigas() {
		return listaDeReservaAntigas;
	}
	public void setListaDeReservaAntigas(List<Reserva> listaDeReservaAntigas) {
		this.listaDeReservaAntigas = listaDeReservaAntigas;
	}
}
