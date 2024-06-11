package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;

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

	/**
	 * Create the panel.
	 */
	public PnlExmErgo() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N.Exame:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(29, 26, 67, 13);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(29, 38, 67, 23);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Dialog", Font.BOLD, 12));
		lblData.setBounds(123, 26, 40, 13);
		add(lblData);
		
		JDateChooser dataNasc = new JDateChooser();
		dataNasc.setToolTipText("");
		dataNasc.setName("Data de Nascimento");
		dataNasc.setDateFormatString("dd/MM/yyyy");
		dataNasc.setBounds(123, 40, 130, 23);
		add(dataNasc);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Dialog", Font.BOLD, 12));
		lblHora.setBounds(280, 26, 40, 13);
		add(lblHora);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(280, 40, 67, 23);
		add(textField_1);
		
		JLabel lblCdPaciente = new JLabel("Código");
		lblCdPaciente.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCdPaciente.setBounds(29, 75, 60, 13);
		add(lblCdPaciente);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(29, 89, 67, 23);
		add(textField_2);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNome.setBounds(122, 75, 50, 13);
		add(lblNome);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 89, 429, 23);
		add(textField_3);
		
		JLabel lblConvnio = new JLabel("Convênio:");
		lblConvnio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblConvnio.setBounds(29, 124, 80, 13);
		add(lblConvnio);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(29, 138, 112, 23);
		add(textField_4);
		
		JComboBox<String> sexo = new JComboBox<String>();
		sexo.setBounds(175, 137, 153, 24);
		add(sexo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSexo.setBounds(175, 125, 39, 13);
		add(lblSexo);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAltura.setBounds(29, 173, 60, 13);
		add(lblAltura);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(29, 187, 67, 23);
		add(textField_5);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPeso.setBounds(123, 173, 60, 13);
		add(lblPeso);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(122, 187, 67, 23);
		add(textField_6);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIdade.setBounds(213, 173, 60, 13);
		add(lblIdade);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(213, 187, 67, 23);
		add(textField_7);
		
		JCheckBox chckbxFumante = new JCheckBox("Fumante");
		chckbxFumante.setBounds(306, 187, 102, 23);
		add(chckbxFumante);
		
		JCheckBox chckbxMarcapa = new JCheckBox("Marcapasso");
		chckbxMarcapa.setBounds(412, 187, 139, 23);
		add(chckbxMarcapa);
		
		JLabel lblSolicitante = new JLabel("Solicitante:");
		lblSolicitante.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSolicitante.setBounds(29, 222, 90, 13);
		add(lblSolicitante);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(29, 235, 352, 23);
		add(textField_8);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 283, 549, 119);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setDropMode(DropMode.INSERT_ROWS);
		scrollPane.setViewportView(textArea);
		
		JLabel lblObservaes = new JLabel("Observações:");
		lblObservaes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblObservaes.setBounds(29, 270, 125, 13);
		add(lblObservaes);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(460, 428, 117, 25);
		add(btnNewButton);

	}
}
