package controle;

import java.sql.Date;

public class Controle {
	private String paciente;
	private Date dataRetirada;
	private String exame;
	private String nomeRetirada;
	private String atendente;
	
	public Controle() {
		super();
	}

	public Controle(String paciente, Date dataRetirada, String exame, String nomeRetirada, String atendente) {
		super();
		this.paciente = paciente;
		this.dataRetirada = dataRetirada;
		this.exame = exame;
		this.nomeRetirada = nomeRetirada;
		this.atendente = atendente;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public String getNomeRetirada() {
		return nomeRetirada;
	}

	public void setNomeRetirada(String nomeRetirada) {
		this.nomeRetirada = nomeRetirada;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	@Override
	public String toString() {
		return "Controle [paciente=" + paciente + ", dataRetirada=" + dataRetirada + ", exame=" + exame
				+ ", nomeRetirada=" + nomeRetirada + ", atendente=" + atendente + "]";
	}
	
	
	
	
	
}
