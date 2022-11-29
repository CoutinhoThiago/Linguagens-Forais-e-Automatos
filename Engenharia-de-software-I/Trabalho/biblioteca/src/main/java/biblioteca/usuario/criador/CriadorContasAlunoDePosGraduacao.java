package biblioteca.usuario.criador;

import biblioteca.usuario.ICriadorContas;
import biblioteca.usuario.Usuario;

public class CriadorContasAlunoDePosGraduacao implements ICriadorContas {
    
	public Usuario criar(Usuario aluno)
    {
		Usuario usuario = new Usuario();
		
		usuario.setCodigo(aluno.getCodigo());
        usuario.setNome(aluno.getNome());
        
        usuario.setTempoDeEmprestimo(4); // 4 dias 
        usuario.setQuantidadeDeItensReservados(2); // 4 livros
        
        usuario.setAlunoDePosGraduacao(true);
        
        return usuario;
    }
}
