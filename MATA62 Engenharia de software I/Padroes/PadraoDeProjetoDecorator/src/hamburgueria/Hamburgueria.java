package hamburgueria;

import hamburgueria.condimentos.molhos.MolhoBarbecue;
import hamburgueria.condimentos.outros.Bacon;
import hamburgueria.condimentos.outros.CebolaCaramelizada;
import hamburgueria.condimentos.queijo.QueijoPrato;
import hamburgueria.produtos.categorias.CarneDeBoi;
import hamburgueria.produtos.categorias.Frango;
import hamburgueria.produtos.categorias.Hamburguer;
import hamburgueria.produtos.categorias.Peixe;

public class Hamburgueria {

	public static void main(String[] args) {
		Hamburguer hamburguer = new CarneDeBoi();
		System.out.println(hamburguer.getDescricao() 
				+ " R$" + hamburguer.calcularPreco());
 
		Hamburguer hamburguer2 = new Peixe();
		hamburguer2 = new QueijoPrato(hamburguer2);
		System.out.println(hamburguer2.getDescricao() 
				+ " R$" + hamburguer2.calcularPreco());
 
		Hamburguer hamburguer3 = new Frango();
		hamburguer3 = new QueijoPrato(hamburguer3);
		hamburguer3 = new MolhoBarbecue(hamburguer3);
		System.out.println(hamburguer3.getDescricao() 
				+ " R$" + hamburguer3.calcularPreco());
		
		Hamburguer hamburguer4 = new CebolaCaramelizada(new QueijoPrato(new Bacon(new Frango())));
		System.out.println(hamburguer4.getDescricao() 
				+ " R$" + hamburguer4.calcularPreco());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
