package br.ufba.srp;

import java.io.BufferedReader;
import java.io.IOException;

public class Factory {
	
	public static Pessoa criarPessoa(BufferedReader teclado) throws IOException {
		Pessoa pessoa = new Pessoa();
		
		Mensagens.menagemPrimeiroNome();
		String primeiroNome = PegaDados.pegaPrimeiroNome(pessoa, teclado);
		pessoa.setPrimeiroNome(primeiroNome);
			// Verifica se o primeiro nome e validos
			Validacoes.validacaoPrimeiroNome(pessoa, teclado);

		Mensagens.mensagemUltimoNome();
		String ultimoNome = PegaDados.pegaUltimoNome(pessoa, teclado);
		pessoa.setUltimoNome(ultimoNome);
			// Verifica se o segundo nome e validos
			Validacoes.validacaoUltimoNome(pessoa, teclado);
	
		return pessoa;
	}
	public static Pessoa criarUsuario(Pessoa pessoa, BufferedReader teclado) throws IOException {
		Mensagens.mensagemCriacaoDeUsuario(pessoa);
		Encerrador.finalizar(teclado);
		return pessoa;
	}
}
