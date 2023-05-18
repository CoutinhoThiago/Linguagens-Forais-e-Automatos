package modelo.candidatos.criador;

import modelo.Empregado;
import modelo.interfaces.ICandidato;
import modelo.interfaces.ICriadorContas;

public class CriadorContasGenerico implements ICriadorContas {
    
	public Empregado criar(ICandidato aluno)
    {
        Empregado empregado = new Empregado();

        empregado.setNome(aluno.getNome());
        empregado.setSobrenome(aluno.getSobrenome());
        empregado.setEmail(aluno.getNome().substring(0, 1) + aluno.getSobrenome() + "@xpto.com");
        
        return empregado;
    }
}
