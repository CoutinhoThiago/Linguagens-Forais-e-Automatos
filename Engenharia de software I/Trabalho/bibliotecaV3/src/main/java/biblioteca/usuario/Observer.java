package biblioteca.usuario;

import biblioteca.livro.Livro;

public interface Observer {
	void update(Livro livro);
}
