package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class FrmCadUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PnlCadUsuario pnlCadUsuario;
	private JTabbedPane tabbedPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCadUsuario frame = new FrmCadUsuario();
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
	public FrmCadUsuario() {
		setBounds(100, 100, 646, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 636, 486);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		pnlCadUsuario = new PnlCadUsuario();
		PnlConUsuario pnlConUsuario = new PnlConUsuario(pnlCadUsuario);
		tabbedPane.addTab("Cadastro de Usuários", pnlCadUsuario);
		tabbedPane.addTab("Consultar Usuários", pnlConUsuario);
	}
	
	public void closeAndOpenSuccess() {
		dispose();
		JOptionPane.showMessageDialog(pnlCadUsuario, "Dados Salvos com sucesso!");
		FrmCadUsuario novoFrame = new FrmCadUsuario();
		novoFrame.setVisible(true);
	}
	
	public void closeAndOpen() {
		dispose();
		FrmCadUsuario novoFrame = new FrmCadUsuario();
		novoFrame.setVisible(true);
	}
	
	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}
	
	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}
}
