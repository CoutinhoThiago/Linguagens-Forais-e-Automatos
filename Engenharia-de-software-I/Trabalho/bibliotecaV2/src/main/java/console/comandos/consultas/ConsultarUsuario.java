package console.comandos.consultas;

import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.livro.item.Emprestimo;
import biblioteca.livro.item.Reserva;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Observer;
import biblioteca.usuario.Usuario;
import console.comandos.Comando;

public class ConsultarUsuario implements Comando { // Ex: "usu"
	public void executar(Dados dados, IUsuario usuario, Livro livro, List<Livro> livros) {
		new Biblioteca().consultarUsuario(usuario, livro);
	}
}
