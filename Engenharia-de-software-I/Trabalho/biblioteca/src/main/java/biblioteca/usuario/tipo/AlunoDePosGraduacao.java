package biblioteca.usuario.tipo;

import biblioteca.usuario.criador.CriadorContasAlunoDeGraduacao;
import biblioteca.usuario.criador.CriadorContasAlunoDePosGraduacao;
import biblioteca.usuario.interfaces.ICriadorContas;
import biblioteca.usuario.interfaces.IUsuario;

public class AlunoDePosGraduacao implements IUsuario {
	private String nome;
	private String sobrenome;
	
	public AlunoDePosGraduacao(String nome, String sobrenome) {
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
		return new CriadorContasAlunoDePosGraduacao();
	}
}
