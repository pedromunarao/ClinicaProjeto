package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrincipalFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCadastro.setForeground(getForeground().BLACK);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 715, 1024, 20);
		contentPane.add(panel_1);
		
		PnlCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCadastro.setForeground(getForeground().WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCadastro.setForeground(getForeground().BLACK);
			}
		});
	}
}
