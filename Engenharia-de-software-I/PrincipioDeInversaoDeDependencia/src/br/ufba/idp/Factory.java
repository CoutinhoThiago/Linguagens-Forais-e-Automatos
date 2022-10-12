package br.ufba.idp;

import br.ufba.idp.interfaces.IFuncionario;
import br.ufba.idp.interfaces.ILog;
import br.ufba.idp.interfaces.IMensagem;
import br.ufba.idp.interfaces.ITarefa;
import br.ufba.idp.mecanismos.MecanismoLog;
import br.ufba.idp.mecanismos.MecanismoWhatsApp;
import br.ufba.idp.modelo.Funcionario;
import br.ufba.idp.modelo.Tarefa;

public class Factory {
	public static IFuncionario criarFuncionario() {
		return new Funcionario();
	}
	
	public static ITarefa criarTarefa() {
		return new Tarefa(criarLog(), criarMensagem());
	}
	
	public static ILog criarLog() {
		return new MecanismoLog();
	}
	
	public static IMensagem criarMensagem() {
		return new MecanismoWhatsApp();
	}
}
