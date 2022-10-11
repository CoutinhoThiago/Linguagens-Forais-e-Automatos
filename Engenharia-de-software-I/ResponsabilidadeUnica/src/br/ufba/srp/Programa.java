package br.ufba.srp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Mensagens.mensagemDeInicio();
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		//Pega os dados da pessoa
		Pessoa pessoa = Factory.criarPessoa(teclado);
		
		Pessoa usuario = Factory.criarUsuario(pessoa, teclado); 
	}

}