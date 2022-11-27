package biblioteca.usuario.interfaces;

public interface IInscricao {
	public String getNome();
	public int getCodigo();
	
	public ICriadorContas obterCriadorContas();
}
