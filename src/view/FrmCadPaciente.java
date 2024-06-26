package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class FrmCadPaciente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PnlCadPaciente pnlCadPaciente = new PnlCadPaciente();
	private JTabbedPane tabbedPane;

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCadPaciente frame = new FrmCadPaciente();
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
	public FrmCadPaciente() {
		setTitle("Cadastro");
		setBounds(500, 150, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		PnlCadPaciente pnlCadPaciente_1 = new PnlCadPaciente();
		PnlConPaciente pnlConPaciente = new PnlConPaciente(pnlCadPaciente_1);
		tabbedPane.addTab("Cadastro de Pacientes", pnlCadPaciente_1);
		tabbedPane.addTab("Consultar Pacientes", pnlConPaciente);
		
	}

	public void closeAndOpenSuccess() {
		dispose();
		JOptionPane.showMessageDialog(pnlCadPaciente, "Dados Salvos com sucesso!");
		FrmCadPaciente novoFrame = new FrmCadPaciente();
		novoFrame.setVisible(true);
	}
	
	public void closeAndOpen() {
		dispose();
		FrmCadPaciente novoFrame = new FrmCadPaciente();
		novoFrame.setVisible(true);
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}
	
	
	
	
}
