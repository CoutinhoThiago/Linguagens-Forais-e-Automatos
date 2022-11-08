package hamburgueria.condimentos.molhos;

import hamburgueria.condimentos.CondimentoDecorator;
import hamburgueria.produtos.categorias.Hamburguer;

public class MolhoBarbecue extends CondimentoDecorator {
	
	public MolhoBarbecue(Hamburguer hamburguer) {
		super(hamburguer);
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao() + ", molho barbecue";
	}

	@Override
	public double calcularPreco() {
		return 2.00 + hamburguer.calcularPreco();
	}

}
