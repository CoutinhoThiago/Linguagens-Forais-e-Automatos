package console.comandos;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import console.Buscar;
import console.Comando;

public class PegarEmprestado implements Comando {//Ex: "emp 123 100"
	@Override
	public void executar(Usuario usuario, Livro livro) {
		//Caso o usuário tenha uma reserva feita previamente por ele para o dado livro, a 
		//reserva deve ser excluída e o empréstimo efetivado. 
		
		//Ao final do procedimentoo sistema deve emitir uma mensagem de sucesso ou insucesso, 
		//que mencione o nome do usuário e o título do livro. 
		//Se for uma mensagem de insucesso, ela deve também mencionar o motivo do insucesso
	}
	@Override
	public void consultarUsuario(Usuario usuario) {}
	@Override
	public void consultarLivro(Livro livro) {}
	@Override
	public void consultarNotificacoes(Usuario usuario) {}
}
