package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IInscricao;

public class test {

	public static void main(String[] args) {
		List<Livro> livros = new ArrayList<Livro>();
		Dados.inicializarLivros(livros);
		//Dados.mostrarLivros(livros);
		
		List<IInscricao> inscricoes = new ArrayList<IInscricao>();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Dados.inicializarUsuarios(inscricoes, usuarios);
		//Dados.mostrarUsuarios(usuarios);
		
		//CriarUsuario.criarUsuario(usuarios);
		//BuscarUsuario.selecionarUsuario(usuarios);
		
		selecionarFuncionalidade(usuarios, livros);
	}

	private static void selecionarFuncionalidade(List<Usuario> usuarios, List<Livro> livros) {
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
			else if (operacao.equals("emp")) {
				int codigoDoUsuario = Integer.parseInt(entrada[1]);
				int codigoDoLivro = Integer.parseInt(entrada[2]);
				//System.out.println(codigoDoUsuario);
				//System.out.println(codigoDoLivro);
				
				Usuario usuario = null;
				usuario = Buscar.buscarUsuario(usuarios, codigoDoUsuario, usuario);
				Livro livro = null;
				livro = Buscar.buscarLivro(livros, codigoDoLivro, livro);
				
				livro.pegarEmprestado(usuario, livro);
				//Caso o usuário tenha uma reserva feita previamente por ele para o dado livro, a 
				//reserva deve ser excluída e o empréstimo efetivado. 
				
				//Ao final do procedimentoo sistema deve emitir uma mensagem de sucesso ou insucesso, 
				//que mencione o nome do usuário e o título do livro. 
				//Se for uma mensagem de insucesso, ela deve também mencionar o motivo do insucesso
			}
			else if (operacao.equals("dev")) {
				
			}
			else if (operacao.equals("res")) {
				
			}
			
			else if (operacao.equals("dev")) {
		
			}
			
			else if (operacao.equals("liv")) {
		
			}
			else if (operacao.equals("usu")) {
		
			}
			else if (operacao.equals("ntf")) {
		
			}
			else {
				System.out.println("Digite um comando valido ou sai para encerrar o programa");
				System.out.println(operacao);
			}
		}
	}
}
