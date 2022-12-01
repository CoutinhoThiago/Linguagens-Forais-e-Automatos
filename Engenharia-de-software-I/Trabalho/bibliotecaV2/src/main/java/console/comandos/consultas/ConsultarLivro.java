package console.comandos.consultas;

import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.livro.Livro;
import biblioteca.livro.item.Emprestimo;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;
import console.comandos.Comando;

public class ConsultarLivro implements Comando {
	public void executar(IUsuario usuario, Livro livro) {
		new Biblioteca().consultarLivro(livro);
	}
}
