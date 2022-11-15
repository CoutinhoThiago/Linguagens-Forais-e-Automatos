package biblioteca.item;

import java.util.ArrayList;
import java.util.Random;

import biblioteca.item.estados.Disponivel;
import biblioteca.item.estados.Emprestado;
import biblioteca.item.estados.Reservado;
import biblioteca.usuario.interfaces.Observer;

public class Livro implements Subject {
	
	private ArrayList<Observer> observers;
	
	private int id; // código do livro para facilitar a busca
	private String nome;
	private String autor;
	private int exemplares;
	
	public Livro(String nome, String autor, int exemplares) {
		this.setId();
		this.nome = nome;
		this.autor = autor;
		this.exemplares = exemplares;
	}
	
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

	
	//Padrão state n deu certo
//	public Livro(String nome, String autor, int exemplares) {
//		Random gerador = new Random();
//		int id = gerador.nextInt(99);
//		for (int i = 0; i < exemplares; i++) {
//			this.id = id;
//			this.nome = nome;
//	        this.autor = autor;
//	        this.exemplares = i;
//		}
//	}
	
	public Estado estado = new Disponivel();
    public void pegarEmprestado() {this.estado.pegarEmprestado(this);}
	public void Devolver() {this.estado.Devolver(this);}
	public void Reservar() {this.estado.Reservar(this);}
	
	public void registerObserver(biblioteca.usuario.interfaces.Observer o) {observers.add(o);}
	public void removeObserver(biblioteca.usuario.interfaces.Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {observers.remove(i);}
	}
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}
	
	public int getId() {return id;}
	public void setId() {
		Random gerador = new Random();
		this.id = gerador.nextInt(99);
		}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getAutor() {return autor;}
	public void setAutor(String autor) {this.autor = autor;}
	public int getExemplares() {return exemplares;}
	public void setExemplares(int exemplares) {this.exemplares = exemplares;}
}
