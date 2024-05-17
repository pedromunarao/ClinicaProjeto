package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class FrmCadPaciente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	PnlCadPaciente pnlCadPaciente = new PnlCadPaciente();

	/**
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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		PnlCadPaciente pnlCadPaciente = new PnlCadPaciente();
		PnlConPaciente pnlConPaciente = new PnlConPaciente();
		tabbedPane.addTab("Cadastro de Pacientes", pnlCadPaciente);
		tabbedPane.addTab("Consultar Pacientes", pnlConPaciente);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
	}

	public void closeAndOpen() {
		dispose();
		JOptionPane.showMessageDialog(pnlCadPaciente, "Dados Salvos com sucesso!");
		FrmCadPaciente novoFrame = new FrmCadPaciente();
		novoFrame.setVisible(true);
	}
}
