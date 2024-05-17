package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PnlExmErgo extends JPanel {

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

	/**
	 * Create the panel.
	 */
	public PnlExmErgo() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número do Exame:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(29, 40, 110, 13);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(149, 38, 67, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblData.setBounds(247, 41, 33, 13);
		add(lblData);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(290, 38, 67, 19);
		add(textField_1);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHora.setBounds(389, 41, 33, 13);
		add(lblHora);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(432, 38, 67, 19);
		add(textField_2);
		
		JLabel lblCdPaciente = new JLabel("Cód. Paciente:");
		lblCdPaciente.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCdPaciente.setBounds(29, 89, 110, 13);
		add(lblCdPaciente);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 87, 60, 19);
		add(textField_3);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNome.setBounds(202, 90, 110, 13);
		add(lblNome);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(247, 87, 429, 19);
		add(textField_4);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAltura.setBounds(29, 132, 39, 13);
		add(lblAltura);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(79, 130, 60, 19);
		add(textField_5);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPeso.setBounds(162, 133, 39, 13);
		add(lblPeso);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(202, 130, 60, 19);
		add(textField_6);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblIdade.setBounds(290, 133, 39, 13);
		add(lblIdade);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(332, 130, 60, 19);
		add(textField_7);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSexo.setBounds(413, 133, 39, 13);
		add(lblSexo);
		
		JComboBox<String> sexo = new JComboBox<String>();
		sexo.setModel(new DefaultComboBoxModel(new String[] {"MASCULINO", "FEMININO", "OUTROS"}));
		sexo.setBounds(462, 127, 153, 24);
		add(sexo);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTelefone.setBounds(29, 172, 60, 13);
		add(lblTelefone);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(89, 170, 112, 19);
		add(textField_8);
		
		JLabel lblConvnio = new JLabel("Convênio:");
		lblConvnio.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblConvnio.setBounds(234, 173, 60, 13);
		add(lblConvnio);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(304, 170, 112, 19);
		add(textField_9);

	}
}
