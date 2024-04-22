package Descontinuado;

import br.ufba.idp.interfaces.IFuncionario;

public interface IEmail {
	void enviarEmail(IFuncionario responsavel, String string);
}