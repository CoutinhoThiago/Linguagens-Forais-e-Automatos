package console.comandos.basicos;

import biblioteca.livro.Livro;
import biblioteca.usuario.Observer;
import console.comandos.Comando;

public class RegistrarObservador implements Comando { // EX: "obs
	public void executar(biblioteca.usuario.IUsuario usuario, biblioteca.livro.Livro livro) {
		Observer observador = (Observer) usuario;
		livro.registerObserver(observador);
	}
}
