package console.comandos.basicos;

import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;
import console.comandos.Comando;

public class PegarEmprestado implements Comando {//Ex: "emp 123 100"
	public void executar(IUsuario usuario, Livro livro, List<Livro> livros) {
		new Biblioteca().pegarEmprestado(usuario, livro);
	}
}