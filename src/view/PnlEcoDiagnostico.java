package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class PnlEcoDiagnostico extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public PnlEcoDiagnostico() {
		setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 37, 184, 103);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblRaizAorta = new JLabel("Raiz Aorta:");
		lblRaizAorta.setBounds(2, 2, 116, 13);
		panel.add(lblRaizAorta);
		
		textField = new JTextField();
		textField.setBounds(88, 25, 83, 23);
		textField.setMaximumSize(new Dimension(50, 23));
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Avaliação:");
		lblNewLabel.setBounds(10, 25, 72, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNormal = new JLabel("Normal: 21 - 37");
		lblNormal.setBounds(10, 60, 116, 15);
		panel.add(lblNormal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(226, 37, 184, 103);
		add(panel_1);
		
		JLabel lblRaizAorta_1 = new JLabel("Atrio Esquerdo");
		lblRaizAorta_1.setBounds(2, 2, 116, 13);
		panel_1.add(lblRaizAorta_1);
		
		textField_1 = new JTextField();
		textField_1.setMaximumSize(new Dimension(50, 23));
		textField_1.setColumns(10);
		textField_1.setBounds(88, 25, 83, 23);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Avaliação:");
		lblNewLabel_1.setBounds(10, 25, 72, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNormal_1 = new JLabel("Normal: 28 - 40");
		lblNormal_1.setBounds(10, 60, 116, 15);
		panel_1.add(lblNormal_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(440, 37, 184, 103);
		add(panel_2);
		
		JLabel lblRaizAorta_2 = new JLabel("Ventrículo Direito");
		lblRaizAorta_2.setBounds(2, 2, 144, 13);
		panel_2.add(lblRaizAorta_2);
		
		textField_2 = new JTextField();
		textField_2.setMaximumSize(new Dimension(50, 23));
		textField_2.setColumns(10);
		textField_2.setBounds(90, 48, 83, 23);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("Avaliação:");
		lblNewLabel_2.setBounds(12, 48, 72, 23);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNormal_2 = new JLabel("Normal: 10 - 26");
		lblNormal_2.setBounds(12, 77, 116, 15);
		panel_2.add(lblNormal_2);
		
		JLabel lblRaizAorta_3_1_1 = new JLabel("Diametro Diastólico");
		lblRaizAorta_3_1_1.setForeground(new Color(100, 149, 237));
		lblRaizAorta_3_1_1.setBounds(12, 27, 161, 13);
		panel_2.add(lblRaizAorta_3_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(12, 168, 519, 103);
		add(panel_3);
		
		JLabel lblRaizAorta_3 = new JLabel("Raiz Aorta:");
		lblRaizAorta_3.setBounds(2, 2, 116, 13);
		panel_3.add(lblRaizAorta_3);
		
		textField_3 = new JTextField();
		textField_3.setMaximumSize(new Dimension(50, 23));
		textField_3.setColumns(10);
		textField_3.setBounds(86, 47, 83, 23);
		panel_3.add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("Avaliação:");
		lblNewLabel_3.setBounds(8, 47, 72, 23);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNormal_3 = new JLabel("Normal: 26 - 34");
		lblNormal_3.setBounds(8, 82, 116, 15);
		panel_3.add(lblNormal_3);
		
		JLabel lblRaizAorta_3_1 = new JLabel("Diametro Sistólico");
		lblRaizAorta_3_1.setForeground(new Color(100, 149, 237));
		lblRaizAorta_3_1.setBackground(new Color(30, 144, 255));
		lblRaizAorta_3_1.setBounds(8, 27, 161, 13);
		panel_3.add(lblRaizAorta_3_1);
		
		JLabel lblRaizAorta_3_1_2 = new JLabel("Diametro Diastólico");
		lblRaizAorta_3_1_2.setForeground(new Color(100, 149, 237));
		lblRaizAorta_3_1_2.setBackground(new Color(30, 144, 255));
		lblRaizAorta_3_1_2.setBounds(178, 27, 161, 13);
		panel_3.add(lblRaizAorta_3_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Avaliação:");
		lblNewLabel_3_1.setBounds(178, 47, 72, 23);
		panel_3.add(lblNewLabel_3_1);
		
		textField_5 = new JTextField();
		textField_5.setMaximumSize(new Dimension(50, 23));
		textField_5.setColumns(10);
		textField_5.setBounds(256, 47, 83, 23);
		panel_3.add(textField_5);
		
		JLabel lblNormal_3_1 = new JLabel("Normal: 38 - 52");
		lblNormal_3_1.setBounds(178, 82, 116, 15);
		panel_3.add(lblNormal_3_1);
		
		JLabel lblRaizAorta_3_1_3 = new JLabel("Parede Posterior");
		lblRaizAorta_3_1_3.setForeground(new Color(100, 149, 237));
		lblRaizAorta_3_1_3.setBackground(new Color(30, 144, 255));
		lblRaizAorta_3_1_3.setBounds(346, 27, 161, 13);
		panel_3.add(lblRaizAorta_3_1_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("Avaliação:");
		lblNewLabel_3_2.setBounds(346, 47, 72, 23);
		panel_3.add(lblNewLabel_3_2);
		
		textField_6 = new JTextField();
		textField_6.setMaximumSize(new Dimension(50, 23));
		textField_6.setColumns(10);
		textField_6.setBounds(424, 47, 83, 23);
		panel_3.add(textField_6);
		
		JLabel lblNormal_3_2 = new JLabel("Normal: 07 - 11");
		lblNormal_3_2.setBounds(346, 82, 116, 15);
		panel_3.add(lblNormal_3_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(554, 168, 184, 103);
		add(panel_1_1);
		
		JLabel lblRaizAorta_1_1 = new JLabel("Atrio Esquerdo");
		lblRaizAorta_1_1.setBounds(2, 2, 116, 13);
		panel_1_1.add(lblRaizAorta_1_1);
		
		textField_4 = new JTextField();
		textField_4.setMaximumSize(new Dimension(50, 23));
		textField_4.setColumns(10);
		textField_4.setBounds(88, 25, 83, 23);
		panel_1_1.add(textField_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Avaliação:");
		lblNewLabel_1_1.setBounds(10, 25, 72, 23);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNormal_1_1 = new JLabel("Normal: 07 - 11");
		lblNormal_1_1.setBounds(10, 60, 116, 15);
		panel_1_1.add(lblNormal_1_1);
		
		JLabel lblDimenses = new JLabel("Dimensões");
		lblDimenses.setFont(new Font("Dialog", Font.BOLD, 20));
		lblDimenses.setBounds(12, 12, 201, 20);
		add(lblDimenses);
		
		JLabel lblDiagnsticoClinico = new JLabel("Diagnóstico Clinico");
		lblDiagnsticoClinico.setFont(new Font("Dialog", Font.BOLD, 20));
		lblDiagnsticoClinico.setBounds(12, 299, 242, 20);
		add(lblDiagnsticoClinico);
		
		JLabel lblFunoVentricularEsquerda = new JLabel("Função Ventricular Esquerda");
		lblFunoVentricularEsquerda.setFont(new Font("Dialog", Font.BOLD, 20));
		lblFunoVentricularEsquerda.setBounds(341, 299, 345, 20);
		add(lblFunoVentricularEsquerda);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(12, 324, 278, 225);
		add(panel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Normal Adulto");
		rdbtnNewRadioButton.setBounds(8, 18, 149, 23);
		panel_4.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNormalCirana = new JRadioButton("Normal Criança");
		rdbtnNormalCirana.setBounds(8, 45, 149, 23);
		panel_4.add(rdbtnNormalCirana);
		
		JRadioButton rdbtnAlteraoDeRelaxamento = new JRadioButton("Alteração de Relaxamento de V.E");
		rdbtnAlteraoDeRelaxamento.setBounds(8, 72, 259, 23);
		panel_4.add(rdbtnAlteraoDeRelaxamento);
		
		JRadioButton rdbtnPvmProlapso = new JRadioButton("P.V.M - Prolapso da Valva Mitral");
		rdbtnPvmProlapso.setBounds(8, 99, 264, 23);
		panel_4.add(rdbtnPvmProlapso);
		
		JRadioButton rdbtnOutros = new JRadioButton("Outros");
		rdbtnOutros.setBounds(8, 126, 149, 23);
		panel_4.add(rdbtnOutros);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.setBounds(8, 160, 117, 25);
		panel_4.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(302, 324, 217, 103);
		add(panel_5);
		
		JLabel lblFraoDeEncurtamento = new JLabel("Fração de Encurtamento");
		lblFraoDeEncurtamento.setBounds(2, 2, 216, 13);
		panel_5.add(lblFraoDeEncurtamento);
		
		textField_7 = new JTextField();
		textField_7.setMaximumSize(new Dimension(50, 23));
		textField_7.setColumns(10);
		textField_7.setBounds(88, 25, 83, 23);
		panel_5.add(textField_7);
		
		JLabel lblNewLabel_4 = new JLabel("Avaliação:");
		lblNewLabel_4.setBounds(10, 25, 72, 23);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNormal_4 = new JLabel("Normal: 21 - 37");
		lblNormal_4.setBounds(10, 60, 116, 15);
		panel_5.add(lblNormal_4);
		
		JLabel label = new JLabel("%");
		label.setBounds(175, 33, 70, 15);
		panel_5.add(label);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(531, 324, 184, 103);
		add(panel_6);
		
		JLabel lblFraoDeEjeo = new JLabel("Fração de Ejeção");
		lblFraoDeEjeo.setBounds(2, 2, 116, 13);
		panel_6.add(lblFraoDeEjeo);
		
		textField_8 = new JTextField();
		textField_8.setMaximumSize(new Dimension(50, 23));
		textField_8.setColumns(10);
		textField_8.setBounds(88, 25, 83, 23);
		panel_6.add(textField_8);
		
		JLabel lblNewLabel_5 = new JLabel("Avaliação:");
		lblNewLabel_5.setBounds(10, 25, 72, 23);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNormal_6 = new JLabel("Normal: 0.55 - 0.80");
		lblNormal_6.setBounds(10, 60, 130, 15);
		panel_6.add(lblNormal_6);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(598, 517, 117, 25);
		add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(469, 517, 117, 25);
		add(btnCancelar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(340, 517, 117, 25);
		add(btnSair);

	}
}
