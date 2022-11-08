package aplicativo;

import aplicativo.estados.OffLine;

public class Aplicativo {	
	public Estado estado = new OffLine();
		
	public void fazerLogin() {
		this.estado.fazerLogin(this);
	}	
	public void sair () {
		this.estado.sair(this);
	}
	public void conectar() {
		this.estado.conectar(this);
	}
}
