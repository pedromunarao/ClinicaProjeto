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
	private JTextField nExame;
	private JTextField data;
	private JTextField hora;
	private JTextField codigoPaciente;
	private JTextField nome;
	private JTextField telefone;
	private JTextField textField_6;
	private JTextField altura;
	private JTextField peso;
	private JTextField idade;
	private JTextField solicitante;

	/**
	 * Create the panel.
	 */
	public PnlExmEletro() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N.Exame:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(26, 23, 70, 13);
		add(lblNewLabel);
		
		nExame = new JTextField();
		nExame.setColumns(10);
		nExame.setBounds(26, 37, 67, 23);
		add(nExame);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Dialog", Font.BOLD, 12));
		lblData.setBounds(119, 23, 40, 13);
		add(lblData);
		
		data = new JTextField();
		data.setColumns(10);
		data.setBounds(119, 37, 67, 23);
		add(data);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Dialog", Font.BOLD, 12));
		lblHora.setBounds(210, 23, 40, 13);
		add(lblHora);
		
		hora = new JTextField();
		hora.setColumns(10);
		hora.setBounds(210, 37, 67, 23);
		add(hora);
		
		JLabel lblCdPaciente = new JLabel("Código");
		lblCdPaciente.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCdPaciente.setBounds(26, 72, 60, 13);
		add(lblCdPaciente);
		
		codigoPaciente = new JTextField();
		codigoPaciente.setColumns(10);
		codigoPaciente.setBounds(26, 86, 67, 23);
		add(codigoPaciente);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNome.setBounds(119, 72, 50, 13);
		add(lblNome);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(119, 86, 429, 23);
		add(nome);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSexo.setBounds(311, 122, 39, 13);
		add(lblSexo);
		
		JComboBox<String> sexo = new JComboBox<String>();
		sexo.setBounds(311, 134, 153, 24);
		add(sexo);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTelefone.setBounds(24, 121, 70, 13);
		add(lblTelefone);
		
		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(26, 135, 112, 23);
		add(telefone);
		
		JLabel lblConvnio = new JLabel("Convênio:");
		lblConvnio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblConvnio.setBounds(165, 121, 80, 13);
		add(lblConvnio);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(165, 135, 112, 23);
		add(textField_6);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAltura.setBounds(26, 170, 60, 13);
		add(lblAltura);
		
		altura = new JTextField();
		altura.setColumns(10);
		altura.setBounds(26, 184, 67, 23);
		add(altura);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPeso.setBounds(120, 170, 60, 13);
		add(lblPeso);
		
		peso = new JTextField();
		peso.setColumns(10);
		peso.setBounds(119, 184, 67, 23);
		add(peso);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIdade.setBounds(210, 170, 60, 13);
		add(lblIdade);
		
		idade = new JTextField();
		idade.setColumns(10);
		idade.setBounds(210, 184, 67, 23);
		add(idade);
		
		JLabel lblSolicitante = new JLabel("Solicitante:");
		lblSolicitante.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSolicitante.setBounds(26, 219, 90, 13);
		add(lblSolicitante);
		
		solicitante = new JTextField();
		solicitante.setColumns(10);
		solicitante.setBounds(26, 232, 352, 23);
		add(solicitante);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBounds(26, 288, 633, 248);
		add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Relatório");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(26, 265, 110, 24);
		add(lblNewLabel_1);

	}
}
