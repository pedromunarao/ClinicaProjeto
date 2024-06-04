package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;

public class PnlExmEletro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the panel.
	 */
	public PnlExmEletro() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número do Exame:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(26, 23, 110, 13);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(146, 21, 67, 19);
		add(textField);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblData.setBounds(244, 24, 33, 13);
		add(lblData);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(287, 21, 67, 19);
		add(textField_1);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHora.setBounds(386, 24, 33, 13);
		add(lblHora);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(429, 21, 67, 19);
		add(textField_2);
		
		JLabel lblCdPaciente = new JLabel("Cód. Paciente:");
		lblCdPaciente.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCdPaciente.setBounds(26, 72, 110, 13);
		add(lblCdPaciente);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 70, 60, 19);
		add(textField_3);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNome.setBounds(199, 73, 110, 13);
		add(lblNome);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(244, 70, 429, 19);
		add(textField_4);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSexo.setBounds(440, 116, 39, 13);
		add(lblSexo);
		
		JComboBox<String> sexo = new JComboBox<String>();
		sexo.setBounds(489, 111, 153, 24);
		add(sexo);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTelefone.setBounds(26, 118, 60, 13);
		add(lblTelefone);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(86, 116, 112, 19);
		add(textField_5);
		
		JLabel lblConvnio = new JLabel("Convênio:");
		lblConvnio.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblConvnio.setBounds(231, 119, 60, 13);
		add(lblConvnio);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(301, 116, 112, 19);
		add(textField_6);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAltura.setBounds(26, 160, 39, 13);
		add(lblAltura);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(75, 158, 60, 19);
		add(textField_7);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPeso.setBounds(167, 160, 39, 13);
		add(lblPeso);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(217, 158, 60, 19);
		add(textField_8);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblIdade.setBounds(311, 160, 39, 13);
		add(lblIdade);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(360, 158, 60, 19);
		add(textField_9);
		
		JLabel lblSolicitante = new JLabel("Solicitante:");
		lblSolicitante.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSolicitante.setBounds(26, 199, 67, 13);
		add(lblSolicitante);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(101, 197, 352, 19);
		add(textField_10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBounds(26, 260, 633, 248);
		add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Relatório");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(39, 238, 110, 24);
		add(lblNewLabel_1);

	}
}
