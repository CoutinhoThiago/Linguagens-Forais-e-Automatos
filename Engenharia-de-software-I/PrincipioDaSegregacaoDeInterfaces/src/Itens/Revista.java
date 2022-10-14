package Itens;
import interfaces.espefcificas.papel.IRevista;

public class Revista implements IRevista {
    public String idItemBiblioteca;
    public String titulo;
    public String autor;
    public int numeroPaginas;

	public String getIdItemBiblioteca() {
		return idItemBiblioteca;
	}
	public void setIdItemBiblioteca(String idItemBiblioteca) {
		this.idItemBiblioteca = idItemBiblioteca;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	@Override
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
}
