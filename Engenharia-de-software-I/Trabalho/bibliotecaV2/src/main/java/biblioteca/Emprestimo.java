package biblioteca;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;

public class Emprestimo {
	private int codigo;
	private Usuario usuario;
	private Livro livro;
	
	public Emprestimo(int codigo, Usuario usuario, Livro livro) {
		this.setCodigo(codigo);
		this.setUsuario(usuario);
		this.setLivro(livro);
	}

	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	
	public Usuario getUsuario() {return usuario;}
	public void setUsuario(Usuario usuario) {this.usuario = usuario;}
	public Livro getLivro() {return livro;}
	public void setLivro(Livro livro) {this.livro = livro;}
}
