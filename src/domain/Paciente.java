package domain;

import java.sql.Date;

public class Paciente {
	private String nome;
    private String CPF;
    private Date dataNasc;
    private String RG;
    private String sexo;
    private Integer telefone;
    
	public Paciente() {
		super();
	}

	public Paciente(String nome, String cPF, Date dataNasc, String rG, String sexo, Integer telefone) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataNasc = dataNasc;
		RG = rG;
		this.sexo = sexo;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", CPF=" + CPF + ", dataNasc=" + dataNasc + ", RG=" + RG + ", sexo=" + sexo
				+ ", telefone=" + telefone + "]";
	}
	
	
    
    
}
