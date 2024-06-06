package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.toedter.calendar.JCalendar;

import domain.Paciente;
import view.PnlCadPaciente;
import view.PnlConPaciente;

public class PacienteDao {
	
	public void salvar(Paciente paciente) {
		Conexao conexao = new Conexao();
		String sql = "INSERT INTO " +
					"pacientes (nome, cpf, dataNasc, rg, sexo, telefone, logradouro, bairro, numero, complemento, cep) " +
					"VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			stmt.setString(1, paciente.getNome());
			stmt.setString(2, paciente.getCpf());
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        String dataNascimentoFormatted = dateFormat.format(paciente.getDataNasc());
	        Date dataNascimento = Date.valueOf(dataNascimentoFormatted);
	        
	        stmt.setDate(3, dataNascimento);
			stmt.setString(4, paciente.getRg());
			stmt.setString(5, paciente.getSexo());
			stmt.setLong(6, paciente.getTelefone());
			stmt.setString(7, paciente.getLogradouro());
			stmt.setString(8, paciente.getBairro());
			stmt.setString(9, paciente.getNumero());
			stmt.setString(10, paciente.getComplemento());
			stmt.setString(11, paciente.getCep());
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Paciente> consulta(){
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
		ArrayList<Paciente> pacientes;
		
		try {
			stmt = conexao.getConn().prepareStatement("select * from pacientes");
			
			ResultSet rs = stmt.executeQuery();
			pacientes = new ArrayList<Paciente>();
			while(rs.next()) {
				Paciente paciente = new Paciente();
				paciente.setNome(rs.getString("nome"));
				paciente.setCpf(rs.getString("cpf"));
				paciente.setDataNasc(rs.getDate("datanasc"));
				paciente.setRg(rs.getString("rg"));
				paciente.setSexo(rs.getString("sexo"));
				paciente.setTelefone(rs.getLong("telefone"));
				paciente.setLogradouro(rs.getString("logradouro"));
				paciente.setBairro(rs.getString("bairro"));
				paciente.setNumero(rs.getString("numero"));
				paciente.setComplemento(rs.getString("complemento"));
				paciente.setCep(rs.getString("cep"));
				
				pacientes.add(paciente);
			}
			
			rs.close();
			stmt.close();
			return pacientes;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Paciente buscaPaciente(String cpf){
		Conexao cnx = new Conexao();
		PreparedStatement stmt;
		
		try {
			stmt = cnx.getConn().prepareStatement("select * from pacientes where cpf = (?)");
			stmt.setString(1, cpf);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) { // Verifica se há uma linha no resultado
	            Paciente paciente = new Paciente();
	            paciente.setId(rs.getInt("id"));
	            paciente.setNome(rs.getString("nome"));
	            paciente.setCpf(rs.getString("cpf"));
	            paciente.setDataNasc(rs.getDate("datanasc"));
	            paciente.setRg(rs.getString("rg"));
	            paciente.setSexo(rs.getString("sexo"));
	            paciente.setTelefone(rs.getLong("telefone"));
	            paciente.setLogradouro(rs.getString("logradouro"));
	            paciente.setBairro(rs.getString("bairro"));
	            paciente.setNumero(rs.getString("numero"));
	            paciente.setComplemento(rs.getString("complemento"));
	            paciente.setCep(rs.getString("cep"));
	            
	            rs.close();
	            stmt.close();
	            return paciente;
	        } else {
	            // Se não houver linha, o paciente não foi encontrado
	            return null;
	        }			
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}
	
	public void atualizaPaciente(Paciente paciente) {
		Conexao cnx = new Conexao();
		PreparedStatement stmt;
		
		try {
			stmt = cnx.getConn().prepareStatement("update pacientes set nome = (?), cpf = (?), dataNasc = (?), rg = (?), sexo = (?), telefone = (?), "
					+ "logradouro = (?), bairro = (?), numero = (?), complemento = (?), cep = (?) where id = (?)");
			
			stmt.setString(1, paciente.getNome());
			stmt.setString(2, paciente.getCpf());
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        String dataNascimentoFormatted = dateFormat.format(paciente.getDataNasc());
	        Date dataNascimento = Date.valueOf(dataNascimentoFormatted);
	        
	        stmt.setDate(3, dataNascimento);
			stmt.setString(4, paciente.getRg());
			stmt.setString(5, paciente.getSexo());
			stmt.setLong(6, paciente.getTelefone());
			stmt.setString(7, paciente.getLogradouro());
			stmt.setString(8, paciente.getBairro());
			stmt.setString(9, paciente.getNumero());
			stmt.setString(10, paciente.getComplemento());
			stmt.setString(11, paciente.getCep());
			
			stmt.setInt(12, (Integer) paciente.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		
	}

	public void excluirPaciente(int id) {
		Conexao cnx = new Conexao();
		PreparedStatement stmt;
		try {
			
			stmt = cnx.getConn().prepareStatement("delete from pacientes where id = (?)");
			stmt.setInt(1, id);
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
