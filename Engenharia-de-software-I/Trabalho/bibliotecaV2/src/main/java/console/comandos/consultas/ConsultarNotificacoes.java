package console.comandos.consultas;


import java.util.List;

import biblioteca.Biblioteca;
import biblioteca.Dados;
import biblioteca.livro.Livro;
import biblioteca.livro.estado.Disponivel;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.tipo.Professor;
import console.comandos.Comando;

public class ConsultarNotificacoes implements Comando { //Ex: "ntf"
	public void executar(Dados dados, IUsuario usuario, Livro livro, List<Livro> livros) {
		new Biblioteca().consultarNotificacoes(usuario);
	}
}
