package biblioteca.usuario.criador;

import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IUsuario;
import biblioteca.usuario.interfaces.Fncionalidades;
import biblioteca.usuario.interfaces.ICriadorContas;

public class CriadorContasAlunoDePosGraduacao implements ICriadorContas {
    
	public Fncionalidades criar(IUsuario aluno)
    {
        Usuario usuario = new Usuario();

        usuario.setNome(aluno.getNome());
        usuario.setSobrenome(aluno.getSobrenome());
        
        usuario.setTempoDeImprestimo(3);
        usuario.setQuantidadeDeItensReservados(2);
        
        usuario.setAlunoDePosGraduacao(true);
        
        return usuario;
    }
}
