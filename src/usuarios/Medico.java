package usuarios;


public class Medico extends Usuario {
	private String especializacao;
    private String crm;
    
	public Medico() {
		super();
	}

	public Medico(String especializacao, String crm) {
		super();
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
