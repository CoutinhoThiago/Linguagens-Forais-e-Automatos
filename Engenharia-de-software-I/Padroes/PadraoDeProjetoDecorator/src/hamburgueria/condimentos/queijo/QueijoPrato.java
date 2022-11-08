package hamburgueria.condimentos.queijo;

import hamburgueria.condimentos.CondimentoDecorator;
import hamburgueria.produtos.categorias.Hamburguer;

public class QueijoPrato extends CondimentoDecorator {

	public QueijoPrato(Hamburguer queijoPrato) {
		super(queijoPrato);
	}

	public String getDescricao() {
		return hamburguer.getDescricao() + ", queijo prato";
	}
	
	@Override
	public double calcularPreco() {
		return 1.99 + hamburguer.calcularPreco();
	}

}