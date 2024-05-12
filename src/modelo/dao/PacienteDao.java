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

public class PacienteDao {
	
	public void salvar(Paciente paciente) {
		Conexao conexao = new Conexao();
		String sql = "INSERT INTO " +
					"pacientes (nome, cpf, dataNasc, rg, sexo, telefone) " +
					"VALUES (?,?,?,?,?,?)";
		
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
}
