package console;

import java.util.List;

import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.tipo.Professor;

public interface Comando {
	public void executar(
			Dados dados, 
			IUsuario usuario, 
			List<Livro> livros,
			Livro livro
			);
}
