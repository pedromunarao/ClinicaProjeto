package domain;

import enums.UsuarioEnum;

public class Administrador extends Usuario {

	public Administrador() {
		super();
		setTipo(UsuarioEnum.ADMIN);
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nome, String usuario, String senha, UsuarioEnum tipo) {
		super(nome, usuario, senha, tipo);
		// TODO Auto-generated constructor stub
	}
	

}
