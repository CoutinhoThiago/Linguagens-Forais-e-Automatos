package br.com.fbmiranda.golpes;

import br.com.fbmiranda.Lutador;
import br.com.fbmiranda.Golpe;

public class Soco implements Golpe{
	
	@Override
	public void acaoGolpear(Lutador oponente) {
		
		oponente.setVida(oponente.getVida() - 25);
		System.out.println(" usou Soco e causou 25 de dano");
		System.out.println("Vida do "+ oponente.getNome() + ":" + oponente.getVida());
		
	}

}
