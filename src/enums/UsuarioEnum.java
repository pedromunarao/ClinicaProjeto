package enums;

public enum UsuarioEnum {
	ADMIN("Administrador"),
	MEDICO("Médico"),
	ATENDENTE("Atendente");
	
	public final String descricao;
	
	UsuarioEnum(String descricao) {
		this.descricao = descricao;
	}

}
