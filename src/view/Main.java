package view;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		new Main().IniciarApp();
		
	}
	
	private void IniciarApp() {
//		FrmCadPaciente frame = new FrmCadPaciente();
		PrincipalFrame frame = new PrincipalFrame();
		frame.setVisible(true);
	}

}
