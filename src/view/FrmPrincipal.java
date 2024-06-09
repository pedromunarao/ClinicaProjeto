package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import java.awt.Color;

public class FrmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private FrmCadPaciente frmCadPaciente;
	private FrmCadUsuario frmCadUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		setTitle("Principal");
		setDefaultCloseOperation(FrmPrincipal.EXIT_ON_CLOSE);
		setBounds(400, 100, 1360, 768);
		contentPane = new JPanel();
		contentPane.setAlignmentY(Component.CENTER_ALIGNMENT);
		contentPane.setBackground(UIManager.getColor("Menu.acceleratorForeground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1360, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel PnlCadastro = new JPanel();
		PnlCadastro.setBounds(0, 0, 94, 41);
		panel.add(PnlCadastro);
		PnlCadastro.setLayout(null);
		
		
		JPanel PnlExame = new JPanel();
		PnlExame.setBounds(95, 0, 94, 41);
		panel.add(PnlExame);
		PnlExame.setLayout(null);
		
		JLabel lblExame = new JLabel("Exames");
		lblExame.setBounds(16, 12, 58, 15);
		PnlExame.add(lblExame);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(191, 0, 94, 41);
		panel.add(panel_1_2);
		
		JPanel PnlCadastros = new JPanel();
		PnlCadastros.setVisible(false);
		PnlCadastros.setBounds(0, 40, 126, 93);
		contentPane.add(PnlCadastros);
		PnlCadastros.setLayout(null);
		
		JPanel PnlPacientes = new JPanel();
		PnlPacientes.setBounds(0, 10, 126, 37);
		PnlCadastros.add(PnlPacientes);
		PnlPacientes.setLayout(null);
		
		JLabel LblPacientes = new JLabel("Pacientes");
		LblPacientes.setBounds(26, 12, 70, 15);
		PnlPacientes.add(LblPacientes);
		
		JPanel PnlUsuarios = new JPanel();
		
		PnlUsuarios.setLayout(null);
		PnlUsuarios.setBounds(0, 47, 126, 37);
		PnlCadastros.add(PnlUsuarios);
		
		JLabel lblUsuarios = new JLabel("Usuários");
		lblUsuarios.setBounds(26, 12, 70, 15);
		PnlUsuarios.add(lblUsuarios);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(25, 25, 112));
		panel_3.setBounds(0, 0, 126, 10);
		PnlCadastros.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(25, 25, 112));
		panel_3_1.setBounds(0, 83, 126, 10);
		PnlCadastros.add(panel_3_1);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCadastro.setForeground(getForeground().WHITE);
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCadastro.setForeground(getForeground().BLACK);
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(PnlCadastros.isVisible()) {
					PnlCadastros.setVisible(false);
				}
				else {
					PnlCadastros.setVisible(true);
				}
				
			}
		});
			lblCadastro.setBounds(12, 12, 70, 15);
			PnlCadastro.add(lblCadastro);
		
		
		PnlCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCadastro.setForeground(getForeground().WHITE);
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCadastro.setForeground(getForeground().BLACK);
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(PnlCadastros.isVisible()) {
					PnlCadastros.setVisible(false);
				}
				else {
					PnlCadastros.setVisible(true);
				}
				
			}
		});
		
		PnlPacientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(frmCadPaciente == null || !frmCadPaciente.isVisible()) {
					frmCadPaciente = new FrmCadPaciente();
					frmCadPaciente.setVisible(true);
				}else {
					frmCadPaciente.toFront();
					frmCadPaciente.requestFocus();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				LblPacientes.setForeground(getForeground().WHITE);
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				LblPacientes.setForeground(getForeground().BLACK);
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				
			}
		});
		
		PnlUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (frmCadUsuario == null || !frmCadUsuario.isVisible()) {
					frmCadUsuario = new FrmCadUsuario();
					frmCadUsuario.setVisible(true);
				}else {
					frmCadUsuario.toFront();
					frmCadUsuario.requestFocus();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblUsuarios.setForeground(getForeground().WHITE);
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblUsuarios.setForeground(getForeground().BLACK);
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
	}
}
