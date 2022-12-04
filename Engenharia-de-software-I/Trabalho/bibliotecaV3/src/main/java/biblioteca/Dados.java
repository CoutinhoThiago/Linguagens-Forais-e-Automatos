package biblioteca;



import java.util.ArrayList;
import java.util.List;

import biblioteca.livro.Exemplar;
import biblioteca.livro.Livro;
import biblioteca.usuario.AlunoDeGraduacao;
import biblioteca.usuario.AlunoDePosGraduacao;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.Professor;


public class Dados {
	List<IUsuario> usuarios = new ArrayList<IUsuario>();
	List<Livro> livros = new ArrayList<Livro>();
	
	public Dados() {
		IUsuario usuario1 = new AlunoDeGraduacao(123, "João da Silva");
			this.usuarios.add(usuario1);
		IUsuario usuario2 = new AlunoDePosGraduacao(456, "Luiz Fernando Rodrigues");
			this.usuarios.add(usuario2);
		IUsuario usuario3 = new AlunoDeGraduacao(789, "Pedro Paulo");
			this.usuarios.add(usuario3);
		IUsuario usuario4 = new Professor(100, "Carlos Lucena");
			this.usuarios.add(usuario4);
		
		Livro l100 = new Livro(100, "Engenharia de Software", "Addison Wesley", "Ian Sommervile", "6ª", 2000);
			l100.addExemplar(new Exemplar());
			l100.addExemplar(new Exemplar());
				this.livros.add(l100);	
		Livro l101 = new Livro(101, "UML – Guia doUsuário","Campus","Grady Booch, James Rumbaugh, Ivar Jacobson","7ª",2000);
			l101.addExemplar(new Exemplar());
				this.livros.add(l101);
		Livro l200 = new Livro(200, "Code Complete","Microsoft Press","Steve McConnell","2ª",2014);
			l200.addExemplar(new Exemplar());
				this.livros.add(l200);
		Livro l201 = new Livro(201, "Agile Software Development, Principles, Patterns, and Practices","Prentice Hall","Robert Martin","1ª",2002);
			l201.addExemplar(new Exemplar());
				this.livros.add(l201);
		Livro l300 = new Livro(300, "Refactoring:Improving the Designof Existing Code","Addison Wesley Professional","Martin Fowler","1ª",1999);
			l300.addExemplar(new Exemplar());
			l300.addExemplar(new Exemplar());
				this.livros.add(l300);	
		Livro l301 = new Livro(301, "Software Metrics: A Rigorous and Practical Approach","CRC Press","Norman Fenton, James Bieman","3ª",2014);
				this.livros.add(l301);						
		Livro l400 = new Livro(400, "Design Patterns:Elements of Reusable Object-Oriented Software","Addison Wesley Professional","Erich Gamma, Richard Helm, RalphJohnson, JohnVlissides","1ª",1994);
			l400.addExemplar(new Exemplar());
			l400.addExemplar(new Exemplar());
				this.livros.add(l400);		
		Livro l401 = new Livro(401, "UML Distilled: A Brief Guide to theStandard Object Modeling Language","Addison Wesley Professional","Martin Fowler","3ª",2003);
				this.livros.add(l401);
	}
	
	public List<Livro> getListaDeLivros() {
		return livros;
	}
	public List<IUsuario> getListaDeUsuarios() {
		return usuarios;
	}

	static void mostrarUsuarios(List<Professor> usuarios) {
		for (Professor usuario: usuarios){
		String tipo = "Aluno de Graduação";
		if (usuario.isProfessor()) {tipo = "Professor";}
		else if (usuario.isAlunoDePosGraduacao()) {tipo = "Aluno de Pos Graduação";}
		System.out.println(
				"Novo alundo cadastrado" + "\n" +
				"Id: " + usuario.getCodigo() + "\n" +
				"Tipo: " + tipo + "\n" +
				"Nome: " + usuario.getNome() + "\n");
		}
	}
	static void mostrarLivros(List<Livro> livros) {
		for (Livro livro: livros) {
			System.out.println("Novo item cadastrado");
			System.out.println("Id: " + livro.getCodigo());
			System.out.println("Titulo: " + livro.getNome());
			System.out.println("Autor: " + livro.getAutor());
			for(int i = 0; i < livros.size(); i++){
				Exemplar exemplar = livro.getExemplares().get(i);
				System.out.println("Exemplares: ");
				System.out.println("Exemplar: " + exemplar.getCodigoDoExemplar() + exemplar);
			}
	    }
	}
}
