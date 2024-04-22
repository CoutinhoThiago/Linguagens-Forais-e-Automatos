package biblioteca.livro;

public interface Estado {
	public void pegarEmprestado(Livro livro);
	
	public void Devolver(Livro livro);
	
	public void Reservar(Livro livro);
}
