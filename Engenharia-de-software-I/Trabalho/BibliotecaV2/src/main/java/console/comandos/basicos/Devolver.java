package console.comandos.basicos;


import java.util.List;

import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;
import console.comandos.Comando;

public class Devolver implements Comando{ // Ex: "dev 123 100"
//	O sistema deve permitir a devolução de um dado livro. Durante a devolução, o usuário deve
//	digitar o comando “dev” seguido do código de identificação do usuário e do código de
//	identificação do livro emprestado. Ao final, o sistema deve emitir uma mensagem de sucesso
//	ou insucesso da devolução, que mencione o nome do usuário e o título do livro. A mensagem
//	de insucesso deve dizer o motivo. Nesse caso, o insucesso só ocorre se não houver
//	empréstimo em aberto daquele livro para aquele usuário.

	public void executar(Dados dados, IUsuario usuario, Livro livro, List<Livro> livros) {
		// TODO Auto-generated method stub
		
	}
}
