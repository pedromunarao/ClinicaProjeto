package view;

import javax.swing.JPanel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.text.MaskFormatter;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import domain.Paciente;
import java.util.Date;
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
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
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
		btnSalvar.setBounds(460, 190, 117, 25);
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
    		
        } catch (Exception e) {
            e.printStackTrace();
        }
			
		
		

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
}
