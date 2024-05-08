package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class CadastroFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField email;
	private JPasswordField conf_senha;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { CadastroFrame frame = new
	 * CadastroFrame(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } });
	 }*/

	/**
	 * Create the frame.
	 */
	public CadastroFrame() {
		setTitle("Cadastro de Usuários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setName("usuario");
		username.setBounds(27, 32, 280, 19);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setBounds(27, 12, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(27, 122, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(190, 200, 117, 25);
		contentPane.add(btnCadastrar);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(27, 63, 70, 15);
		contentPane.add(lblEmail);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(27, 83, 280, 19);
		contentPane.add(email);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirmar Senha:");
		lblNewLabel_1_1.setBounds(183, 122, 124, 15);
		contentPane.add(lblNewLabel_1_1);
		
		conf_senha = new JPasswordField();
		conf_senha.setBounds(183, 139, 125, 19);
		contentPane.add(conf_senha);
		
		senha = new JPasswordField();
		senha.setBounds(27, 139, 125, 19);
		contentPane.add(senha);
		
		
	}
}
