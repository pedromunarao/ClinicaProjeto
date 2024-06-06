package view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import controller.PacienteController;

import domain.Paciente;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PnlConPaciente extends JPanel {
	
	private JTable table;
	private PnlCadPaciente pnlCadPaciente;

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PnlConPaciente(PnlCadPaciente pnlCadPaciente) {
		this.pnlCadPaciente = pnlCadPaciente;
		setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(0, 0, 794, 588);
		add(scrollPane1);
		
		atualizaTabela();
		
		scrollPane1.setViewportView(table);
		

	}
	
	public void atualizaTabela() {
		String colunas[] = {"Nome", "CPF", "Data de Nascimento", "RG", "Sexo", "Telefone", "Logradouro", "Bairro", "Número", "Complemento", "CEP"};
		DefaultTableModel model = new DefaultTableModel(colunas, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					try {
						
						
						
						Paciente pacienteConsulta = new PacienteController().buscaPaciente((table.getValueAt(table.getSelectedRow(), 1)).toString());
						pnlCadPaciente.getCodigo().setText(pacienteConsulta.getId().toString());
						pnlCadPaciente.getNome().setText(pacienteConsulta.getNome());
						pnlCadPaciente.getCpf().setText(pacienteConsulta.getCpf());
						pnlCadPaciente.getDataNasc().setDate(pacienteConsulta.getDataNasc());
						pnlCadPaciente.getRg().setText(pacienteConsulta.getRg());
						for(int i =0; i < pnlCadPaciente.getSexo().getItemCount(); i++) {
							if (pnlCadPaciente.getSexo().getItemAt(i).equals(pacienteConsulta.getSexo())) {
								pnlCadPaciente.getSexo().setSelectedIndex(i);
								break;
							}
						}
						pnlCadPaciente.getTelefone().setText(pacienteConsulta.getTelefone().toString());
						pnlCadPaciente.getLogradouro().setText(pacienteConsulta.getLogradouro());
						pnlCadPaciente.getBairro().setText(pacienteConsulta.getBairro());
						pnlCadPaciente.getNumero().setText(pacienteConsulta.getNumero());
						pnlCadPaciente.getComplemento().setText(pacienteConsulta.getComplemento());
						pnlCadPaciente.getCep().setText(pacienteConsulta.getCep());
						
						Component parent = SwingUtilities.getWindowAncestor(pnlCadPaciente);
						if (parent instanceof JFrame) {
						    JFrame frame = (JFrame) parent;
						    
						    if (frame instanceof FrmCadPaciente) {
						        FrmCadPaciente frmCadPaciente = (FrmCadPaciente) frame;
						        JTabbedPane tabbedPane = frmCadPaciente.getTabbedPane(); 
						        if (tabbedPane != null) {
						            tabbedPane.setSelectedIndex(0);
						            pnlCadPaciente.editando = true;
						        }
						    }
						}
						
						pnlCadPaciente.mudaBotão();


			            
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					
					
//					JOptionPane.showMessageDialog(PnlConPaciente.this, table.getValueAt(table.getSelectedRow(), 1));
				}
			}
		});
		
		if (model.getRowCount() > 0) model.setRowCount(0);
		
		ArrayList<Paciente> pacientes = new PacienteController().consultar();
		
		for(Paciente paciente : pacientes) {
			String data = paciente.getDataNasc().toString();
			model.addRow(new String[] {paciente.getNome(), paciente.getCpf(), data, paciente.getRg(),
                    paciente.getSexo(), paciente.getTelefone().toString(), paciente.getLogradouro(), paciente.getBairro(),
                    paciente.getNumero(), paciente.getComplemento(), paciente.getCep()});
			
			
		}
	}
	

}
