package br.ufba.srp;

public class Mensagens {
	public static void mensagemDeInicio() {
		System.out.println("Seja bem-vinda ou bem-vindo.");
	}
		
	public static void menagemPrimeiroNome() {
		System.out.println("Qual p seu primeiro nome?");
	}
	
	public static void mensagemUltimoNome() {
		System.out.println("Qual o seu ultimo nome?");
	}
	
	public static void mensagemDePrimeiroNomeInvalido() {
		System.out.println("Voce nao forneceu um primeiro nome valido");
	}
	
	public static void mensagemDeUltimoNomeInvalido() {
		System.out.println("Voce nao forneceu um ultimo nome valido");
	}

	// Cria um id para o usuario
	public static void mensagemCriacaoDeUsuario(Pessoa usuario) {
		System.out.println("Seu id de usuurio e " + usuario.getPrimeiroNome().substring(0, 1) + usuario.getUltimoNome());
	}

	public static void mensagemDeFinalizacao() {
		System.out.println("pressione Enter para sair");
	}
}
