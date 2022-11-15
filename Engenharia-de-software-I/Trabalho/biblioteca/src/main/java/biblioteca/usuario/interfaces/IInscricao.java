package biblioteca.usuario.interfaces;

public interface IInscricao {
	public String getNome();
	public String getSobrenome();
	
	public ICriadorContas obterCriadorContas();
}
