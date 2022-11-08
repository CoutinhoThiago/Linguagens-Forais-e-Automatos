package br.ufba.idp.interfaces;

public interface ITarefa {

	void realizarTrabalho(double horas);

	void completarTarefa();

	String getNome();

	void setNome(String nome);

	IFuncionario getResponsavel();

	void setResponsavel(IFuncionario responsavel);

	double getHorasTrabalhadas();

	boolean isCompleta();

}