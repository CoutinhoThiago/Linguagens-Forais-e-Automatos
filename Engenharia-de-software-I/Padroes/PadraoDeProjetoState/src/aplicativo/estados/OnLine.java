package aplicativo.estados;

import aplicativo.Aplicativo;
import aplicativo.Estado;

public class OnLine implements Estado {
//	Fazer login: Apresenta mensagem “Você já está online”;
//	Sair: Apresenta a mensagem “Saindo...” e muda o estado para Offline;
//	Conectar: Apresenta a mensagem “Conectando...” e muda o estado para Conectado; 
	
	@Override
	public void fazerLogin(Aplicativo aplicativo) {System.out.println("Você já está online");}
	@Override
	public void sair(Aplicativo aplicativo) {
		System.out.println("Saindo...");
		//e muda o estado para Offline	
		aplicativo.estado = new OffLine();
	}
	@Override
	public void conectar(Aplicativo aplicativo) { 
		System.out.println("Conectando...");
		//e muda o estado para Conectado;
		aplicativo.estado = new Conectado();
	}
}
