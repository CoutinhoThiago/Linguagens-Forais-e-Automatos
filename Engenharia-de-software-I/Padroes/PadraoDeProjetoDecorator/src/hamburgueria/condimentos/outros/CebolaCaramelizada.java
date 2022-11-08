package hamburgueria.condimentos.outros;

import hamburgueria.condimentos.CondimentoDecorator;
import hamburgueria.produtos.categorias.Hamburguer;

public class CebolaCaramelizada extends CondimentoDecorator {

	public CebolaCaramelizada(Hamburguer hamburguer) {
		super(hamburguer);
	}

	public String getDescricao() {
		return hamburguer.getDescricao() + ", cebola caramelizada";
	}
	
	@Override
	public double calcularPreco() {
		return 2.99 + hamburguer.calcularPreco();
	}

}