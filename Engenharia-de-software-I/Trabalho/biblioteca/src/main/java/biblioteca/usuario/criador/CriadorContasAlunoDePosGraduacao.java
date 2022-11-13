package biblioteca.usuario.criador;

import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IUsuario;
import biblioteca.usuario.interfaces.ICriadorContas;

public class CriadorContasAlunoDePosGraduacao implements ICriadorContas {
    
	public Usuario criar(IUsuario aluno)
    {
        Usuario usuario = new Usuario();

        usuario.setNome(aluno.getNome());
        usuario.setSobrenome(aluno.getSobrenome());
        usuario.setEmail(aluno.getNome().substring(0, 1) + aluno.getSobrenome() + "@xpto.com");
        
        usuario.setAlunoDePosGraduacao(true);
        
        return usuario;
    }
}
