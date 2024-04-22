package test;

import titulos.observadores.sites.Google;
import titulos.observadores.sites.GGN;
import titulos.observadores.sites.Uol;
import titulos.observadores.titulos.Titulo;

public class ExemploMonitoramento {

	public static void main(String[] args) {
		Titulo titulo = new Titulo();
	
		Google google = new Google();
		titulo.registerObserver(google);
		
		GGN ggn = new GGN();
		titulo.registerObserver(ggn);
		
		Uol uol = new Uol();
		titulo.registerObserver(uol);
		
		Google google2 = new Google();
		titulo.registerObserver(google2);
		
		titulo.measurementsChanged(1, 10, 20, 1, "07/11/2022", "20/11/2022");
		System.out.println();
		titulo.measurementsChanged(2, 20, 40, 2, "07/11/2022", "20/11/2022");
		System.out.println();
		titulo.measurementsChanged(3, 30, 60, 3, "07/11/2022", "20/11/2022");
		
		titulo.removeObserver(google);
		titulo.removeObserver(google2);
		
		System.out.println();
		System.out.println("Compradores");
		titulo.measurementsChanged(4, 40, 80, 4, "07/11/2022", "20/11/2022");
	}
}
