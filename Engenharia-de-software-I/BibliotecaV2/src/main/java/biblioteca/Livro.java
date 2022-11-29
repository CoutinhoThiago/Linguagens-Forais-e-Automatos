package biblioteca;

import java.util.ArrayList;
import java.util.Random;

import biblioteca.itens.Emprestimo;
import biblioteca.livro.Estado;
import biblioteca.livro.Observer;
import biblioteca.livro.Subject;
import biblioteca.livro.estado.Disponivel;
import biblioteca.livro.estado.Emprestado;
import biblioteca.livro.estado.Reservado;

public class Livro implements Subject {
	
	private ArrayList<Observer> observers;
	
	private int codigo;
	private String nome;
	private String editora;
	private String autor;
	private String Edicao;
	private int anoDePublicacao;
	private int exemplar;
	
	public Estado estado = new Disponivel();
	
	public Livro(int codigo, String nome, String editora, String autor, String Edicao, int anoDePublicacao, int exemplar) {
		this.codigo = codigo;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.autor = autor;
		this.Edicao = Edicao;
		this.anoDePublicacao = anoDePublicacao;
		this.exemplar = exemplar;
	}
	
	//Padrão state
    public void pegarEmprestado(Usuario usuario, Livro livro) {this.estado.pegarEmprestado(this);}
	public void Devolver() {this.estado.Devolver(this);}
	public void Reservar() {this.estado.Reservar(this);}
	
	//public void registerObserver(biblioteca.usuario.interfaces.Observer o) {observers.add(o);}
	//public void removeObserver(biblioteca.usuario.interfaces.Observer o) {
	//	int i = observers.indexOf(o);
	//	if (i >= 0) {observers.remove(i);}
	//}
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}
	
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
	
	//public Estado getEstado() {return estado;}
	
	// Padrao Singleton
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

	public void registerObserver(biblioteca.livro.Observer o) {
		// TODO Auto-generated method stub
		
	}

	public void removeObserver(biblioteca.livro.Observer o) {
		// TODO Auto-generated method stub
		
	}
}
