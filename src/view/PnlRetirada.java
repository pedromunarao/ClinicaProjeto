package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class PnlRetirada extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public PnlRetirada() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N.Exame:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 52, 67, 13);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 64, 67, 23);
		add(textField);
		
		JLabel lblDataDaRetirada = new JLabel("Data da Retirada:");
		lblDataDaRetirada.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDataDaRetirada.setBounds(402, 150, 130, 13);
		add(lblDataDaRetirada);
		
		JDateChooser dataNasc = new JDateChooser();
		dataNasc.setToolTipText("");
		dataNasc.setName("Data de Nascimento");
		dataNasc.setDateFormatString("dd/MM/yyyy");
		dataNasc.setBounds(402, 164, 130, 23);
		add(dataNasc);
		
		JLabel lblCdPaciente = new JLabel("Código");
		lblCdPaciente.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCdPaciente.setBounds(12, 101, 60, 13);
		add(lblCdPaciente);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 115, 67, 23);
		add(textField_1);
		
		JLabel lblNome = new JLabel("Nome do Paciente:");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNome.setBounds(105, 101, 169, 13);
		add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 115, 429, 23);
		add(textField_2);
		
		JLabel lblExame = new JLabel("Exame:");
		lblExame.setFont(new Font("Dialog", Font.BOLD, 12));
		lblExame.setBounds(105, 52, 50, 13);
		add(lblExame);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(105, 64, 269, 23);
		add(textField_3);
		
		JLabel lblRetiradoPor = new JLabel("Retirado por:");
		lblRetiradoPor.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRetiradoPor.setBounds(12, 150, 186, 13);
		add(lblRetiradoPor);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(12, 164, 362, 23);
		add(textField_4);
		
		JLabel lblCdPaciente_1 = new JLabel("Código");
		lblCdPaciente_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCdPaciente_1.setBounds(10, 199, 60, 13);
		add(lblCdPaciente_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 213, 67, 23);
		add(textField_5);
		
		JLabel lblNomeAtendente = new JLabel("Nome do Atendente:");
		lblNomeAtendente.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNomeAtendente.setBounds(103, 199, 155, 13);
		add(lblNomeAtendente);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(103, 213, 429, 23);
		add(textField_6);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(415, 254, 117, 25);
		add(btnNewButton);

	}

}
