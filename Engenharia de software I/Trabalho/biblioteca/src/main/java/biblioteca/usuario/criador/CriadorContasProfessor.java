package biblioteca.usuario.criador;

import biblioteca.usuario.ICriadorContas;
import biblioteca.usuario.Usuario;

public class CriadorContasProfessor implements ICriadorContas {
    
	public Usuario criar(Usuario aluno)
    {
        Usuario usuario = new Usuario();

        usuario.setCodigo(aluno.getCodigo());
        usuario.setNome(aluno.getNome());
        
        usuario.setTempoDeEmprestimo(7); // 7 dias
        usuario.setQuantidadeDeItensReservados(999); // sem limite
        
        usuario.setProfessor(true);
        
        return usuario;
    }
}
