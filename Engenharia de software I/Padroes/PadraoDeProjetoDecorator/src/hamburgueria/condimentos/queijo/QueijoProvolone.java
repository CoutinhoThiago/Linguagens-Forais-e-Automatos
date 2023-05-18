package hamburgueria.condimentos.queijo;

import hamburgueria.condimentos.CondimentoDecorator;
import hamburgueria.produtos.categorias.Hamburguer;

public class QueijoProvolone extends CondimentoDecorator {

	protected QueijoProvolone(Hamburguer queijoPrato) {
		super(queijoPrato);
	}

	public String getDescricao() {
		return hamburguer.getDescricao() + ", queijo provolone";
	}
	
	@Override
	public double calcularPreco() {
		return 1.99 + hamburguer.calcularPreco();
	}

}