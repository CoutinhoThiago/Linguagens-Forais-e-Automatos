package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IInscricao;
import biblioteca.usuario.tipo.AlunoDeGraduacao;
import biblioteca.usuario.tipo.AlunoDePosGraduacao;
import biblioteca.usuario.tipo.Professor;

public class test {

	public static void main(String[] args) {
		List<Livro> livros = new ArrayList<Livro>();
		inicializarLivros(livros);
		
		List<IInscricao> inscricoes = new ArrayList<IInscricao>();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		inicializarUsuarios(inscricoes, usuarios);
	
		//CriarUsuario.criarUsuario(usuarios);
		
		selecionarUsuario(usuarios);
	}

	private static Usuario selecionarUsuario(List<Usuario> usuarios) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Deseja mostrar a lista de usuarios ? (s/n)");
		if (ler.next() != "n") {
			for (Usuario usuario: usuarios){System.out.println(usuario.getNome() + " " + usuario.getSobrenome() + " " + usuario.getId() + "\n");}
		}
		
		
		System.out.println("Digite o id do usuario que irá realizar a ação");
		int id = ler.nextInt(); // ler.nextLine(); //frase
		
		for (Usuario usuario: usuarios) {
			if (usuario.getId() == id) {
				String tipo = "Aluno de Graduação";
				if (usuario.isProfessor()) {tipo = "Professor";}
				else if (usuario.isAlunoDePosGraduacao()) {tipo = "Aluno de Pos Graduação";}
				System.out.println(
						"\n" +
						"Id: " + usuario.getId() + "\n" +
						"Tipo: " + tipo + "\n" +
						"Nome: " + usuario.getNome() + " " + usuario.getSobrenome() + "\n");
				return usuario; 
			}
		}
		System.out.println("Usuario não encontrado");
		return null;
	}

	private static void inicializarUsuarios(List<IInscricao> inscricoes, List<Usuario> usuarios) {
		inscricoes.add(new AlunoDeGraduacao("Thiago", "Coutinho"));
		inscricoes.add(new AlunoDeGraduacao("Keven", "Viana"));
		inscricoes.add(new AlunoDePosGraduacao("Maria", "Souza"));
		inscricoes.add(new Professor("Ana", "Lopes"));
	    for (IInscricao inscricao: inscricoes) {usuarios.add(inscricao.obterCriadorContas().criar(inscricao));}
		
//		for (Usuario usuario: usuarios){
//			String tipo = "Aluno de Graduação";
//			if (usuario.isProfessor()) {tipo = "Professor";}
//			else if (usuario.isAlunoDePosGraduacao()) {tipo = "Aluno de Pos Graduação";}
//			System.out.println(
//					"Novo alundo cadastrado" + "\n" +
//					"Id: " + usuario.getId() + "\n" +
//					"Tipo: " + tipo + "\n" +
//					"Nome: " + usuario.getNome() + " " + usuario.getSobrenome() + "\n");
//		}
	}

	private static void inicializarLivros(List<Livro> livros) {
		livros.add(new Livro("Senhor dos Aneis", "Token", 5));
		livros.add(new Livro("Game of Thones", "aaaaaaaaa", 3));
		
//		for (Livro livro: livros) {
//			System.out.println(
//					"Novo item cadastrado" + "\n" +
//					"Id: " + livro.getId() + "\n" +
//					"Titulo: " + livro.getNome() + "\n" +
//					"Autor: " + livro.getAutor() + "\n" +
//					"Exemplares: " + livro.getExemplares() + "\n");
//	    }
	}
}
