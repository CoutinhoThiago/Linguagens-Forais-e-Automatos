package titulos.observadores.sites;

import titulos.observadores.Observer;
import titulos.observadores.titulos.Titulo;

public class Google implements Observer {
	private int codigo;
	private float valorDeCompra; 
	private float valorDeVenda;
	private int tipo; 
	private String dataVencimento; 
	private String dataLancamento;
	
	public void update(Titulo titulo) {
		this.codigo = titulo.getCodigo();
		this.valorDeCompra = titulo.getValorDeCompra();
		this.valorDeVenda = titulo.getValorDeVenda();
		this.tipo = titulo.getTipo();
		this.dataVencimento = titulo.getDataVencimento();
		this.dataLancamento = titulo.getDataLançamento();
		display();
	}
	
	public void display() {
		System.out.println("Site: Google");
		System.out.println("Código: " + codigo);
		System.out.println("Valor de compra: " + valorDeCompra);
		System.out.println("Valor de venda: " + valorDeVenda);
		System.out.println("Tipo: " + tipo);
		System.out.println("data de vcencimento: " + dataVencimento);
		System.out.println("data de lançamento: " + dataLancamento);
	}
	
}
