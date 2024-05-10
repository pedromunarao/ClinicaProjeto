package domain;

import java.util.Date;

public class Paciente {
	private String nome;
    private String Cpf;
    private Date dataNasc;
    private String Rg;
    private String sexo;
    private Long telefone;
    
	public Paciente() {
		super();
	}

	public Paciente(String nome, String cpf, Date dataNasc, String rg, String sexo, Long telefone) {
		super();
		this.nome = nome;
		Cpf = cpf;
		this.dataNasc = dataNasc;
		Rg = rg;
		this.sexo = sexo;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getRg() {
		return Rg;
	}

	public void setRg(String rg) {
		Rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long l) {
		this.telefone = l;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", CPF=" + Cpf + ", dataNasc=" + dataNasc + ", RG=" + Rg + ", sexo=" + sexo
				+ ", telefone=" + telefone + "]";
	}
	
	
    
    
}
