package biblioteca;


import java.util.ArrayList;
import java.util.List;

import biblioteca.Livro;
import biblioteca.usuario.IUsuario;
import biblioteca.usuario.tipo.AlunoDeGraduacao;
import biblioteca.usuario.tipo.AlunoDePosGraduacao;
import biblioteca.usuario.tipo.Professor;


public class Dados {
	List<Livro> livros = new ArrayList<Livro>();
	List<IUsuario> usuarios = new ArrayList<IUsuario>();
	
	public Dados() {
		IUsuario usuario1 = new AlunoDeGraduacao(123, "João da Silva");
		usuarios.add(usuario1);
		IUsuario usuario2 = new AlunoDePosGraduacao(456, "Luiz Fernando Rodrigues");
		usuarios.add(usuario2);
		IUsuario usuario3 = new AlunoDeGraduacao(789, "Pedro Paulo");
		usuarios.add(usuario3);
		IUsuario usuario4 = new Professor(100, "Carlos Lucena");
		usuarios.add(usuario4);
		
		Livro l10001 = new Livro(100, "Engenharia de Software", "Addison Wesley", "Ian Sommervile", "6ª", 2000, 1);
		livros.add(l10001);
		Livro l10002 = new Livro(100, "Engenharia de Software", "Addison Wesley", "Ian Sommervile", "6ª", 2000, 2);
					livros.add(l10002);
					
		Livro l10103 = new Livro(101, "UML – Guia doUsuário","Campus","Grady Booch, James Rumbaugh, Ivar Jacobson","7ª",2000, 3);
				livros.add(l10103);
				
		Livro l200 = new Livro(200, "Code Complete","Microsoft Press","Steve McConnell","2ª",2014, 4);
				livros.add(l200);
				
		Livro l20105 = new Livro(201, "Agile Software Development, Principles, Patterns, and Practices","Prentice Hall","Robert Martin","1ª",2002, 5);
				livros.add(l20105);
				
		Livro l30006 = new Livro(300, "Refactoring:Improving the Designof Existing Code","Addison Wesley Professional","Martin Fowler","1ª",1999, 6);
				livros.add(l30006);
		Livro l30007 = new Livro(300, "Refactoring:Improving the Designof Existing Code","Addison Wesley Professional","Martin Fowler","1ª",1999, 7);
				livros.add(l30007);
					
		//Livro l30100 = new Livro(301, "Software Metrics: A Rigorous and Practical Approach","CRC Press","Norman Fenton, James Bieman","3ª",2014, 0);
		//		livros.add(l30100);				
				
		Livro l40008 = new Livro(400, "Design Patterns:Elements of Reusable Object-Oriented Software","Addison Wesley Professional","Erich Gamma, Richard Helm, RalphJohnson, JohnVlissides","1ª",1994, 8);
				livros.add(l40008);
		Livro l40009 = new Livro(400, "Design Patterns:Elements of Reusable Object-Oriented Software","Addison Wesley Professional","Erich Gamma, Richard Helm, RalphJohnson, JohnVlissides","1ª",1994, 9);
				livros.add(l40009);
				
		//Livro l40100 = new Livro(401, "UML Distilled: A Brief Guide to theStandard Object Modeling Language","Addison Wesley Professional","Martin Fowler","3ª",2003, 0);
		//		livros.add(l40100);
	}
	
	
	public List<Livro> getListaDeLivros() {
		return livros;
	}
	public List<IUsuario> getListaDeUsuarios() {
		return usuarios;
	}

	static void mostrarUsuarios(List<IUsuario> usuarios) {
		for (IUsuario usuario: usuarios){
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
			System.out.println(
					"Novo item cadastrado" + "\n" +
					"Id: " + livro.getCodigo() + "\n" +
					"Titulo: " + livro.getNome() + "\n" +
					"Autor: " + livro.getAutor() + "\n" +
					"Exemplares: " + livro.getExemplar() + "\n");
	    }
	}
}
