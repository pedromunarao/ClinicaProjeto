package controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import domain.Paciente;
import modelo.dao.PacienteDao;
import view.FrmCadPaciente;
import view.PnlCadPaciente;

public class PacienteController {
	
	private Paciente paciente;
	private PacienteDao pacienteDao;

	
	public void salvar(PnlCadPaciente pnl) {
		pacienteDao = new PacienteDao();
		paciente = new Paciente();
		String telefoneValue = pnl.getTelefone().getText();
		String telefoneLimpo = telefoneValue.replaceAll("[^\\d]", "");
		
		
		paciente.setNome(pnl.getNome().getText());
		paciente.setCpf(pnl.getCpf().getText());
		if (dataValida(pnl.getDataNasc().getDate(), pnl)) {
			paciente.setDataNasc(pnl.getDataNasc().getDate());
		}else {
			return;
		}
		
		paciente.setRg(pnl.getRg().getText());
		paciente.setSexo(pnl.getSexo().getSelectedItem().toString());
		paciente.setTelefone(Long.parseLong(telefoneLimpo));
		paciente.setLogradouro(pnl.getLogradouro().getText());
		paciente.setBairro(pnl.getBairro().getText());
		paciente.setComplemento(pnl.getComplemento().getText());
		paciente.setNumero(pnl.getNumero().getText());
		paciente.setCep(pnl.getCep().getText());
		pacienteDao.salvar(paciente);
		
		JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(pnl);
        if (frame instanceof FrmCadPaciente) {
            ((FrmCadPaciente) frame).closeAndOpenSuccess();
        }
	}
	
	public ArrayList<Paciente> consultar(){
		pacienteDao = new PacienteDao();
		return pacienteDao.consulta();
	}
	
	public Paciente buscaPaciente(String cpf){
		pacienteDao = new PacienteDao();
		return pacienteDao.buscaPaciente(cpf);
		
	}
	
	public void atualizaPaciente(PnlCadPaciente pnl) {
		pacienteDao = new PacienteDao();
		paciente = new Paciente();
		String telefoneValue = pnl.getTelefone().getText();
		String telefoneLimpo = telefoneValue.replaceAll("[^\\d]", "");
		
		paciente.setId(Integer.parseInt(pnl.getCodigo().getText()));
		paciente.setNome(pnl.getNome().getText());
		paciente.setCpf(pnl.getCpf().getText());
		if (dataValida(pnl.getDataNasc().getDate(), pnl)) {
			paciente.setDataNasc(pnl.getDataNasc().getDate());
		}else {
			return;
		}
		paciente.setRg(pnl.getRg().getText());
		paciente.setSexo(pnl.getSexo().getSelectedItem().toString());
		paciente.setTelefone(Long.parseLong(telefoneLimpo));
		paciente.setLogradouro(pnl.getLogradouro().getText());
		paciente.setBairro(pnl.getBairro().getText());
		paciente.setComplemento(pnl.getComplemento().getText());
		paciente.setNumero(pnl.getNumero().getText());
		paciente.setCep(pnl.getCep().getText());
		
		
		pacienteDao.atualizaPaciente(paciente);
		
		JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(pnl);
        if (frame instanceof FrmCadPaciente) {
            ((FrmCadPaciente) frame).closeAndOpenSuccess();
        }
	}

	public void excluirPaciente(PnlCadPaciente pnl) {
		pacienteDao = new PacienteDao();
		int resposta = JOptionPane.showConfirmDialog(pnl, "Confirma a Exclusão do Paciente?");
		if (resposta == JOptionPane.YES_OPTION) {
			
			pacienteDao.excluirPaciente(Integer.parseInt(pnl.getCodigo().getText()));
			JOptionPane.showMessageDialog(pnl, "Paciente excluido com sucesso!");			
		}
		
		
	}
	
	public boolean dataValida(Date data, PnlCadPaciente pnl) {
		Date hoje = Date.from(LocalDate.now().minusYears(150).atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		if (data.before(hoje)) {
			JOptionPane.showMessageDialog(pnl, "Data de nascimento inválida!");
			pnl.getDataNasc().requestFocus();
			return false;
		}
		
		return true;
	}
	
}
