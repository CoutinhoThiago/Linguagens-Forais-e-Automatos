package aplicativo.estados;

import aplicativo.Aplicativo;
import aplicativo.Estado;

public class OffLine implements Estado {
//	Fazer login: Apresenta mensagem “Fazendo login...” e muda o estado para Online;
//	Sair: Apresenta a mensagem “Você não está online”;
//	Conectar: Apresenta a mensagem “Impossível conectar, pois você está offline”; 
	
	@Override
	public void fazerLogin(Aplicativo aplicativo) {
		System.out.println("Fazendo login...");
		//e muda o estado para Online
		aplicativo.estado = new OnLine();
	}
	@Override
	public void sair(Aplicativo aplicativo) {System.out.println("Você não está online");}
	@Override
	public void conectar(Aplicativo aplicativo) {System.out.println("Impossível conectar, pois você está offline");}
}
