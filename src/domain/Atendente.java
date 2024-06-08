package domain;

import enums.UsuarioEnum;

public class Atendente extends Usuario {

	public Atendente() {
		super();
		setTipo(UsuarioEnum.ATENDENTE);
		// TODO Auto-generated constructor stub
	}

	public Atendente(String nome, String usuario, String senha, UsuarioEnum tipo) {
		super(nome, usuario, senha, tipo);
		// TODO Auto-generated constructor stub
	}	
	
	

}
