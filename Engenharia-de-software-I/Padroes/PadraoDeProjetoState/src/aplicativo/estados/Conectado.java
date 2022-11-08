package aplicativo.estados;

import aplicativo.Aplicativo;
import aplicativo.Estado;

public class Conectado implements Estado {
//	Fazer login: Apresenta mensagem “Você já está online”;
//	Sair: Apresenta a mensagem “Desconectando...” e muda o estado para Online;
//	Conectar: Apresenta a mensagem “Você já está conectado”;
	
	@Override
	public void fazerLogin(Aplicativo aplicativo) {System.out.println("Você já está online");}
	@Override
	public void sair(Aplicativo aplicativo) {
		System.out.println("Desconectando...");	
		aplicativo.estado = new OnLine();
	}
	@Override
	public void conectar(Aplicativo aplicativo) {System.out.println("Você já está conectado");}
}
