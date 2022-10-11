package br.ufba.srp;

import java.io.BufferedReader;
import java.io.IOException;

public class Validacoes {
	public static boolean validacaoPrimeiroNome(Pessoa usuario, BufferedReader teclado) throws IOException {
		if (usuario.getPrimeiroNome().isEmpty()) {
			Mensagens.mensagemDePrimeiroNomeInvalido();
			Encerrador.finalizar(teclado);
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean validacaoUltimoNome(Pessoa usuario, BufferedReader teclado) throws IOException {
		if (usuario.getUltimoNome().isEmpty()) {
			Mensagens.mensagemDeUltimoNomeInvalido();
			Encerrador.finalizar(teclado);
			return false;
		} else {
			return true;
		}
	}

}
