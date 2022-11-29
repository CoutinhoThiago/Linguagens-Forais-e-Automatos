package biblioteca.usuario.criador;

import biblioteca.usuario.ICriadorContas;
import biblioteca.usuario.Usuario;

public class CriadorContasAlunoDeGraduacao implements ICriadorContas {
    
	public Usuario criar(Usuario aluno)
    {
        Usuario usuario = new Usuario();

        usuario.setCodigo(aluno.getCodigo());
        usuario.setNome(aluno.getNome());
        
        usuario.setTempoDeEmprestimo(3); //3 dias
        usuario.setQuantidadeDeItensReservados(3); // 3 livros
         
        return usuario;
    }
}
