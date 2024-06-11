package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PnlLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PnlLogin() {
		setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usuário:");
		lblUsurio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblUsurio.setBounds(12, 32, 100, 13);
		add(lblUsurio);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 44, 269, 23);
		add(textField);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSenha.setBounds(12, 75, 50, 13);
		add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 87, 269, 23);
		add(textField_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(78, 137, 117, 25);
		add(btnEntrar);

	}

}
