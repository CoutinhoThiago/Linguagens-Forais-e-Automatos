package hamburgueria.condimentos.molhos;

import hamburgueria.condimentos.CondimentoDecorator;
import hamburgueria.produtos.categorias.Hamburguer;

public class MolhoSecretoDaCasa extends CondimentoDecorator {
	
	public MolhoSecretoDaCasa(Hamburguer hamburguer) {
		super(hamburguer);
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao() + ", molho secreto da casa";
	}

	@Override
	public double calcularPreco() {
		return 3.50 + hamburguer.calcularPreco();
	}

}
