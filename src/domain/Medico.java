package domain;

import enums.UsuarioEnum;

public class Medico extends Usuario {
	private String especializacao;
    private String crm;
    
	public Medico() {
		super();
		setTipo(UsuarioEnum.MEDICO);
	}
	
	public Medico(String nome, String usuario, String senha, UsuarioEnum tipo) {
		super(nome, usuario, senha, tipo);
	}

	public Medico(String nome, String usuario, String senha, UsuarioEnum tipo, String especializacao, String crm) {
		super(nome, usuario , senha, tipo );
		this.especializacao = especializacao;
		this.crm = crm;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Medico [especializacao=" + especializacao + ", crm=" + crm + "]";
	}
	
	

	
	
	
    
    
    

}
