package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PnlAgenda extends JPanel {

	private static final long serialVersionUID = 1L;
	private JCalendar calendario;
	
	/**
	 * Create the panel.
	 */
	public PnlAgenda() {
		setLayout(null);
		
		calendario = new JCalendar();
		calendario.setBounds(33, 40, 652, 359);
		add(calendario);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(569, 415, 117, 25);
		add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(440, 415, 117, 25);
		add(btnEditar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(303, 415, 117, 25);
		add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(170, 415, 117, 25);
		add(btnExcluir);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 24, 693, 430);
		add(panel);

	}
}
