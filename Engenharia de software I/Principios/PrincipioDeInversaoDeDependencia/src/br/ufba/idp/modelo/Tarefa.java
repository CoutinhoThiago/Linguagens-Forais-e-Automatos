package br.ufba.idp.modelo;

import br.ufba.idp.interfaces.IFuncionario;
import br.ufba.idp.interfaces.ILog;
import br.ufba.idp.interfaces.IMensagem;
import br.ufba.idp.interfaces.ITarefa;

public class Tarefa implements ITarefa {
	
	private String nome;
	private double horasTrabalhadas;
	private boolean completa = false;
	
	private IFuncionario responsavel;
	private ILog log;
	private IMensagem mensagem;
	
    public Tarefa(ILog log, IMensagem mensagem) {
    	this.mensagem = mensagem;
    	this.log = log;
    }
    
    @Override
	public void realizarTrabalho(double horas)
    {
        this.horasTrabalhadas += horas;
        //ILog log = Factory.criarLog();
        this.log.log("Trabalho realizado em " + this.nome + ".");
    }

    @Override
	public void completarTarefa()
    {
        completa = true;

        //ILog log = Factory.criarLog();
        this.log.log("Tarefa " + nome + " completa.");

        //IMensagem mecanismoMensagem = Factory.criarMensagem();
        this.mensagem.enviarMensagem(responsavel, "A tarefa " + nome + " foi finalizada.");
    }
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public IFuncionario getResponsavel() {
		return responsavel;
	}
	@Override
	public void setResponsavel(IFuncionario responsavel) {
		this.responsavel = responsavel;
	}
	@Override
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	@Override
	public boolean isCompleta() {
		return completa;
	}
	
	
}
