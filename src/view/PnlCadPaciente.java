package view;

import javax.swing.JPanel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.text.MaskFormatter;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import domain.Paciente;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import controller.PacienteController;
import javax.swing.JFormattedTextField;


public class PnlCadPaciente extends JPanel {
	
	

	private static final long serialVersionUID = 1L;
	private JTextField nome;
	private JLabel lblCpf;
	private JFormattedTextField cpf;
	private JDateChooser dataNasc;
	private JLabel lblDataNasc;
	private JLabel lblRg;
	private JFormattedTextField rg;
	private JFormattedTextField telefone;
	private JComboBox<String> sexo;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	PnlConPaciente pnlConPaciente;
	private JTextField logradouro;
	private JTextField bairro;
	private JTextField numero;
	private JTextField complemento;
	private JFormattedTextField cep ;
	
	

	/**
	 * Create the panel.
	 */
	public PnlCadPaciente() {
		
		nome = new JTextField();
		nome.setBounds(12, 36, 400, 23);
		nome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 20, 70, 15);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(436, 20, 70, 15);
		
		dataNasc = new JDateChooser();
		dataNasc.setBounds(12, 89, 141, 23);
		dataNasc.setToolTipText("");
		dataNasc.setDateFormatString("dd/MM/yyyy");
		
		lblDataNasc = new JLabel("Data Nascimento:");
		lblDataNasc.setBounds(12, 74, 141, 15);
		
		lblRg = new JLabel("RG:");
		lblRg.setBounds(186, 73, 70, 15);
		
		sexo = new JComboBox<String>();
		sexo.setBounds(353, 89, 153, 24);
		sexo.setModel(new DefaultComboBoxModel<String>(new String[] {"MASCULINO", "FEMININO", "OUTROS"}));
		add(sexo); // Adicione ao painel
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(353, 74, 70, 15);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(12, 124, 70, 15);
		
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(460, 297, 117, 25);
		setLayout(null);
		add(nome);
		add(lblNome);
		add(lblCpf);
		add(dataNasc);
		add(lblDataNasc);
		add(lblRg);
		add(lblSexo);
		add(lblTelefone);
		add(btnSalvar);
		
		try {
            MaskFormatter cpfMask = new MaskFormatter("###.###.###-##");
            MaskFormatter rgMask = new MaskFormatter("##.###.###-#");
            MaskFormatter telMask = new MaskFormatter("(##)#####-####");
            MaskFormatter cepMask = new MaskFormatter("##.###-###");
            
            cpfMask.setPlaceholderCharacter('_');
            cpf = new JFormattedTextField(cpfMask); 
            cpf.setName("cpf");
            cpf.setBounds(436, 38, 141, 23);
            add(cpf);
            
            rgMask.setPlaceholderCharacter('_');
            rg = new JFormattedTextField(rgMask);
            rg.setName("rg");
            rg.setBounds(186, 89, 141, 23);
            add(rg);
            
            telMask.setPlaceholderCharacter('_');
            telefone = new JFormattedTextField(telMask);
            telefone.setName("telefone");
            telefone.setBounds(12, 140, 141, 23);
            add(telefone);
    		telefone.setColumns(10);
    		
    		cepMask.setPlaceholderCharacter('_');
    		cep = new JFormattedTextField(cepMask);
    		cep.setName("cep");
    		cep.setBounds(353, 237, 141, 23);
    		add(cep);
    		
    		JLabel lblCep = new JLabel("Cep:");
    		lblCep.setBounds(353, 219, 70, 15);
    		add(lblCep);
    		
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(12, 175, 100, 15);
		add(lblLogradouro);
		
		logradouro = new JTextField();
		logradouro.setColumns(10);
		logradouro.setBounds(12, 191, 315, 23);
		add(logradouro);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(353, 175, 70, 15);
		add(lblBairro);
		
		bairro = new JTextField();
		bairro.setColumns(10);
		bairro.setBounds(353, 191, 224, 23);
		add(bairro);
		
		JLabel lblNumero = new JLabel("Número:");
		lblNumero.setBounds(12, 221, 70, 15);
		add(lblNumero);
		
		numero = new JTextField();
		numero.setColumns(10);
		numero.setBounds(12, 237, 60, 23);
		add(numero);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(92, 221, 130, 15);
		add(lblComplemento);
		
		complemento = new JTextField();
		complemento.setColumns(10);
		complemento.setBounds(92, 237, 233, 23);
		add(complemento);
			
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					if (!verificaTextField(nome)) return;
										
					if (!verificaFormattedField(cpf)) return;
					
//					if (!verificaFormattedField(rg)) return;
		
					
					
//					Paciente paciente = new Paciente(nome.getText(), cpf.getText(), dataNasc.getDate(), rg.getText(), sexo.getSelectedItem().toString() ,Long.parseLong(telefone.getText()));
					PacienteController pacienteController = new PacienteController();
					pacienteController.salvar(PnlCadPaciente.this);
					
					JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PnlCadPaciente.this);
		            if (frame instanceof FrmCadPaciente) {
		                ((FrmCadPaciente) frame).closeAndOpen();
		            }
					
				}catch (Exception error) {
					System.err.println("Não foi possível salvar, verifique os dados e tente novamente!");
					error.printStackTrace();
				}
				
			
			}
		});
		

	}


	public JTextField getNome() {
		return nome;
	}


	public void setNome(JTextField nome) {
		this.nome = nome;
	}


	public JFormattedTextField getCpf() {
		return cpf;
	}


	public void setCpf(JFormattedTextField cpf) {
		this.cpf = cpf;
	}


	public JDateChooser getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(JDateChooser dataNasc) {
		this.dataNasc = dataNasc;
	}


	public JFormattedTextField getRg() {
		return rg;
	}


	public void setRg(JFormattedTextField rg) {
		this.rg = rg;
	}


	public JFormattedTextField getTelefone() {
		return telefone;
	}


	public void setTelefone(JFormattedTextField telefone) {
		this.telefone = telefone;
	}
	
	public JComboBox getSexo() {
		return sexo;
	}
	
	public void setSexo(JComboBox sexo) {
		this.sexo = sexo;
	}
	
	
	
	public JTextField getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(JTextField logradouro) {
		this.logradouro = logradouro;
	}


	public JTextField getBairro() {
		return bairro;
	}


	public void setBairro(JTextField bairro) {
		this.bairro = bairro;
	}


	public JTextField getNumero() {
		return numero;
	}


	public void setNumero(JTextField numero) {
		this.numero = numero;
	}


	public JFormattedTextField getCep() {
		return cep;
	}


	public void setCep(JFormattedTextField cep) {
		this.cep = cep;
	}


	public JTextField getComplemento() {
		return complemento;
	}


	public void setComplemento(JTextField complemento) {
		this.complemento = complemento;
	}


	public boolean verificaTextField(JTextField texto) {
		Pattern padrao = Pattern.compile("\\d+");
		Matcher verificador = padrao.matcher(texto.getText());
		
		if (texto.getText().isBlank() || verificador.find()) {
			JOptionPane.showMessageDialog(PnlCadPaciente.this, "O campo nome do paciente está inválido, verifique os campos e tente novamente!");
			texto.requestFocusInWindow();
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean verificaFormattedField(JFormattedTextField texto) {
		 String inputText = cpf.getText().trim();
	     String cpfNumeros = inputText.replaceAll("[^0-9]", "");
		
		if (cpfNumeros.length() != 11) {
			JOptionPane.showMessageDialog(PnlCadPaciente.this, "O campo " +texto.getName()+ " do paciente está inválido, verifique os campos e tente novamente!");
			texto.requestFocusInWindow();
			return false;
		}
		else {
			return true;
		}
	}
}
