package biblioteca.usuario.tipo;

import biblioteca.usuario.criador.CriadorContasProfessor;
import biblioteca.usuario.interfaces.ICriadorContas;
import biblioteca.usuario.interfaces.IUsuario;

public class Professor implements IUsuario {
	private String nome;
	private String sobrenome;
	
	public Professor(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}	
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public String getSobrenome() {
		return sobrenome;
	}
	
	@Override
	public ICriadorContas obterCriadorContas() {
		return new CriadorContasProfessor();
	}
}
