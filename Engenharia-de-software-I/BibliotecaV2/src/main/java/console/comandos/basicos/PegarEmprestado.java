package console.comandos.basicos;

import biblioteca.Biblioteca;
import biblioteca.Livro;
import biblioteca.Usuario;
import biblioteca.usuario.IUsuario;
import console.comandos.Comando;

public class PegarEmprestado implements Comando {//Ex: "emp 123 100"
	public void executar(IUsuario usuario, Livro livro) {
		new Biblioteca().pegarEmprestado(usuario, livro);
	}
}
