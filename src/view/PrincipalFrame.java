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

public class PrincipalFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private FrmCadPaciente frmCadPaciente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalFrame frame = new PrincipalFrame();
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
	public PrincipalFrame() {
		setTitle("Principal");
		setDefaultCloseOperation(PrincipalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.setBackground(UIManager.getColor("Menu.acceleratorForeground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1024, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel PnlCadastro = new JPanel();
		PnlCadastro.setBounds(0, 0, 94, 41);
		panel.add(PnlCadastro);
		PnlCadastro.setLayout(null);
		
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
				if(frmCadPaciente == null || !frmCadPaciente.isVisible()) {
					frmCadPaciente = new FrmCadPaciente();
					frmCadPaciente.setVisible(true);
				}else {
					frmCadPaciente.toFront();
					frmCadPaciente.requestFocus();
				}
			}
		});
		lblCadastro.setBounds(12, 12, 70, 15);
		PnlCadastro.add(lblCadastro);
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(77, 91, 10, 10);
		contentPane.add(panel_2);
		
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
				if(frmCadPaciente == null || !frmCadPaciente.isVisible()) {
					frmCadPaciente = new FrmCadPaciente();
					frmCadPaciente.setVisible(true);
				}else {
					frmCadPaciente.toFront();
					frmCadPaciente.requestFocus();
				}
				
			}
		});
	}
}
