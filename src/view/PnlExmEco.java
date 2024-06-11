package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;

public class PnlExmEco extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField numeroExame;
	private JTextField codigoPaciente;
	private JTextField nome;
	private JTextField textField;
	private JTextField peso;
	private JTextField convenio;
	private JTextField solicitante;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PnlExmEco() {
		setLayout(null);
		
		numeroExame = new JTextField();
		numeroExame.setBounds(12, 39, 114, 23);
		add(numeroExame);
		numeroExame.setColumns(10);
		
		JLabel lblNmeroExame = new JLabel("Número Exame:");
		lblNmeroExame.setBounds(12, 24, 114, 15);
		add(lblNmeroExame);
		
		JDateChooser dataNasc = new JDateChooser();
		dataNasc.setToolTipText("");
		dataNasc.setName("Data de Nascimento");
		dataNasc.setDateFormatString("dd/MM/yyyy");
		dataNasc.setBounds(144, 39, 102, 23);
		add(dataNasc);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(144, 24, 141, 15);
		add(lblData);
		
		JLabel lblCodPaciente = new JLabel("Cód. Paciente:");
		lblCodPaciente.setBounds(12, 74, 114, 15);
		add(lblCodPaciente);
		
		codigoPaciente = new JTextField();
		codigoPaciente.setColumns(10);
		codigoPaciente.setBounds(12, 89, 114, 23);
		add(codigoPaciente);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(144, 74, 395, 15);
		add(lblNome);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(144, 89, 395, 23);
		add(nome);
		
		JLabel idade = new JLabel("Idade:");
		idade.setBounds(12, 124, 61, 15);
		add(idade);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 139, 61, 23);
		add(textField);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(108, 124, 114, 15);
		add(lblPeso);
		
		peso = new JTextField();
		peso.setColumns(10);
		peso.setBounds(108, 139, 71, 23);
		add(peso);
		
		JComboBox<String> sexo = new JComboBox<String>();
		sexo.setBounds(316, 139, 129, 23);
		add(sexo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(316, 124, 70, 15);
		add(lblSexo);
		
		convenio = new JTextField();
		convenio.setColumns(10);
		convenio.setBounds(12, 185, 114, 23);
		add(convenio);
		
		JLabel lblConvenio = new JLabel("Convênio:");
		lblConvenio.setBounds(12, 170, 114, 15);
		add(lblConvenio);
		
		solicitante = new JTextField();
		solicitante.setColumns(10);
		solicitante.setBounds(12, 238, 433, 23);
		add(solicitante);
		
		JLabel lblSolicitante = new JLabel("Solicitante:");
		lblSolicitante.setBounds(12, 223, 114, 15);
		add(lblSolicitante);
		
		JLabel lblDiagnostico = new JLabel("Diagnóstico:");
		lblDiagnostico.setBounds(12, 273, 114, 15);
		add(lblDiagnostico);
		
		JComboBox<String> sexo_1 = new JComboBox<String>();
		sexo_1.setBounds(12, 288, 200, 23);
		add(sexo_1);
		
		JButton btnDiagnostico = new JButton("Diagnóstico");
		btnDiagnostico.setBounds(248, 287, 141, 25);
		add(btnDiagnostico);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(380, 351, 117, 25);
		add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(229, 351, 117, 25);
		add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(77, 351, 117, 25);
		add(btnCancelar);
		
		JCheckBox chckbxFumante = new JCheckBox("Fumante");
		chckbxFumante.setBounds(155, 185, 102, 23);
		add(chckbxFumante);
		
		JCheckBox chckbxMarcapa = new JCheckBox("Marcapasso");
		chckbxMarcapa.setBounds(261, 185, 139, 23);
		add(chckbxMarcapa);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(205, 124, 114, 15);
		add(lblAltura);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 139, 71, 23);
		add(textField_1);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Dialog", Font.BOLD, 12));
		lblHora.setBounds(267, 25, 40, 13);
		add(lblHora);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(267, 39, 67, 23);
		add(textField_2);

	}
}
