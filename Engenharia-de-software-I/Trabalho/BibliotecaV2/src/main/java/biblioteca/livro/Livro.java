package biblioteca.livro;

import java.util.ArrayList;
import java.util.Random;

import biblioteca.livro.estado.Disponivel;
import biblioteca.livro.estado.Emprestado;
import biblioteca.livro.estado.Reservado;
import biblioteca.livro.item.Emprestimo;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Observer;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.tipo.Professor;

public class Livro implements Subject {
	private int codigo;
	private String nome;
	private String editora;
	private String autor;
	private String Edicao;
	private int anoDePublicacao;
	private int exemplar;
	
	private int quantidadeDeReservas;
	
	private ArrayList<Observer> observers;
	
	public Estado estado;
	
//----------//-----Construtor-----//----------//
	public Livro(int codigo, String nome, String editora, String autor, String Edicao, int anoDePublicacao, int exemplar) {
		observers = new ArrayList<Observer>();
		estado = new Disponivel();
		
		this.codigo = codigo;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.autor = autor;
		this.Edicao = Edicao;
		this.anoDePublicacao = anoDePublicacao;
		this.exemplar = exemplar;
		
		this.quantidadeDeReservas = 0;
	}
	
//----------//-----state-----//----------//
    public void pegarEmprestado(Usuario usuario, Livro livro) {this.estado.pegarEmprestado(this);}
	public void Devolver() {this.estado.Devolver(this);}
	public void Reservar() {this.estado.Reservar(this);}
	
//----------//-----Singleton-----//----------//
	public void pegarEmprestado(Livro livro) {
		System.out.println("Consultando seu cadastro");
		//if(usuario is not em atraso ) {}
		System.out.println("Consultando disponibilidade");
		//if(usuario is not emprestado ) {}
		System.out.println("Consultando reservas");
		//if(usuario is not reservado ) {}
		System.out.println("Cadasteando registro de novo emprestimo");
		livro.estado= new Emprestado();
	}
	public void Devolver(Livro livro) {
		System.out.println("Vc deseja doar um exemplar ?");
	}
	public void Reservar(Livro livro) {
		System.out.println("Consultando sistema");
		System.out.println("Reservando");
		livro.estado= new Reservado();
	}
	
//----------//-----Observer-----//----------//
	public void registerObserver(Observer observador) {
		observers.add(observador);
		
		//Sysout lista de observadores cadastrados para o livro
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			Professor professor = (Professor) observer;
			System.out.println(professor.getNome());
		}
	}
	public void removeObserver(Observer observador) {
		int i = observers.indexOf(observador);
		if (i >= 0) {observers.remove(i);}
	}
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
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
	public int getExemplar() {return exemplar;}
	public void setExemplar(int exemplar) {this.exemplar = exemplar;}
	public int getQuantidadeDeReservas() {return quantidadeDeReservas;}
	public void setQuantidadeDeReservas(int quantidadeDeReservas) {this.quantidadeDeReservas = quantidadeDeReservas;}
	
	//public Estado getEstado() {return estado;}
}
