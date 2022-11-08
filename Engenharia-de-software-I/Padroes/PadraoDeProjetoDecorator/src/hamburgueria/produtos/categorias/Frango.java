package hamburgueria.produtos.categorias;

public class Frango extends Hamburguer {

	public Frango() {
		descricao = "hambúrguer de frango";
	}
	
	@Override
	public double calcularPreco() {
		
		return 18.99;
	}

}
