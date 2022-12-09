package console.comandos;

import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.tipo.Professor;
import console.Comando;


public class ConsultarLivro implements Comando {
	public void executar(Dados dados, IUsuario usuario, List<Livro> exemplares, Livro livro) {
		Biblioteca.consultarLivro(usuario, livro);
	}
}
