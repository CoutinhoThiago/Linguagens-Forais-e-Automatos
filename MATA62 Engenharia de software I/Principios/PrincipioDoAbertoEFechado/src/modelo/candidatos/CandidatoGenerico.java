package modelo.candidatos;

import modelo.candidatos.criador.CriadorContasGenerico;
import modelo.interfaces.ICandidato;
import modelo.interfaces.ICriadorContas;

public class CandidatoGenerico implements ICandidato {
	private String nome;
	private String sobrenome;
	
	public CandidatoGenerico(String nome, String sobrenome) {
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
		return new CriadorContasGenerico();
	}
}
