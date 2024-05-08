package view;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JPasswordField;

public class Main extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	
	
	
	public Main() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(380, 492, 85, 21);
		add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(534, 331, 7, 19);
		add(passwordField);

	}
}
