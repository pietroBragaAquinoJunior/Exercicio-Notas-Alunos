package entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void Resultado() {
		if(nota1+nota2+nota3 >= 60) {
			System.out.printf("FINAL GRADE = %.2f%n", nota1+nota2+nota3);
			System.out.println("PASS");
		}else {
			System.out.printf("FINAL GRADE = %.2f%n", nota1+nota2+nota3);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60-nota1+nota2+nota3);
		}
	}
	
}
