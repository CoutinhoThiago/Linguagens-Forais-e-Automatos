package console;

import java.util.List;
import java.util.Scanner;

import biblioteca.Livro;
import biblioteca.livro.estado.Disponivel;
import biblioteca.usuario.IUsuario;

public class Buscar {
	static IUsuario buscarUsuario(List<IUsuario> usuarios, int codigoDoUsuario) {
		for(int i = 0; i < usuarios.size(); i++){
			System.out.println("buscando usuario...");
			if(usuarios.get(i).getCodigo() == codigoDoUsuario) {
//				System.out.println(usuarios.get(i).getNome());
			    return usuarios.get(i);
			}
		    else {
		    	if (i >= usuarios.size()-1) {
		    		System.out.println("Usuario não encontrado!");
		    		break;
		    	}
		    }
		}
		return null;
	}
	
	static Livro buscarLivro(List<Livro> livros, int codigoDoLivro) {
		for(int i = 0; i < livros.size(); i++){
			System.out.println("buscando livro...");
			if(livros.get(i).getCodigo() == codigoDoLivro) {
//				System.out.println(livros.get(i).getNome());
				if (livros.get(i).estado instanceof Disponivel) {
					return livros.get(i);
				}
			}
		    else {
		    	if (i >= livros.size()-1) {
		    		System.out.println("Livro não encontrado!");
		    		break;
		    	}
		    }
		}
		return null;
	}
}
