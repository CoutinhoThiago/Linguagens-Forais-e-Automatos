package br.ufba.idp;

import br.ufba.idp.interfaces.IFuncionario;
import br.ufba.idp.interfaces.ITarefa;

public class Programa {

	public static void main(String[] args) {
        IFuncionario funcionario = Factory.criarFuncionario();
	        funcionario.setNome("Thiago");
	        funcionario.setSobreNome("Coutinho");
	        funcionario.setTelefone("(71) 99299 0302");
	        funcionario.setEmail("thiago.coutinho@ufba.br");

        ITarefa tarefa = Factory.criarTarefa();
	        tarefa.setNome("Preparar o relatorio");
	        tarefa.setResponsavel(funcionario);

	        tarefa.realizarTrabalho(3);
	        tarefa.realizarTrabalho(1.5);
	        tarefa.completarTarefa();
	}

}
