package igor;

public class Situacao {
	  public static void main(String[] args) {
	        // Cálculo Aritmético
	        ICalculo calculoAritmetico = new Calculadora();
	        Curso disciplina1 = new Curso(calculoAritmetico);
	        disciplina1.setNomeDisciplina("Eng de software III");
	        disciplina1.setNotas(new double[]{5.0, 7.0, 6.0});
	        disciplina1.calcularMedia();
	        System.out.printf("Disciplina: %s | Média: %.2f | Situação: %s%n", 
	                          disciplina1.getNomeDisciplina(), disciplina1.getMedia(), disciplina1.getSituacao());

	        // Cálculo Geométrico
	        ICalculo calculoGeometrico = new MediaGeometrica();
	        Curso disciplina2 = new Curso (calculoGeometrico);
	        disciplina2.setNomeDisciplina("Programação para mainframe");
	        disciplina2.setNotas(new double[]{8.0, 7.0, 9.0});
	        disciplina2.calcularMedia();
	        System.out.printf("Disciplina: %s | Média: %.2f | Situação: %s%n", 
	                          disciplina2.getNomeDisciplina(), disciplina2.getMedia(), disciplina2.getSituacao());
	    }

}
