package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IInscricao;
import console.Console;

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
		
		Console.selecionarFuncionalidade(usuarios, livros);
	}
}
