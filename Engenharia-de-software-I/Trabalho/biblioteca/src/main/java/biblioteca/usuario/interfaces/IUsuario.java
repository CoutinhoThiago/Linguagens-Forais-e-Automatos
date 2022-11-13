package biblioteca.usuario.interfaces;

public interface IUsuario {
	public String getNome();
	public String getSobrenome();
	
	public ICriadorContas obterCriadorContas();
}
