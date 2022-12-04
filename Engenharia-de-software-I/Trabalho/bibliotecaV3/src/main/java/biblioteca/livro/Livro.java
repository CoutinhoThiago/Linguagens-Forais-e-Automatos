package biblioteca.livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Observer;

public class Livro implements Subject{
	private int codigo;
	private String nome;
	private String editora;
	private String autor;
	private String Edicao;
	private int anoDePublicacao;
	
	private int quantidadeDeReservas = 0;
	
	private List<Exemplar> exemplares = new ArrayList<Exemplar>();
	private List<Reserva> listaDeReservas;
	private ArrayList<Observer> observers;
	
//----------//-----Construtor-----//----------//
	public Livro(int codigo, String nome, String editora, String autor, String Edicao, int anoDePublicacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.autor = autor;
		this.Edicao = Edicao;
		this.anoDePublicacao = anoDePublicacao;
		
		this.quantidadeDeReservas = 0;
		
		observers = new ArrayList<Observer>();
	}
	
//----------//-----Observer-----//----------//
	public void registerObserver(Observer usuario) {
		observers.add(usuario);
	}
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	public void notifyObservers(int quantidadeDeReservas) {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}
	public void measurementsChanged(int quantidadeDeReservas) {
		this.notifyObservers(quantidadeDeReservas);
	}

//----------//-----Getter and setter-----//----------//
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getAutor() {return autor;}
	public void setAutor(String autor) {this.autor = autor;}
	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	public int getAnoDePublicacao() {return anoDePublicacao;}
	public void setAnoDePublicacao(int anoDePublicacao) {this.anoDePublicacao = anoDePublicacao;}
	public String getEditora() {return editora;}
	public void setEditora(String editora) {this.editora = editora;}
	public String getEdicao() {return Edicao;}
	public void setEdicao(String edicao) {Edicao = edicao;}
	
	public List<Exemplar> getExemplares() {return exemplares;}
	public void setExemplares(List<Exemplar> exemplares) {this.exemplares = exemplares;}
	public void addExemplar(Exemplar exemplar) {this.exemplares.add(exemplar);}
	
	public int getQuantidadeDeReservas() {return quantidadeDeReservas;}
	public void setQuantidadeDeReservas(int quantidadeDeReservas) {
		this.quantidadeDeReservas = quantidadeDeReservas;
		this.measurementsChanged(quantidadeDeReservas);
	}
	
	//public Estado getEstado() {return estado;}
	
	public List<Reserva> getListaDeReservas() {return listaDeReservas;}
	public void setListaDeReservas(List<Reserva> listaDeReservas) {this.listaDeReservas = listaDeReservas;}
}
