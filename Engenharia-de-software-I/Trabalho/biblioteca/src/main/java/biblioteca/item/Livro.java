package biblioteca.item;

import java.util.ArrayList;

import biblioteca.usuario.interfaces.Observer;

public class Livro implements Subject {
	
	private ArrayList<Observer> observers;
	
	private int id; // para facilitar a busca
	private String nome;
	private String autor;
	private int exemplares;
	
	public void registerObserver(biblioteca.usuario.interfaces.Observer o) {

	}
	public void removeObserver(biblioteca.usuario.interfaces.Observer o) {

	}
	public void notifyObservers() {

	}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getAutor() {return autor;}
	public void setAutor(String autor) {this.autor = autor;}
	public int getExemplares() {return exemplares;}
	public void setExemplares(int exemplares) {this.exemplares = exemplares;}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
}
