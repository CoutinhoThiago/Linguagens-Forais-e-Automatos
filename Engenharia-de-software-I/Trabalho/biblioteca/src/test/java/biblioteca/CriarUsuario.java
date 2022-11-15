package biblioteca;

import java.util.List;
import java.util.Scanner;

import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IInscricao;
import biblioteca.usuario.tipo.AlunoDeGraduacao;
import biblioteca.usuario.tipo.AlunoDePosGraduacao;
import biblioteca.usuario.tipo.Professor;

public class CriarUsuario {
	public static void criarUsuario(List<Usuario> usuarios) {
		System.out.println("Bom dia, boa tarde ou boa noite" + "\n"); // 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Por favor digite seu nome"); // 
		String nome = ler.next(); // ler.nextLine(); //frase
		System.out.println("Por favor digite seu sobre nome"); //
		String sobreNome = ler.next();
		
		System.out.println("Selecione o tipo de usuario"); //
		System.out.println("1 para aluno de graduação"); //
		System.out.println("2 para aluno de pos graduação"); //
		System.out.println("3 para professor"); //
		int tipoDeUsuario = ler.nextInt();
		
		String tipo = null;
		IInscricao novoUsuario = null;
		if (tipoDeUsuario == 1) {
			novoUsuario = new AlunoDeGraduacao(nome, sobreNome);
			tipo = "Aluno de Graduação";
		}
		else if (tipoDeUsuario == 2) {
			novoUsuario = new AlunoDePosGraduacao(nome, sobreNome);		
			tipo = "Aluno de Pos Graduação";
		}
		else if (tipoDeUsuario == 3) {
			novoUsuario = new Professor(nome, sobreNome);
			tipo = "Professor";
		}
		Usuario novo = novoUsuario.obterCriadorContas().criar(novoUsuario);
		System.out.println(
				"Novo alundo cadastrado" + "\n" +
				"Id: " + novo.getId() + "\n" +
				"Tipo: " + tipo + "\n" +
				"Nome: " + novo.getNome() + " " + novo.getSobrenome() + "\n");
		usuarios.add(novo);
	}
}
