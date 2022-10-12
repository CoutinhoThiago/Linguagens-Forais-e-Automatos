package br.ufba.idp.mecanismos;

import br.ufba.idp.interfaces.ILog;

public class MecanismoLog implements ILog {
	
	@Override
	public void log(String mensagem) {
		System.out.println(mensagem);
	}
}
