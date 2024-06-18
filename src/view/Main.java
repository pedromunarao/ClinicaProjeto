package view;

import java.awt.EventQueue;
import view.FrmPrincipal;

public class Main {

	public static void main(String[] args) {
		new Main().IniciarApp();
		
	}
	
	private void IniciarApp() {
//		FrmCadPaciente frame = new FrmCadPaciente();
		FrmLogin frame = new FrmLogin();
		frame.setVisible(true);
	}

}
