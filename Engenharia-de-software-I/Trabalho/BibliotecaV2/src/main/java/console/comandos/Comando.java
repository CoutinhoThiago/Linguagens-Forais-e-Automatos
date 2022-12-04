package console.comandos;

import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;

public interface Comando {
	public void executar(
			Dados dados, 
			IUsuario usuario, 
			Livro livro, List<Livro> livros);
}
