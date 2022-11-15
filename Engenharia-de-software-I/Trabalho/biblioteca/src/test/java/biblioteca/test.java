package biblioteca;

import java.util.ArrayList;
import java.util.List;

import biblioteca.item.Livro;
import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IInscricao;
import biblioteca.usuario.tipo.AlunoDeGraduacao;
import biblioteca.usuario.tipo.AlunoDePosGraduacao;
import biblioteca.usuario.tipo.Professor;



public class test {

	public static void main(String[] args) {
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(new Livro("Senhor dos Aneis", "Token", 5));
		livros.add(new Livro("Game of Thones", "aaaaaaaaa", 3));
		
		for (Livro livro: livros) {
			System.out.println(
					"Novo item cadastrado" + "\n" +
					"Id: " + livro.getId() + "\n" +
					"Titulo: " + livro.getNome() + "\n" +
					"Autor: " + livro.getAutor() + "\n");
	    }
		
		System.out.println("//----------//----------//----------//----------//" + "\n"); // 
		
		List<IInscricao> inscricoes = new ArrayList<IInscricao>();
		inscricoes.add(new AlunoDeGraduacao("Thiago", "Coutinho"));
		inscricoes.add(new AlunoDeGraduacao("Keven", "Viana"));
		inscricoes.add(new AlunoDePosGraduacao("Maria", "Souza"));
		inscricoes.add(new Professor("Ana", "Lopes"));

	    List<Usuario> usuarios = new ArrayList<Usuario>();
	    for (IInscricao inscricao: inscricoes) {
	    	usuarios.add(inscricao.obterCriadorContas().criar(inscricao));
	    }
		
		for (Usuario usuario: usuarios){
			String tipo = "Aluno de Graduação";
			if (usuario.isProfessor()) {tipo = "Professor";}
			else if (usuario.isAlunoDePosGraduacao()) {tipo = "Aluno de Pos Graduação";}
			System.out.println(
					"Novo alundo cadastrado" + "\n" +
					"Id: " + usuario.getId() + "\n" +
					"Tipo: " + tipo + "\n" +
					"Nome: " + usuario.getNome() + " " + usuario.getSobrenome() + "\n");
		}
	}
}
