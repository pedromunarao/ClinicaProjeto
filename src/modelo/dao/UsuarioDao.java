package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.Medico;
import domain.Usuario;
import enums.UsuarioEnum;

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
	
	public ArrayList<Usuario> Consultar(){
		Conexao cnx = new Conexao();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			PreparedStatement stmt = cnx.getConn().prepareStatement("select * from usuarios");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				if (rs.getString("tipo") == "ATENDENTE") {
					usuario.setTipo(UsuarioEnum.ATENDENTE);
					usuarios.add(usuario);
				}else if(rs.getString("tipo") == "MEDICO") {
					Medico medico = (Medico) usuario;
					medico.setTipo(UsuarioEnum.MEDICO);
					medico.setCrm(rs.getString("crm"));
					medico.setEspecializacao(rs.getString("especializacao"));
					usuarios.add(medico);
				}else if (rs.getString("tipo") == "ADMINISTRADOR") {
					usuario.setTipo(UsuarioEnum.ADMIN);
					usuarios.add(usuario);
				}	
			}
			rs.close();
			stmt.close();
			return usuarios;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public Usuario buscaUsuario(String email){
		Conexao cnx = new Conexao();
		PreparedStatement stmt;
		
		try {
			stmt = cnx.getConn().prepareStatement("select * from usuarios where email = (?)");
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			Usuario usuario = new Usuario();
			usuario.setId(rs.getInt("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setUsuario(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
			if (rs.getString("tipo") == "ATENDENTE") {
				usuario.setTipo(UsuarioEnum.ATENDENTE);
				
			}else if(rs.getString("tipo") == "MEDICO") {
				Medico medico = (Medico) usuario;
				medico.setTipo(UsuarioEnum.MEDICO);
				medico.setCrm(rs.getString("crm"));
				medico.setEspecializacao(rs.getString("especializacao"));
				rs.close();
				stmt.close();
				return medico;
				
			}else if (rs.getString("tipo") == "ADMINISTRADOR") {
				usuario.setTipo(UsuarioEnum.ADMIN);
				
			}
			
			rs.close();
			stmt.close();
			return usuario;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		 
	}
	
	public void atualizaUsuario(Usuario usuario) {
		Conexao cnx = new Conexao();
		PreparedStatement stmt;
		
		try {
			stmt = cnx.getConn().prepareStatement("update usuarios set nome = (?), usuario = (?), senha = (?), tipo = (?), "
					+ "crm = (?), especializacao = (?) where id = (?)");
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
			stmt.setInt(6, (Integer) usuario.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluirUsuario(Integer id) {
		Conexao cnx = new Conexao();
		PreparedStatement stmt;
		
		try {
			stmt = cnx.getConn().prepareStatement("delete from usuarios where id = (?)");
			stmt.setInt(0, id);
			
			stmt.execute();
			stmt.close();	
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
