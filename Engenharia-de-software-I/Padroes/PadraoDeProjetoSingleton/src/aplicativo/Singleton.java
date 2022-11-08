package aplicativo;

public class Singleton {
	private boolean onLine;
	private boolean offLine;
	private boolean conectado;
	private Singleton() {
		onLine = false;
		offLine = true;
		conectado = false;
	}
	private static Singleton instancia;
	public static Singleton obterInstancia() {
		if (instancia == null) {instancia = new Singleton();}
		return instancia;
	}
	public void conectar() { 
		if (isConectado()) {System.out.println("Você já está conectado");}
		if (isOnLine()) {
			System.out.println("Conectando...");
			conectado = true;
		}
		if (isOffLine()) {System.out.println("Impossível conectar, pois você está offline");}
	}
	public void sair() { 
		if (isConectado()) {
			System.out.println("Desconectando...");
			onLine = true;
		}
		if (isOnLine()) {
			System.out.println("Saindo...");
			offLine = true;
		}	
		if (isOffLine()) {System.out.println("Você não está online");}
	}
	public void fazerLogin() { 
		if (isConectado()) {System.out.println("Você já está online");}
		if (isOnLine()) {System.out.println("Você já está online");}
		if (isOffLine()) {
			System.out.println("Fazendo login...");
			onLine = true;
		}
	}
	
	public boolean isOnLine() {return onLine;}
	public boolean isOffLine() {return offLine;}
	public boolean isConectado() {return conectado;}
}