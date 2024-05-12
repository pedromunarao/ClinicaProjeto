package controller;

import java.util.ArrayList;

import domain.Paciente;
import modelo.dao.PacienteDao;
import view.PnlCadPaciente;

public class PacienteController {
	
	private Paciente paciente;
	
	public void salvar(PnlCadPaciente pnl) {
		paciente = new Paciente();
		
		paciente.setNome(pnl.getNome().getText());
		paciente.setCpf(pnl.getCpf().getText());
		paciente.setDataNasc(pnl.getDataNasc().getDate());
		paciente.setRg(pnl.getRg().getText());
		paciente.setSexo(pnl.getSexo().getSelectedItem().toString());
		paciente.setTelefone(Long.parseLong(pnl.getTelefone().getText()));
		
		PacienteDao pacienteDao = new PacienteDao();
		pacienteDao.salvar(paciente);
	}
	
	public ArrayList<Paciente> consultar(){
		
		PacienteDao pacienteDao = new PacienteDao();
		return pacienteDao.consulta();
	}
}
