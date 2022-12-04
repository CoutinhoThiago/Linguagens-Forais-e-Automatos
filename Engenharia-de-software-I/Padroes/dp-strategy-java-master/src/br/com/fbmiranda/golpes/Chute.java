package br.com.fbmiranda.golpes;

import br.com.fbmiranda.Golpe;
import br.com.fbmiranda.Lutador;

public class Chute implements Golpe{

	
	@Override
	public void acaoGolpear(Lutador oponente) {
		
		oponente.setVida(oponente.getVida() - 35);
		System.out.println(" usou Chute e causou 35 de dano");
		System.out.println("Vida do "+ oponente.getNome() + ":" + oponente.getVida());
		
	}

}
