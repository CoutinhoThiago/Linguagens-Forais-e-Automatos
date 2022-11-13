package biblioteca.usuario;

public class Usuario {
	private String nome;
	private String sobrenome;
	private String email;
	
	private boolean alunoDePosGraduacao;
	private boolean professor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAlunoDePosGraduacao() {
		return alunoDePosGraduacao;
	}
	public void setAlunoDePosGraduacao(boolean alunoDePosGraduacao) {
		this.alunoDePosGraduacao = alunoDePosGraduacao;
	}

	public boolean isProfessor() {
		return professor;
	}
	public void setProfessor(boolean professor) {
		this.professor = professor;
	}
}
