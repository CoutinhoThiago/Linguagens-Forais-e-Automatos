package console;

import java.util.List;
import java.util.Scanner;

import biblioteca.item.Livro;
import biblioteca.item.estados.Disponivel;
import biblioteca.usuario.Usuario;
import console.comandos.Devolver;
import console.comandos.PegarEmprestado;
import console.comandos.RegistrarObservador;
import console.comandos.Reservar;

public class Console {
	
	public static void selecionarFuncionalidade(List<Usuario> usuarios, List<Livro> livros) {
		System.out.println("Bom dia, O que o senhor deseja fazer ?"); // 
		System.out.println("Digite: " + "emp" + ", " + 
				"o código do usuario" + "e" + 
				" o código do livro" + 
				" para realizar o emprestimo de um livro");
		System.out.println("Digite: " + "dev" + " para realizar a devolução de um livro");
		System.out.println("Digite: " + "res" + " para realizar a reserva de um livro");
		System.out.println("Digite: " + "obs" + " para se registrar como observador de um livro");
		System.out.println("Digite: " + "liv" + " para realizar a consulta de um livro pelo seu código");
		System.out.println("Digite: " + "usu" + " para realizar o consulta dos emprestimos de um usuário");
		System.out.println("Digite: " + "ntf" + " para checar a quantidade de vezes que um professor foi notificado");
		System.out.println("Digite: " + "sai" + " para sair do sistema");
		Scanner ler = new Scanner(System.in);
		
		while (true) { 
			String[] entrada = ler.nextLine().split(" "); 
				String operacao= entrada[0];
			
			if (operacao.equals("sai")) { System.out.println("adeuxxxxxx"); break;}
			
			else if (operacao.equals("emp") || operacao.equals("dev") || operacao.equals("res") || operacao.equals("obs")) {
				int codigoDoUsuario = Integer.parseInt(entrada[1]);	//System.out.println(codigoDoUsuario);
				int codigoDoLivro = Integer.parseInt(entrada[2]);	//System.out.println(codigoDoLivro);
				Usuario usuario = Buscar.buscarUsuario(usuarios, codigoDoUsuario);
				Livro livro = Buscar.buscarLivro(livros, codigoDoLivro);
				if (operacao.equals("emp")) {
					Comando comando = new PegarEmprestado();
						comando.executar(usuario, livro);
				}
				else if (operacao.equals("dev")) {
					Comando comando = new Devolver();
						comando.executar(usuario, livro);
				}
				else if (operacao.equals("res")) {
					Comando comando = new Reservar();
						comando.executar(usuario, livro);
				}
				else if (operacao.equals("obs")) {
					Comando comando = new RegistrarObservador();
					comando.executar(usuario, livro);
				}
			}
				
			else if (operacao.equals("liv") || operacao.equals("usu") || operacao.equals("ntf")) {
				if (operacao.equals("liv")) {
					int codigoDoLivro = Integer.parseInt(entrada[1]);	//System.out.println(codigoDoLivro);
					Livro livro = Buscar.buscarLivro(livros, codigoDoLivro);
					Comando comando = new PegarEmprestado();
						comando.consultarLivro(livro);
				}
				else if (operacao.equals("usu")) {
					int codigoDoUsuario = Integer.parseInt(entrada[1]);	//System.out.println(codigoDoUsuario);
					Usuario usuario = Buscar.buscarUsuario(usuarios, codigoDoUsuario);
					Comando comando = new PegarEmprestado();
						comando.consultarUsuario(usuario);
				}
				else if (operacao.equals("ntf")) {
					int codigoDoUsuario = Integer.parseInt(entrada[1]);	//System.out.println(codigoDoUsuario);
					Usuario usuario = Buscar.buscarUsuario(usuarios, codigoDoUsuario);
					Comando comando = new PegarEmprestado();
						comando.consultarNotificacoes(usuario);
				}		
			}

	
			else {
				System.out.println("Digite um comando valido ou sai para encerrar o programa");
				System.out.println(operacao);
			}
		}
	}
}
