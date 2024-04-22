package console;

import java.util.ArrayList;
import java.util.List;

import modelo.*;
import modelo.candidatos.CandidatoDiretor;
import modelo.candidatos.CandidatoGenerico;
import modelo.candidatos.CandidatoGerente;
import modelo.interfaces.ICandidato;

public class Program {

	public static void main(String[] args) {
		List<ICandidato> candidatos = new ArrayList<ICandidato>();
	    candidatos.add(new CandidatoGenerico("Carlos", "Silva"));
	    candidatos.add(new CandidatoGerente("Maria", "Souza"));
	    candidatos.add(new CandidatoDiretor("Ana", "Lopes"));

	    List<Empregado> empregados = new ArrayList<Empregado>();
	    //CriadorContasGenerico criadorContas = new CriadorContasGenerico();

	    for (ICandidato candidato: candidatos)
	    {
	    	empregados.add(candidato.obterCriadorContas().criar(candidato));
	    }

	    for (Empregado empregado: empregados)
	    {
	        System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + " " + empregado.getEmail());
	    }

	}

}
