package titulos.observadores.titulos;


import java.util.*;

import titulos.observadores.Observer;
import titulos.observados.Subject;

public class Titulo implements Subject {
	private ArrayList<Observer> observers;

	private int codigo;
	private float valorDeCompra; 
	private float valorDeVenda;
	private int tipo; 
	private String dataVencimento; 
	private String dataLancamento; 
	
	public Titulo() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}
	
	public void measurementsChanged(int codigo, float valorDeCompra, 
			float valorDeVenda, int tipo, String dataVencimento, String dataLancamento) {
		this.codigo = codigo;
		this.valorDeCompra = valorDeCompra;
		this.valorDeVenda = valorDeVenda;
		this.tipo = tipo;
		this.dataVencimento = dataVencimento;
		this.dataLancamento = dataLancamento;
		notifyObservers();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getValorDeCompra() {
		return valorDeCompra;
	}

	public void setValorDeCompra(float valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
	}

	public float getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(float valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDataLançamento() {
		return dataLancamento;
	}

	public void setDataLançamento(String dataLançamento) {
		this.dataLancamento = dataLançamento;
	}
	

}
