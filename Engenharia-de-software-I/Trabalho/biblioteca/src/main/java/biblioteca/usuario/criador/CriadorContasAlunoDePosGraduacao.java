package biblioteca.usuario.criador;

import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IInscricao;
import biblioteca.usuario.interfaces.ICriadorContas;

public class CriadorContasAlunoDePosGraduacao implements ICriadorContas {
    
	public Usuario criar(IInscricao aluno)
    {
		Usuario usuario = new Usuario();
		
		usuario.setId();
        usuario.setNome(aluno.getNome());
        usuario.setSobrenome(aluno.getSobrenome());
        
        usuario.setTempoDeEmprestimo(4); // 4 dias 
        usuario.setQuantidadeDeItensReservados(2); // 4 livros
        
        usuario.setAlunoDePosGraduacao(true);
        
        return usuario;
    }
}
