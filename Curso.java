package igor;

public class Curso {
	  private String nomeDisciplina;
	    private double[] notas;
	    private ICalculo calculadora;
	    private double media;

	    public Curso(ICalculo calculadora) {
	        this.calculadora = calculadora;
	    }

	    public void setNomeDisciplina(String nomeDisciplina) {
	        this.nomeDisciplina = nomeDisciplina;
	    }

	    public void setNotas(double[] notas) {
	        this.notas = notas;
	    }

	    public void calcularMedia() {
	        this.media = calculadora.calcularMedia(notas);
	    }

	    public String getNomeDisciplina() {
	        return nomeDisciplina;
	    }

	    public double getMedia() {
	        return this.media;
	    }

	    public String getSituacao() {
	        if (calculadora instanceof Calculadora) {
	            return this.media >= 5.0 ? "Aprovado" : "Reprovado";
	        } else {
	            return this.media >= 7.0 ? "Aprovado" : "Reprovado";
	        }

}
}
