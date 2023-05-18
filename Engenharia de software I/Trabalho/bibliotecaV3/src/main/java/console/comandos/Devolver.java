package console.comandos;

import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.tipo.Professor;
import console.Comando;

public class Devolver implements Comando{ // Ex: "dev 123 100"
	public void executar(Dados dados, IUsuario usuario, List<Livro> livros, Livro livro) {
		Biblioteca.devolver(livro, usuario);
	}
}
