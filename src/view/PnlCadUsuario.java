package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PnlCadUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nome;
	private JTextField email;
	private JTextField senha;
	private JTextField confSenha;
	private JTextField crm;
	private JTextField especializacao;
	private JComboBox<String> tipo;

	/**
	 * Create the panel.
	 */
	public PnlCadUsuario() {
		setLayout(null);
		
		nome = new JTextField();
		nome.setBounds(12, 31, 250, 23);
		add(nome);
		nome.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(12, 84, 250, 23);
		add(email);
		
		senha = new JTextField();
		senha.setColumns(10);
		senha.setBounds(12, 137, 110, 23);
		add(senha);
		
		confSenha = new JTextField();
		confSenha.setColumns(10);
		confSenha.setBounds(157, 137, 105, 23);
		add(confSenha);
		
		tipo = new JComboBox<String>();
		tipo.setBounds(290, 31, 153, 23);
		add(tipo);
		
		crm = new JTextField();
		crm.setColumns(10);
		crm.setBounds(290, 84, 153, 23);
		add(crm);
		
		especializacao = new JTextField();
		especializacao.setColumns(10);
		especializacao.setBounds(290, 137, 153, 23);
		add(especializacao);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 15, 70, 15);
		add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 70, 70, 15);
		add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(12, 123, 70, 15);
		add(lblSenha);
		
		JLabel lblConfSenha = new JLabel("Conf. Senha:");
		lblConfSenha.setBounds(157, 123, 100, 15);
		add(lblConfSenha);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(290, 15, 70, 15);
		add(lblTipo);
		
		JLabel lblCrm = new JLabel("CRM:");
		lblCrm.setBounds(290, 70, 70, 15);
		add(lblCrm);
		
		JLabel lblEspecializao = new JLabel("Especialização:");
		lblEspecializao.setBounds(290, 123, 110, 15);
		add(lblEspecializao);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(326, 186, 110, 25);
		add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(157, 186, 110, 25);
		add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(12, 186, 110, 25);
		add(btnCancelar);
		
		

	}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JTextField getSenha() {
		return senha;
	}

	public void setSenha(JTextField senha) {
		this.senha = senha;
	}

	public JTextField getConfSenha() {
		return confSenha;
	}

	public void setConfSenha(JTextField confSenha) {
		this.confSenha = confSenha;
	}

	public JTextField getCrm() {
		return crm;
	}

	public void setCrm(JTextField crm) {
		this.crm = crm;
	}

	public JTextField getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(JTextField especializacao) {
		this.especializacao = especializacao;
	}

	public JComboBox<String> getTipo() {
		return tipo;
	}

	public void setTipo(JComboBox<String> tipo) {
		this.tipo = tipo;
	}
}
