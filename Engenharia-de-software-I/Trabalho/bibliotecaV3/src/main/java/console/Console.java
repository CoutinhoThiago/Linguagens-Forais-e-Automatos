package console;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import biblioteca.Dados;
import biblioteca.livro.Exemplar;
import biblioteca.livro.Livro;
import biblioteca.usuario.Professor;
import console.comandos.ConsultarLivro;
import console.comandos.ConsultarNotificacoes;
import console.comandos.ConsultarUsuario;
import console.comandos.Devolver;
import console.comandos.PegarEmprestado;
import console.comandos.RegistrarObservador;
import console.comandos.Reservar;

public class Console {
	
	public static void selecionarFuncionalidade() {
		Dados dados = new Dados();
		List<Professor> usuarios = dados.getListaDeUsuarios();
		List<Livro> livros = dados.getListaDeLivros();
		
		
		System.out.println("Bom dia, O que o senhor deseja fazer ?"); // 
		System.out.println("Digite: " + "emp" + ", " + 
				"o código do usuario e" + 
				" o código do livro" + 
				" para realizar o emprestimo de um livro");
		System.out.println("Digite: " + "dev" + ", " + 
				"o código do usuario e" + 
				" o código do livro" + 
				" para realizar a devolução de um livro");
		System.out.println("Digite: " + "res" + ", " + 
				"o código do usuario e" + 
				" o código do livro" + 
				" para realizar a reserva de um livro");
		System.out.println("Digite: " + "obs" + ", " + 
				"o código do usuario e" + 
				" o código do livro" + 
				 " para se registrar como observador de um livro");
		
		
		System.out.println("Digite: " + "liv" + 
				" e o código do livro" + 
				" para realizar a consulta de um livro pelo seu código");
		System.out.println("Digite: " + "usu" + 
				" e o código do usuario " + 
				" para realizar o consulta dos emprestimos de um usuário");
		System.out.println("Digite: " + "ntf" + 
				" e o código do usuario " + 
				" para checar a quantidade de vezes que um professor foi notificado");
		
		System.out.println("Digite: " + "sai" + " para sair do sistema");
		System.out.println("Digite: " + "op" + " para mostrar novamente as opções");
		
		Scanner ler = new Scanner(System.in);
		
		while (true) { 
			String[] entrada = ler.nextLine().split(" "); 
				String operacao= entrada[0];
			
			if (operacao.equals("sai")) { System.out.println("adeuxxxxxx"); break;} //Cabo daciolo
			
		
			else if (operacao.equals("emp") || operacao.equals("dev") || operacao.equals("res") || operacao.equals("obs")) {
				int codigoDoUsuario = Integer.parseInt(entrada[1]);	//System.out.println(codigoDoUsuario);
				int codigoDoLivro = Integer.parseInt(entrada[2]);	//System.out.println(codigoDoLivro);
				
				Professor usuario = buscarUsuario(usuarios, codigoDoUsuario);
				Livro livro = buscarLivro(livros, codigoDoLivro);
				
//				List<Livro> listaDeExemplares = buscarExemplares(livros, codigoDoLivro);
			
				if (operacao.equals("emp")) {
					Comando comando = new PegarEmprestado();
						comando.executar(dados, usuario, livros, livro);
				}
				else if (operacao.equals("dev")) {
					Comando comando = new Devolver();
						comando.executar(dados, usuario, livros, livro);
				}
				else if (operacao.equals("res")) {
					Comando comando = new Reservar();
						comando.executar(dados, usuario, livros, livro);
				}
				else if (operacao.equals("obs")) {
					Comando comando = new RegistrarObservador();
						comando.executar(dados, usuario, livros, livro);
				}	
			}
			else if (operacao.equals("liv")) {
				int codigoDoLivro = Integer.parseInt(entrada[1]);	//System.out.println(codigoDoLivro);
				Livro livro = buscarLivro(livros, codigoDoLivro);
				Comando comando = new ConsultarLivro();
					comando.executar(dados, null, livros, livro);
			}
			else if (operacao.equals("usu")) {
				int codigoDoUsuario = Integer.parseInt(entrada[1]);	//System.out.println(codigoDoUsuario);
				Professor usuario = buscarUsuario(usuarios, codigoDoUsuario);
				Comando comando = new ConsultarUsuario();
					comando.executar(dados, usuario, livros, null);
			}
			else if (operacao.equals("ntf")) {
				int codigoDoUsuario = Integer.parseInt(entrada[1]);	//System.out.println(codigoDoUsuario);
				Professor usuario = buscarUsuario(usuarios, codigoDoUsuario);
				Comando comando = new ConsultarNotificacoes();
					comando.executar(dados, usuario, livros, null);
			}
			
			else if (operacao.equals("op")) {
				selecionarFuncionalidade();
			}
			else {
				System.out.println(operacao + " não é um comando valido");
				System.out.println("Por favor digite um comando valido ou sai para encerrar o programa");
			}
		}
	}

	static Professor buscarUsuario(List<Professor> usuarios, int codigoDoUsuario) {
		for(int i = 0; i < usuarios.size(); i++){
			System.out.println("buscando usuario...");
			Professor usuario = usuarios.get(i);
			if(usuario.getCodigo() == codigoDoUsuario) {
				System.out.println("Usuario: " + usuario.getNome() + " encontrado");
				return usuario;
			}
		    if (i >= usuarios.size()-1) {
		    	System.out.println("Usuario não encontrado!");
		    	break;
		    }
		}
		return null;
	}
	static Livro buscarLivro(List<Livro> livros, int codigoDoLivro) {
		for(int i = 0; i < livros.size(); i++){
			System.out.println("buscando livro...");
			Livro livro = livros.get(i);
			if(livro.getCodigo() == codigoDoLivro) {
				System.out.println("Livro: " + livro.getNome() + " encontrado");
				return livro;
			}
		    if (i >= livros.size()-1) {
		    	System.out.println("Livro não encontrado!");
		    	break;
		    }
		}
		return null;
	}
}
