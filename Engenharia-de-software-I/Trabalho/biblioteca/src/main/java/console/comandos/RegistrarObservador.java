package console.comandos;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import console.Comando;

public class RegistrarObservador implements Comando { // EX: "obs
	@Override
	public void executar(Usuario usuario, Livro livro) {
		// TODO Auto-generated method stub
			
	}
	@Override
	public void consultarUsuario(Usuario usuario) {}
	@Override
	public void consultarLivro(Livro livro) {}
	@Override
	public void consultarNotificacoes(Usuario usuario) {}
}
