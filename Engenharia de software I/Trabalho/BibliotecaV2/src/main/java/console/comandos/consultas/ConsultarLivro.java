package console.comandos.consultas;

import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.livro.item.Emprestimo;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;
import console.comandos.Comando;

public class ConsultarLivro implements Comando {
	public void executar(Dados dados, IUsuario usuario, Livro livro, List<Livro> exemplares) {
		new Biblioteca().consultarLivro(livro, exemplares);
	}
}
