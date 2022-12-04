package console;

import java.util.List;

import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.usuario.Professor;

public interface Comando {
	public void executar(
			Dados dados, 
			Professor usuario, 
			List<Livro> livros,
			Livro livro
			);
}
