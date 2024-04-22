package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import biblioteca.item.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IInscricao;
import console.Console;

public class test {

	public static void main(String[] args) {
		List<Livro> livros = new ArrayList<Livro>();
		Dados.inicializarLivros(livros);
		//Dados.mostrarLivros(livros);
		
		List<Usuario> usuarios = new ArrayList<IUsuario>();
		Dados.inicializarUsuarios(usuarios);
		//Dados.mostrarUsuarios(usuarios);
		
		//CriarUsuario.criarUsuario(usuarios);
		//BuscarUsuario.selecionarUsuario(usuarios);
		
		Console.selecionarFuncionalidade(usuarios, livros);
	}
}
