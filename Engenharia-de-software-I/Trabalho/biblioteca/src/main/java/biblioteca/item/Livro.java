package biblioteca.item;

import java.util.ArrayList;
import java.util.Random;

import biblioteca.usuario.interfaces.Observer;

public class Livro implements Subject {
	
	private ArrayList<Observer> observers;
	
	private int id; // código do livro para facilitar a busca
	private String nome;
	private String autor;
	private int exemplares;
	
	public Livro(String nome, String autor, int exemplares) {
		observers = new ArrayList<Observer>();
		this.setId();
		this.nome = nome;
        this.autor = autor;
        this.exemplares = exemplares;
	}
	
	public void registerObserver(biblioteca.usuario.interfaces.Observer o) {
		observers.add(o);
	}
	public void removeObserver(biblioteca.usuario.interfaces.Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
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
