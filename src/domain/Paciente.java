package domain;

import java.util.Date;

public class Paciente {
	private String nome;
    private String Cpf;
    private Date dataNasc;
    private String Rg;
    private String sexo;
    private Long telefone;
    private String logradouro;
    private String bairro;
    private String numero;
    private String complemento;
    private String cep;
    
	public Paciente() {
		super();
	}

	public Paciente(String nome, String cpf, Date dataNasc, String rg, String sexo, Long telefone, String logradouro, String bairro, String numero, String complemento, String cep) {
		super();
		this.nome = nome;
		Cpf = cpf;
		this.dataNasc = dataNasc;
		Rg = rg;
		this.sexo = sexo;
		this.telefone = telefone;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
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

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", Cpf=" + Cpf + ", dataNasc=" + dataNasc + ", Rg=" + Rg + ", sexo=" + sexo
				+ ", telefone=" + telefone + ", logradouro=" + logradouro + ", bairro=" + bairro + ", numero=" + numero
				+ ", complemento=" + complemento + ", cep=" + cep + "]";
	}
	
    
}
