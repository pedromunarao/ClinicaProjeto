package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import controller.UsuarioController;
import domain.Medico;
import domain.Usuario;
import exceptions.UsuarioNaoEncontradoException;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PnlConUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private PnlCadUsuario pnlCadUsuario;
	private JTextField txtConsulta;

	/**
	 * Create the panel.
	 */
	public PnlConUsuario(PnlCadUsuario pnlCadUsuario) {
		this.pnlCadUsuario = pnlCadUsuario;
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 66, 588, 403);
		add(scrollPane);
		
		atualizaTabela();
		scrollPane.setViewportView(table);
		
		txtConsulta = new JTextField();
		txtConsulta.setBounds(12, 22, 304, 23);
		add(txtConsulta);
		txtConsulta.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(348, 21, 117, 25);
		add(btnPesquisar);
		
		JLabel lblConsultar = new JLabel("Consultar");
		lblConsultar.setBounds(12, 9, 70, 15);
		add(lblConsultar);

	}
	
	public void atualizaTabela() {
		String colunas[] = {"Nome", "Email", "Tipo", "CRM", "Especialização"};
		DefaultTableModel model = new DefaultTableModel(colunas, 0){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					try {
						Usuario usuarioConsulta = new UsuarioController().buscarUsuario((String) (table.getValueAt(table.getSelectedRow(), 1)));
//						pnlCadUsuario.getId().setText(usuarioConsulta.getId().toString());
						pnlCadUsuario.getNome().setText(usuarioConsulta.getNome());
						pnlCadUsuario.getEmail().setText(usuarioConsulta.getUsuario());
						pnlCadUsuario.getSenha().setText(usuarioConsulta.getSenha());
						for(int i = 0; i < pnlCadUsuario.getTipo().getItemCount(); i++) {
							if(pnlCadUsuario.getTipo().getItemAt(i).equals(usuarioConsulta.getTipo().descricao)) {
								pnlCadUsuario.getTipo().setSelectedIndex(i);
								break;
							}
						}
						
						if (usuarioConsulta.getTipo().descricao.equals("Médico")) {
							Medico medico = (Medico) usuarioConsulta;
							pnlCadUsuario.getCrm().setText(medico.getCrm());
							pnlCadUsuario.getCrm().setEnabled(true);
							pnlCadUsuario.getEspecializacao().setText(medico.getEspecializacao());
							pnlCadUsuario.getEspecializacao().setEnabled(true);
						}else {
							pnlCadUsuario.getCrm().setText("");
							pnlCadUsuario.getCrm().setEnabled(false);
							pnlCadUsuario.getEspecializacao().setText("");
							pnlCadUsuario.getEspecializacao().setEnabled(false);
							
						}
						
						Component parent = SwingUtilities.getWindowAncestor(pnlCadUsuario);
						if (parent instanceof JFrame) {
						    JFrame frame = (JFrame) parent;
						    
						    if (frame instanceof FrmCadUsuario) {
						        FrmCadUsuario frmCadUsuario = (FrmCadUsuario) frame;
						        JTabbedPane tabbedPane = frmCadUsuario.getTabbedPane(); 
						        if (tabbedPane != null) {
						            tabbedPane.setSelectedIndex(0);
						            pnlCadUsuario.editando = true;
						        }
						    }
						}
						
					}catch(UsuarioNaoEncontradoException error) {
						JOptionPane.showMessageDialog(PnlConUsuario.this, error.getMessage());
//						error.printStackTrace();
					}
				}
			}
		});
		
		if (model.getRowCount() > 0) model.setRowCount(0);
		
		ArrayList<Usuario> usuarios = new UsuarioController().consultar();
		for(Usuario usuario : usuarios){
			if(usuario.getTipo().descricao.equals("Médico")) {
				Medico medico = new Medico();
				medico = (Medico) usuario;
				model.addRow(new String[] {medico.getNome(), medico.getUsuario(), medico.getTipo().descricao, medico.getCrm(), medico.getEspecializacao()});
			}else {
				model.addRow(new String[] {usuario.getNome(), usuario.getUsuario(), usuario.getTipo().descricao});
			}
		}
		
				
	}
}
