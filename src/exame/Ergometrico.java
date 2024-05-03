package exame;

public class Ergometrico {
	private String observacoes;

	public Ergometrico() {
		super();
	}

	public Ergometrico(String observacoes) {
		super();
		this.observacoes = observacoes;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Override
	public String toString() {
		return "Ergometrico [observacoes=" + observacoes + "]";
	}
	
	
}
