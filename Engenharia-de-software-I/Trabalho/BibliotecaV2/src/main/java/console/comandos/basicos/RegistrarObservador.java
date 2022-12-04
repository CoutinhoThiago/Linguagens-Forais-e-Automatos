package console.comandos.basicos;

import java.util.List;

import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.usuario.Observer;
import console.comandos.Comando;

public class RegistrarObservador implements Comando { // EX: "obs
	public void executar(Dados dados, biblioteca.usuario.IUsuario usuario, biblioteca.livro.Livro livro, List<Livro> livros) {
		Observer observador = (Observer) usuario;
		livro.registerObserver(observador);
	}
}
