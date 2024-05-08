package domain;

public class Eletrocardiograma {
	private String relatorio;
    private Double ritmo;
    private Double freqCardiaca;
    private String conclusoes;
    
	public Eletrocardiograma() {
		super();
	}

	public Eletrocardiograma(String relatorio, Double ritmo, Double freqCardiaca, String conclusoes) {
		super();
		this.relatorio = relatorio;
		this.ritmo = ritmo;
		this.freqCardiaca = freqCardiaca;
		this.conclusoes = conclusoes;
	}

	public String getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}

	public Double getRitmo() {
		return ritmo;
	}

	public void setRitmo(Double ritmo) {
		this.ritmo = ritmo;
	}

	public Double getFreqCardiaca() {
		return freqCardiaca;
	}

	public void setFreqCardiaca(Double freqCardiaca) {
		this.freqCardiaca = freqCardiaca;
	}

	public String getConclusoes() {
		return conclusoes;
	}

	public void setConclusoes(String conclusoes) {
		this.conclusoes = conclusoes;
	}

	@Override
	public String toString() {
		return "Eletrocardiograma [relatorio=" + relatorio + ", ritmo=" + ritmo + ", freqCardiaca=" + freqCardiaca
				+ ", conclusoes=" + conclusoes + "]";
	}
    
	
    
}


