package biblioteca.livro;

import biblioteca.usuario.Professor;

public class Reserva {
	private Professor usuario;
	
	public Reserva(Professor usuario) {
		this.setUsuario(usuario);
	}

	public Professor getUsuario() {
		return usuario;
	}

	public void setUsuario(Professor usuario) {
		this.usuario = usuario;
	}
}
