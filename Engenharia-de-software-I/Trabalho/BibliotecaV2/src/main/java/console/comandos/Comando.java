package console.comandos;

import biblioteca.Livro;
import biblioteca.Usuario;
import biblioteca.usuario.IUsuario;

public interface Comando {
	public void executar(IUsuario usuario, Livro livro);
}
