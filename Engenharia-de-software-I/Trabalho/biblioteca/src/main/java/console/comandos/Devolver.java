package console.comandos;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import console.Comando;

public class Devolver implements Comando{ // Ex: "dev 123 100"
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
