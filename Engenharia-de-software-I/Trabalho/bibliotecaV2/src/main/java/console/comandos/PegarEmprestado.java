package console.comandos;


import biblioteca.Biblioteca;
import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import console.Comando;

public class PegarEmprestado implements Comando {//Ex: "emp 123 100"
	@Override
	public void executar(Usuario usuario, Livro livro) {
		new Biblioteca().pegarEmprestado(usuario, livro);
	}
}
