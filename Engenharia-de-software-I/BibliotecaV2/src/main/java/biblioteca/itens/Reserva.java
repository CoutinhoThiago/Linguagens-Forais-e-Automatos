package biblioteca.itens;

import biblioteca.Livro;
import biblioteca.usuario.IUsuario;

public class Reserva {
	private int codigo;
	private IUsuario usuario;
	private Livro livro;
	
	public Reserva(int codigo, IUsuario usuario, Livro livro) {
		this.setCodigo(codigo);
		this.setUsuario(usuario);
		this.setLivro(livro);
	}

	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	
	public IUsuario getUsuario() {return usuario;}
	public void setUsuario(IUsuario usuario) {this.usuario = usuario;}
	public Livro getLivro() {return livro;}
	public void setLivro(Livro livro) {this.livro = livro;}
}
