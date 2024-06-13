package view;

import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.UsuarioController;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlCadUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nome;
	private JTextField email;
	private JTextField crm;
	private JTextField especializacao;
	private JComboBox<String> tipo;
	private JTextField id;
	private JPasswordField Senha;
	private JPasswordField confSenha;
	protected boolean editando;
	private JButton btnExcluir;
	private JButton btnCancelar;

	/**
	 * Create the panel.
	 */
	public PnlCadUsuario() {
		setLayout(null);
		editando = false;
		
		nome = new JTextField();
		nome.setBounds(12, 31, 250, 23);
		add(nome);
		nome.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(12, 84, 250, 23);
		add(email);
		
		tipo = new JComboBox<String>();
		tipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionado = (String) tipo.getSelectedItem();
				
				switch (selecionado) {
					case "MÉDICO":
						crm.setEnabled(true);
						especializacao.setEnabled(true);
						break;
					default:
						crm.setEnabled(false);
						especializacao.setEnabled(false);
						break;
				}
			}
		});
		tipo.setBounds(290, 31, 153, 23);
		tipo.setModel(new DefaultComboBoxModel<String>(new String[] {"MÉDICO", "ATENDENTE", "ADMINISTRADOR"}));
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
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UsuarioController usuarioController = new UsuarioController();
					
					if (editando) {
						usuarioController.atualizaUsuario(PnlCadUsuario.this);
					}else {
						usuarioController.salvar(PnlCadUsuario.this);
					}
					
				}catch(RuntimeException ex) {
					JOptionPane.showMessageDialog(PnlCadUsuario.this,  "Não foi possível salvar o usuário, verifique os dados e tente novamente!");
					ex.printStackTrace();
				}
				
			}
		});
		btnSalvar.setBounds(326, 186, 110, 25);
		add(btnSalvar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UsuarioController usuarioController = new UsuarioController();
					if (editando) {
						usuarioController.excluirUsuario(PnlCadUsuario.this);
					}
					
				}catch(RuntimeException ex) {
					JOptionPane.showMessageDialog(PnlCadUsuario.this, "Não foi possível excluir, tente novamente");
					ex.printStackTrace();
				}
			}
		});
		btnExcluir.setVisible(false);
		btnExcluir.setBounds(157, 186, 110, 25);
		add(btnExcluir);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaCampos(PnlCadUsuario.this);
			}
		});
		btnCancelar.setVisible(false);
		btnCancelar.setBounds(12, 186, 110, 25);
		add(btnCancelar);
		
		id = new JTextField();
		id.setVisible(false);
		id.setBounds(71, 0, 114, 19);
		add(id);
		id.setColumns(10);
		
		Senha = new JPasswordField();
		Senha.setBounds(12, 137, 110, 23);
		add(Senha);
		
		confSenha = new JPasswordField();
		confSenha.setBounds(157, 137, 110, 23);
		add(confSenha);
		
		

	}

	public JTextField getId() {
		return id;
	}

	public void setId(JTextField id) {
		this.id = id;
	}

	public JPasswordField getSenha() {
		return Senha;
	}

	public void setSenha(JPasswordField senha) {
		Senha = senha;
	}

	public JPasswordField getConfSenha() {
		return confSenha;
	}

	public void setConfSenha(JPasswordField confSenha) {
		this.confSenha = confSenha;
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
	
	public void limpaCampos(PnlCadUsuario pnl) {
		pnl.getNome().setText("");
		pnl.getId().setText("");
		pnl.getSenha().setText("");
		pnl.getConfSenha().setText("");
		pnl.getEmail().setText("");
		pnl.getTipo().setSelectedIndex(0);
		pnl.getCrm().setText("");
		pnl.getCrm().setEnabled(false);
		pnl.getEspecializacao().setText("");
		pnl.getEspecializacao().setEnabled(false);
		pnl.btnCancelar.setVisible(false);
		pnl.btnExcluir.setVisible(false);
		
	}
	
	public void mudaBotao() {
		if(editando) {
			btnExcluir.setVisible(true);
			btnCancelar.setVisible(true);
		}
		
	}
}
