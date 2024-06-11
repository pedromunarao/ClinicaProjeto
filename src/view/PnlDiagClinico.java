package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class PnlDiagClinico extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PnlDiagClinico() {
		setLayout(null);
		
		JLabel lblNormalAdulto = new JLabel("Normal Adulto - Comentários e Conclusões");
		lblNormalAdulto.setBounds(12, 12, 325, 15);
		add(lblNormalAdulto);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 39, 710, 396);
		add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 12, 686, 372);
		panel.add(textArea);
		
		JButton btnRestaurarPadro = new JButton("Restaurar Padrão");
		btnRestaurarPadro.setBounds(12, 447, 190, 25);
		add(btnRestaurarPadro);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(605, 447, 117, 25);
		add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(476, 447, 117, 25);
		add(btnEditar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(347, 447, 117, 25);
		add(btnCancelar);

	}
}
