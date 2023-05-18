package biblioteca.usuario;

public interface IUsuario {
	public String getNome();
	public int getCodigo();
	
	public int getTempoDeImprestimo();
	public void setTempoDeImprestimo();
	public int getQuantidadeDeItensReservados();
	public void setQuantidadeDeItensReservados();
	
	public ICriadorContas obterCriadorContas();
}
