package exame;

public class Exame {
	private Integer nrExame;
    private String solicitante;
    private String tipo;
    private String paciente;
    private String medico;
    private double peso;
    private double altura;
    private String convenio;
    private String fumante;
    private String marcaPasso;
    
	public Exame() {
		super();
	}

	public Exame(Integer nrExame, String solicitante, String tipo, String paciente, String medico, double peso,
			double altura, String convenio, String fumante, String marcaPasso) {
		super();
		this.nrExame = nrExame;
		this.solicitante = solicitante;
		this.tipo = tipo;
		this.paciente = paciente;
		this.medico = medico;
		this.peso = peso;
		this.altura = altura;
		this.convenio = convenio;
		this.fumante = fumante;
		this.marcaPasso = marcaPasso;
	}

	public Integer getNrExame() {
		return nrExame;
	}

	public void setNrExame(Integer nrExame) {
		this.nrExame = nrExame;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getFumante() {
		return fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	}

	public String getMarcaPasso() {
		return marcaPasso;
	}

	public void setMarcaPasso(String marcaPasso) {
		this.marcaPasso = marcaPasso;
	}

	@Override
	public String toString() {
		return "Exame [nrExame=" + nrExame + ", solicitante=" + solicitante + ", tipo=" + tipo + ", paciente="
				+ paciente + ", medico=" + medico + ", peso=" + peso + ", altura=" + altura + ", convenio=" + convenio
				+ ", fumante=" + fumante + ", marcaPasso=" + marcaPasso + "]";
	}
    
	
    
}
