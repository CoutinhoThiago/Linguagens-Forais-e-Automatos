package br.com.fbmiranda;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Lutador{


	private String nome;
	private int vida;
	

	public Lutador(String nome, int vida) {
		super();
		this.nome = nome;
		this.vida = vida;
	}


	
	public void atacar (Lutador oponente, Golpe golpe){
		if(oponente.getNome() != this.getNome()){
			System.out.println("\nAtaque de " + this.getNome());
		    	golpe.acaoGolpear(oponente);
		}else{
			System.out.println("\nNão é possível o lutador atacar a si mesmo");
		
		}
	}
	
	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


}
