package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.DropMode;

public class PnlExmEletro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nExame;
	private JTextField hora;
	private JTextField codigoPaciente;
	private JTextField nome;
	private JTextField convenio;
	private JTextField altura;
	private JTextField peso;
	private JTextField idade;
	private JTextField solicitante;
	private JDateChooser dataNasc; 
	private JTextField textField;
	private JTextField textField_1;
	JComboBox<String> sexo;

	/**
	 * Create the panel.
	 */
	public PnlExmEletro() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N.Exame:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(26, 23, 70, 13);
		add(lblNewLabel);
		
		nExame = new JTextField();
		nExame.setColumns(10);
		nExame.setBounds(26, 37, 67, 23);
		add(nExame);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Dialog", Font.BOLD, 12));
		lblData.setBounds(119, 23, 40, 13);
		add(lblData);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Dialog", Font.BOLD, 12));
		lblHora.setBounds(276, 23, 40, 13);
		add(lblHora);
		
		hora = new JTextField();
		hora.setColumns(10);
		hora.setBounds(276, 37, 67, 23);
		add(hora);
		
		JLabel lblCdPaciente = new JLabel("Código");
		lblCdPaciente.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCdPaciente.setBounds(26, 72, 60, 13);
		add(lblCdPaciente);
		
		codigoPaciente = new JTextField();
		codigoPaciente.setColumns(10);
		codigoPaciente.setBounds(26, 86, 67, 23);
		add(codigoPaciente);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNome.setBounds(119, 72, 50, 13);
		add(lblNome);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(119, 86, 429, 23);
		add(nome);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSexo.setBounds(172, 122, 39, 13);
		add(lblSexo);
		
		JLabel lblConvnio = new JLabel("Convênio:");
		lblConvnio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblConvnio.setBounds(26, 121, 80, 13);
		add(lblConvnio);
		
		convenio = new JTextField();
		convenio.setColumns(10);
		convenio.setBounds(26, 135, 112, 23);
		add(convenio);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAltura.setBounds(26, 170, 60, 13);
		add(lblAltura);
		
		altura = new JTextField();
		altura.setColumns(10);
		altura.setBounds(26, 184, 67, 23);
		add(altura);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPeso.setBounds(120, 170, 60, 13);
		add(lblPeso);
		
		peso = new JTextField();
		peso.setColumns(10);
		peso.setBounds(119, 184, 67, 23);
		add(peso);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIdade.setBounds(210, 170, 60, 13);
		add(lblIdade);
		
		idade = new JTextField();
		idade.setColumns(10);
		idade.setBounds(210, 184, 67, 23);
		add(idade);
		
		JLabel lblSolicitante = new JLabel("Solicitante:");
		lblSolicitante.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSolicitante.setBounds(26, 219, 90, 13);
		add(lblSolicitante);
		
		solicitante = new JTextField();
		solicitante.setColumns(10);
		solicitante.setBounds(26, 232, 352, 23);
		add(solicitante);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBounds(26, 288, 633, 248);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblRitmo = new JLabel("Ritmo:");
		lblRitmo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRitmo.setBounds(12, 12, 60, 13);
		panel.add(lblRitmo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 26, 150, 23);
		panel.add(textField);
		
		JLabel lblFc = new JLabel("F.C:");
		lblFc.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFc.setBounds(200, 12, 60, 13);
		panel.add(lblFc);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 26, 150, 23);
		panel.add(textField_1);
		
		JLabel lblConcluses = new JLabel("Conclusões:");
		lblConcluses.setFont(new Font("Dialog", Font.BOLD, 12));
		lblConcluses.setBounds(12, 137, 132, 13);
		panel.add(lblConcluses);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 61, 609, 64);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setDropMode(DropMode.INSERT_ROWS);
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 157, 609, 64);
		panel.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setDropMode(DropMode.INSERT_ROWS);
		scrollPane_1.setViewportView(textArea_1);
		
		JLabel lblNewLabel_1 = new JLabel("Relatório");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(26, 265, 110, 24);
		add(lblNewLabel_1);
		
		dataNasc = new JDateChooser();
		dataNasc.setToolTipText("");
		dataNasc.setName("Data de Nascimento");
		dataNasc.setDateFormatString("dd/MM/yyyy");
		dataNasc.setBounds(119, 37, 130, 23);
		add(dataNasc);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(542, 548, 117, 25);
		add(btnSalvar);
		
		 sexo = new JComboBox<String>();
		sexo.setBounds(172, 134, 153, 24);
		add(sexo);
		
		JCheckBox chckbxFumante = new JCheckBox("Fumante");
		chckbxFumante.setBounds(303, 184, 102, 23);
		add(chckbxFumante);
		
		JCheckBox chckbxMarcapa = new JCheckBox("Marcapasso");
		chckbxMarcapa.setBounds(409, 184, 139, 23);
		add(chckbxMarcapa);

	}

	public JTextField getnExame() {
		return nExame;
	}

	public void setnExame(JTextField nExame) {
		this.nExame = nExame;
	}

	public JTextField getHora() {
		return hora;
	}

	public void setHora(JTextField hora) {
		this.hora = hora;
	}

	public JTextField getCodigoPaciente() {
		return codigoPaciente;
	}

	public void setCodigoPaciente(JTextField codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getTextField_6() {
		return convenio;
	}

	public void setTextField_6(JTextField textField_6) {
		this.convenio = textField_6;
	}

	public JTextField getAltura() {
		return altura;
	}

	public void setAltura(JTextField altura) {
		this.altura = altura;
	}

	public JTextField getPeso() {
		return peso;
	}

	public void setPeso(JTextField peso) {
		this.peso = peso;
	}

	public JTextField getIdade() {
		return idade;
	}

	public void setIdade(JTextField idade) {
		this.idade = idade;
	}

	public JTextField getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(JTextField solicitante) {
		this.solicitante = solicitante;
	}

	public JComboBox<String> getSexo() {
		return sexo;
	}

	public void setSexo(JComboBox<String> sexo) {
		this.sexo = sexo;
	}

	public JDateChooser getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(JDateChooser dataNasc) {
		this.dataNasc = dataNasc;
	}
}
