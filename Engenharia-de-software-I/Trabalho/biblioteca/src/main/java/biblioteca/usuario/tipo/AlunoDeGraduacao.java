package biblioteca.usuario.tipo;

import biblioteca.usuario.criador.CriadorContasAlunoDeGraduacao;
import biblioteca.usuario.interfaces.ICriadorContas;
import biblioteca.usuario.interfaces.IUsuario;

public class AlunoDeGraduacao implements IUsuario {
	private String nome;
	private String sobrenome;
	
	public AlunoDeGraduacao(String nome, String sobrenome) {
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
		return new CriadorContasAlunoDeGraduacao();
	}
}
