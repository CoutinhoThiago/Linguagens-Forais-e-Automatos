package br.ufba.srp;

import java.io.BufferedReader;
import java.io.IOException;

public class Encerrador {

	public static void finalizar(BufferedReader teclado) throws IOException {
		Mensagens.mensagemDeFinalizacao();
		teclado.readLine();
		System.exit(0);
	}

}
