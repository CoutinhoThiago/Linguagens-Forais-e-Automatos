package hamburgueria.condimentos.outros;

import hamburgueria.condimentos.CondimentoDecorator;
import hamburgueria.produtos.categorias.Hamburguer;

public class Bacon extends CondimentoDecorator {

	public Bacon(Hamburguer queijoPrato) {
		super(queijoPrato);
	}

	public String getDescricao() {
		return hamburguer.getDescricao() + ", bacon";
	}
	
	@Override
	public double calcularPreco() {
		return 5.00 + hamburguer.calcularPreco();
	}

}