package view;

import javax.swing.JPanel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import domain.Paciente;
import java.util.Date;

public class PnlCadPaciente extends JPanel {
	
	

	private static final long serialVersionUID = 1L;
	private JTextField nome;
	private JTextField cpf;
	private JLabel lblCpf;
	private JDateChooser dataNasc;
	private JLabel lblDataNasc;
	private JLabel lblRg;
	private JTextField rg;
	private JTextField telefone;
	private JComboBox sexo;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	PnlConPaciente pnlConPaciente;
	

	/**
	 * Create the panel.
	 */
	public PnlCadPaciente() {
		
		nome = new JTextField();
		nome.setBounds(12, 36, 400, 23);
		nome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 20, 70, 15);
		
		cpf = new JTextField();
		cpf.setBounds(436, 36, 141, 23);
		cpf.setColumns(10);
		
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
		
		rg = new JTextField();
		rg.setBounds(186, 89, 141, 23);
		rg.setColumns(10);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setBounds(353, 89, 153, 24);
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"MASCULINO", "FEMININO", "OUTROS"}));
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(353, 74, 70, 15);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(12, 124, 70, 15);
		
		telefone = new JTextField();
		telefone.setBounds(12, 140, 141, 23);
		telefone.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paciente paciente = new Paciente(nome.getText(), cpf.getText(), dataNasc.getDate(), rg.getText(), sexo.getItemAt(sexo.getSelectedIndex()).toString() ,Integer.parseInt(telefone.getText()));
			
			
			}
		});
		btnSalvar.setBounds(460, 190, 117, 25);
		setLayout(null);
		add(nome);
		add(lblNome);
		add(cpf);
		add(lblCpf);
		add(dataNasc);
		add(lblDataNasc);
		add(lblRg);
		add(rg);
		add(cmbSexo);
		add(lblSexo);
		add(lblTelefone);
		add(telefone);
		add(btnSalvar);
		
		
		
		
		

	}


	public JTextField getNome() {
		return nome;
	}


	public void setNome(JTextField nome) {
		this.nome = nome;
	}


	public JTextField getCpf() {
		return cpf;
	}


	public void setCpf(JTextField cpf) {
		this.cpf = cpf;
	}


	public JDateChooser getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(JDateChooser dataNasc) {
		this.dataNasc = dataNasc;
	}


	public JTextField getRg() {
		return rg;
	}


	public void setRg(JTextField rg) {
		this.rg = rg;
	}


	public JTextField getTelefone() {
		return telefone;
	}


	public void setTelefone(JTextField telefone) {
		this.telefone = telefone;
	}
	
	public JComboBox getSexo() {
		return sexo;
	}
	
	public void setSexo(JComboBox sexo) {
		this.sexo = sexo;
	}
}
