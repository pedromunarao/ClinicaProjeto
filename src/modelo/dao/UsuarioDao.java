package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import domain.Medico;
import domain.Usuario;

public class UsuarioDao {
	
	public void Salvar(Usuario usuario) {
		Conexao cnx = new Conexao();
		try {
			PreparedStatement stmt = cnx.getConn().prepareStatement("INSERT INTO usuarios(nome, email, senha, tipo, crm, especializacao)"
					+ " VALUES (?, ?, ?, ?, ?, ?)");
			stmt.setString(0, usuario.getNome());
			stmt.setString(1, usuario.getUsuario());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getTipo().descricao);
			
			if (usuario instanceof Medico) {
				Medico medico = (Medico) usuario;
				stmt.setString(4, medico.getCrm());
				stmt.setString(5, medico.getEspecializacao());
			}else {
				stmt.setString(4, "");
				stmt.setString(5, "");
			}
			
			stmt.execute();
			stmt.close();
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
