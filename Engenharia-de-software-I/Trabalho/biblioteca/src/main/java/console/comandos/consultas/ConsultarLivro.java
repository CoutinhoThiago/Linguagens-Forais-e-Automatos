package console.comandos.consultas;

import java.util.List;

import biblioteca.item.Livro;
import biblioteca.item.estados.Disponivel;
import biblioteca.usuario.Usuario;
import console.Comando;

public class ConsultarLivro implements Comando {
	@Override
	public void executar(Usuario usuario, Livro livro) {}
	@Override
	public void consultarUsuario(Usuario usuario) {}
	@Override
	public void consultarLivro(Livro livro) { //Para solicitar tal consulta, o usuário deverá digitar o comando “liv”, seguido do código do livro.
		//(i) título
		System.out.println("título" + livro.getNome());
		//(ii) quantidade de reservas para aquele livro, 
		int quantidadeDeReservas = 0;
		System.out.println("quantidade de reservas: " + quantidadeDeReservas);
			//e, se diferente de zero
			if (quantidadeDeReservas == 0) {
				//devem ser também apresentados o nome dos usuários que realizaram cada reserva
				
			}
		//(iii) para cada exemplar, deve ser apresentado seu código, seu status (disponível ou emprestado)
			boolean emprestado = true;
			System.out.println("Status: " + emprestado);
			//e em caso do exemplar estar emprestado deverá ser exibido
			if (emprestado == true) {
				//o nome do usuário que realizou o empréstimo
				//a data de empréstimo e a data prevista para devolução. 
			}
	}
	@Override
	public void consultarNotificacoes(Usuario usuario) {
	}
}
