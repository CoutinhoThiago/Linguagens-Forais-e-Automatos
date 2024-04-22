package br.com.fbmiranda.golpes;

import br.com.fbmiranda.Golpe;
import br.com.fbmiranda.Lutador;

public class Rasteira implements Golpe {

	@Override
	public void acaoGolpear(Lutador oponente) {
		
		oponente.setVida(oponente.getVida() - 40);
		System.out.println("usou  e causou 40 de dano");
		System.out.println("Vida do "+ oponente.getNome() + ":" + oponente.getVida());
		
	}


}


