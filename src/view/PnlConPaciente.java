package view;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controller.PacienteController;

import domain.Paciente;

public class PnlConPaciente extends JPanel {
	
	private JTable table;

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PnlConPaciente() {
		setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(0, 12, 657, 435);
		add(scrollPane1);
		
		atualizaTabela();
		
		scrollPane1.setViewportView(table);
		

	}
	
	public void atualizaTabela() {
		String colunas[] = {"Nome", "CPF", "Data de Nascimento", "RG", "Sexo", "Telefone"};
		DefaultTableModel model = new DefaultTableModel(colunas, 0);
		table = new JTable(model);
		
		if (model.getRowCount() > 0) model.setRowCount(0);
		
		ArrayList<Paciente> pacientes = new PacienteController().consultar();
		
		for(Paciente paciente : pacientes) {
			String data = paciente.getDataNasc().toString();
			model.addRow(new String[] {paciente.getNome(), paciente.getCpf(), data, paciente.getRg(),
                    paciente.getSexo(), paciente.getTelefone().toString()});
			
			
		}
	}
	

}
