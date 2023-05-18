package br.com.fbmiranda;

import br.com.fbmiranda.golpes.Chute;
import br.com.fbmiranda.golpes.Rasteira;
import br.com.fbmiranda.golpes.Soco;

public class Main {

	public static void main(String[] args) {
		
		
		Lutador caio = new Lutador("Caio",100);
		Lutador jones= new Lutador("Jones",100);
		
		System.out.println("Simulação de luta");
		System.out.println(" \n# " + caio.getNome() + " VS " + jones.getNome() + " #\n ");
		
		System.out.println("Inicio da Luta!!!");
		
				
		jones.atacar(caio, new Soco());
		caio.atacar(jones, new Chute());
		jones.atacar(caio, new Rasteira());
		
		jones.atacar(jones, new Soco()); // tentativa de Auto-lesão

		// No Strategy Design Pattern, o objetivo é realizar uma operação com maneiras diferentes, ou seja, estratégias diferentes.
		
		//Neste exemplo, os lutadores possuem diferentes estratégias (Golpes) para atacar o oponente.
		//Cada golpe, possui um dano de ataque. O Soco causa 25 de dano, Chute 35, Rasteira 40.
		//É possível adicionar novos golpes e/ou modificar o dano que cada um deles causa no oponente.
	}


	
}
