package biblioteca.usuario.criador;

import biblioteca.usuario.Usuario;
import biblioteca.usuario.interfaces.IInscricao;
import biblioteca.usuario.interfaces.ICriadorContas;

public class CriadorContasAlunoDeGraduacao implements ICriadorContas {
    
	public Usuario criar(IInscricao aluno)
    {
        Usuario usuario = new Usuario();

        usuario.setCodigo(aluno.getCodigo());
        usuario.setNome(aluno.getNome());
        
        usuario.setTempoDeEmprestimo(3); //3 dias
        usuario.setQuantidadeDeItensReservados(3); // 3 livros
         
        return usuario;
    }
}
