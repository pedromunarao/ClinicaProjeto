package agendamento;

import java.sql.Date;
import java.sql.Time;

public class Agendamento {
	private Date data;
	private Time hora;
	private String exame;
	
	public Agendamento() {
		super();
	}
	
	public Agendamento(Date data, Time hora, String exame) {
		super();
		this.data = data;
		this.hora = hora;
		this.exame = exame;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	@Override
	public String toString() {
		return "Agendamento [data=" + data + ", hora=" + hora + ", exame=" + exame + "]";
	}
	
	
	
}


