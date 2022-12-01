package console.comandos;

import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;

public interface Comando {
	public void executar(IUsuario usuario, Livro livro);
}
