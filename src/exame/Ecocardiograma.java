package exame;

public class Ecocardiograma {
	private String avRaizAorta;
    private String avAtrioEsq;
    private String avVentriculoDiag;
    private String avDiametroSist;
    private String avDiametroDiast;
    private String avParedePosterior;
    private String avSeptoIntrav;
    private String diagParedePost;
    private String avEncurtamento;
    private String avEjecao;
    private String comentarios;
    
	public Ecocardiograma() {
		super();
	}

	public Ecocardiograma(String avRaizAorta, String avAtrioEsq, String avVentriculoDiag, String avDiametroSist,
			String avDiametroDiast, String avParedePosterior, String avSeptoIntrav, String diagParedePost,
			String avEncurtamento, String avEjecao, String comentarios) {
		super();
		this.avRaizAorta = avRaizAorta;
		this.avAtrioEsq = avAtrioEsq;
		this.avVentriculoDiag = avVentriculoDiag;
		this.avDiametroSist = avDiametroSist;
		this.avDiametroDiast = avDiametroDiast;
		this.avParedePosterior = avParedePosterior;
		this.avSeptoIntrav = avSeptoIntrav;
		this.diagParedePost = diagParedePost;
		this.avEncurtamento = avEncurtamento;
		this.avEjecao = avEjecao;
		this.comentarios = comentarios;
		
		
	}

	public String getAvRaizAorta() {
		return avRaizAorta;
	}

	public void setAvRaizAorta(String avRaizAorta) {
		this.avRaizAorta = avRaizAorta;
	}

	public String getAvAtrioEsq() {
		return avAtrioEsq;
	}

	public void setAvAtrioEsq(String avAtrioEsq) {
		this.avAtrioEsq = avAtrioEsq;
	}

	public String getAvVentriculoDiag() {
		return avVentriculoDiag;
	}

	public void setAvVentriculoDiag(String avVentriculoDiag) {
		this.avVentriculoDiag = avVentriculoDiag;
	}

	public String getAvDiametroSist() {
		return avDiametroSist;
	}

	public void setAvDiametroSist(String avDiametroSist) {
		this.avDiametroSist = avDiametroSist;
	}

	public String getAvDiametroDiast() {
		return avDiametroDiast;
	}

	public void setAvDiametroDiast(String avDiametroDiast) {
		this.avDiametroDiast = avDiametroDiast;
	}

	public String getAvParedePosterior() {
		return avParedePosterior;
	}

	public void setAvParedePosterior(String avParedePosterior) {
		this.avParedePosterior = avParedePosterior;
	}

	public String getAvSeptoIntrav() {
		return avSeptoIntrav;
	}

	public void setAvSeptoIntrav(String avSeptoIntrav) {
		this.avSeptoIntrav = avSeptoIntrav;
	}

	public String getDiagParedePost() {
		return diagParedePost;
	}

	public void setDiagParedePost(String diagParedePost) {
		this.diagParedePost = diagParedePost;
	}

	public String getAvEncurtamento() {
		return avEncurtamento;
	}

	public void setAvEncurtamento(String avEncurtamento) {
		this.avEncurtamento = avEncurtamento;
	}

	public String getAvEjecao() {
		return avEjecao;
	}

	public void setAvEjecao(String avEjecao) {
		this.avEjecao = avEjecao;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
    
    
}
