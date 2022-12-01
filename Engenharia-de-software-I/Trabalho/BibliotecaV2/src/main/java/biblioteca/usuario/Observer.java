package biblioteca.usuario;

import biblioteca.livro.Livro;

public interface Observer {
	public void update(Livro livro);
}
