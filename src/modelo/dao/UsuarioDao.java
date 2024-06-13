package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.Medico;
import domain.Usuario;
import enums.UsuarioEnum;
import exceptions.UsuarioNaoEncontradoException;

public class UsuarioDao {
	
	public void Salvar(Usuario usuario) {
		Conexao cnx = new Conexao();
		try {
			PreparedStatement stmt = cnx.getConn().prepareStatement("INSERT INTO usuarios(nome, email, senha, tipo, crm, especializacao)"
					+ " VALUES (?, ?, ?, ?, ?, ?)");
			
			if (usuario instanceof Medico) {
				Medico medico = new Medico();
				medico = (Medico) usuario;
				stmt.setString(1, medico.getNome());
				stmt.setString(2, medico.getUsuario());
				stmt.setString(3, medico.getSenha());
				stmt.setString(4, medico.getTipo().descricao);
				stmt.setString(5, medico.getCrm());
				stmt.setString(6, medico.getEspecializacao());
			}else {
				stmt.setString(1, usuario.getNome());
				stmt.setString(2, usuario.getUsuario());
				stmt.setString(3, usuario.getSenha());
				stmt.setString(4, usuario.getTipo().descricao);
				stmt.setString(5, null);
				stmt.setString(6, null);
			}
			
			stmt.execute();
			stmt.close();
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<Usuario> consultar(){
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
				if (rs.getString("tipo").equals("Atendente")) {
					usuario.setTipo(UsuarioEnum.ATENDENTE);
					usuarios.add(usuario);
				}else if(rs.getString("tipo").equals("Médico")) {
					Medico medico = new Medico();
					medico.setNome(rs.getString("nome"));
					medico.setUsuario(rs.getString("email"));
					medico.setSenha(rs.getString("senha"));
					medico.setTipo(UsuarioEnum.MEDICO);
					medico.setCrm(rs.getString("crm"));
					medico.setEspecializacao(rs.getString("especializacao"));
					usuarios.add(medico);
				}else {
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
	
	public Usuario buscaUsuario(String email) throws UsuarioNaoEncontradoException{
		Conexao cnx = new Conexao();
		PreparedStatement stmt;
		
		try {
			stmt = cnx.getConn().prepareStatement("select * from usuarios where email = (?)");
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				if (rs.getString("tipo").equals("Atendente")) {
					usuario.setTipo(UsuarioEnum.ATENDENTE);
					
				}else if(rs.getString("tipo").equals("Médico")) {
					Medico medico = new Medico();
					medico.setId(rs.getInt("id"));
					medico.setNome(rs.getString("nome"));
					medico.setUsuario(rs.getString("email"));
					medico.setSenha(rs.getString("senha"));
					medico.setTipo(UsuarioEnum.MEDICO);
					medico.setCrm(rs.getString("crm"));
					medico.setEspecializacao(rs.getString("especializacao"));
					rs.close();
					stmt.close();
					return medico;
					
				}else if (rs.getString("tipo").equals("Administrador")) {
					usuario.setTipo(UsuarioEnum.ADMIN);
					
				}
				
				rs.close();
				stmt.close();
				return usuario;
			}else {
				throw new UsuarioNaoEncontradoException();
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		 
	}
	
	public void atualizaUsuario(Usuario usuario) {
		Conexao cnx = new Conexao();
		PreparedStatement stmt;
		
		try {
			stmt = cnx.getConn().prepareStatement("update usuarios set nome = (?), email = (?), senha = (?), tipo = (?), "
					+ "crm = (?), especializacao = (?) where id = (?)");
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getUsuario());
			stmt.setString(3, usuario.getSenha());
			stmt.setString(4, usuario.getTipo().descricao);
			
			if (usuario instanceof Medico) {
				Medico medico = (Medico) usuario;
				stmt.setString(5, medico.getCrm());
				stmt.setString(6, medico.getEspecializacao());
			}else {
				stmt.setString(5, "");
				stmt.setString(6, "");
			}
			stmt.setInt(7, (Integer) usuario.getId());
			
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
			stmt.setInt(1, id);
			
			stmt.execute();
			stmt.close();	
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
