package biblioteca.item.estado;

import biblioteca.item.Livro;

public interface Estado {
	public void disponivel(Livro livro);

	public void reservado(Livro livro);

	public void emprestado(Livro livro);
}
