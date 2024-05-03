package exame;

public class Holter {
	private String observacoes;

	public Holter() {
		super();
	}

	public Holter(String observacoes) {
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
		return "Holter [observacoes=" + observacoes + "]";
	}
	
	
}
