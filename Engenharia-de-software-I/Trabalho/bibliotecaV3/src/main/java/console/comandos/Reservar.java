package console.comandos;


import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.livro.item.Exemplar;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.tipo.Professor;
import console.Comando;

public class Reservar implements Comando { // Ex: "res 123 100"
	public void executar(Dados dados, IUsuario usuario, List<Livro> livros, Livro livro) {
		Biblioteca.reservar(livro, usuario);
	}
}

