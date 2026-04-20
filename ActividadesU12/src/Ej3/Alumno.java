package Ej3;

public class Alumno {
private String nomnbre;
private double nota;
public Alumno(String nomnbre, double nota) {
	super();
	this.nomnbre = nomnbre;
	this.nota = nota;
}
public String getNomnbre() {
	return nomnbre;
}
public void setNomnbre(String nomnbre) {
	this.nomnbre = nomnbre;
}
public double getNota() {
	return nota;
}
public void setNota(double nota) {
	this.nota = nota;
}
@Override
public String toString() {
	return "Alumno [nomnbre=" + nomnbre + ", nota=" + nota + "]";
}

}
