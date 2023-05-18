package modelo.candidatos.criador;

import modelo.Empregado;
import modelo.interfaces.ICandidato;
import modelo.interfaces.ICriadorContas;

public class CriadorContasGerente implements ICriadorContas {
    
	@Override
    public Empregado criar(ICandidato candidato) {
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setEmail(candidato.getNome() + candidato.getSobrenome() + "@xpto.com");
        
        empregado.setGerente(true);
        
        return empregado;
    }
}
