package hamburgueria.condimentos;

import hamburgueria.produtos.categorias.Hamburguer;

public abstract class CondimentoDecorator extends Hamburguer {
	protected Hamburguer hamburguer;
	
	protected CondimentoDecorator(Hamburguer hamburguer) {
		this.hamburguer = hamburguer;
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao();
	}
	
}
