package console.comandos;

import java.util.List;

import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;

public interface Comando {
	public void executar(IUsuario usuario, Livro livro, List<Livro> livros);
}
