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
		scrollPane1.setBounds(76, 37, 303, 171);
		add(scrollPane1);
		
		String colunas[] = {"Nome", "CPF", "Data de Nascimento", "RG", "Sexo", "Telefone"};
		
		DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
		
		ArrayList<Paciente> pacientes = new PacienteController.consultar();
		table = new JTable(5, pacientes.size());
		
		for (int i=0; i < pacientes.size(); i++) {
			String data = pacientes.get(i).getDataNasc().toString();
			
			modelo.addRow(new String[]{pacientes.get(i).getNome(), pacientes.get(i).getCpf(), data, pacientes.get(i).getRg(),
					pacientes.get(i).getSexo(), pacientes.get(i).getTelefone().toString()});
		}
		
		table.setModel(modelo);
		
		scrollPane1.setViewportView(table);
		

	}

}
