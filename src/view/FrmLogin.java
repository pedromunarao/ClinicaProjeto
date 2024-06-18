package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import controller.UsuarioController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class FrmLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private UsuarioController usuarioController;
	private JTextField textFieldUsuario;
	private JPasswordField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin frame = new FrmLogin();
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
	public FrmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 674, 390);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setFont(new Font("Dialog", Font.BOLD, 12));
		lblUsuario.setBounds(10, 37, 100, 13);
		panel.add(lblUsuario);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(10, 49, 269, 23);
		panel.add(textFieldUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSenha.setBounds(10, 80, 50, 13);
		panel.add(lblSenha);
		
		textFieldSenha = new JPasswordField();
		textFieldSenha.setColumns(10);
		textFieldSenha.setBounds(10, 92, 269, 23);
		panel.add(textFieldSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(usuarioController.login(FrmLogin.this)) {
                	FrmPrincipal frame = new FrmPrincipal();
            		frame.setVisible(true);
            		FrmLogin.this.dispose();
                }
                	
                
            }
        });
		btnEntrar.setBounds(76, 142, 117, 25);
		panel.add(btnEntrar);
		
		usuarioController = new UsuarioController();

        getContentPane().setLayout(null);
    }

    public JTextField getTextFieldUsuario() {
        return textFieldUsuario;
    }

    public JTextField getTextFieldSenha() {
        return textFieldSenha;
    }
}
