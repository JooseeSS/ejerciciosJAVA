package Ej2;

public class Jugador implements Danable{
private int vida;
private String nombre;
public Jugador(int vida, String nombre) {
	super();
	this.vida = vida;
	this.nombre = nombre;
}
@Override
public void recibirDanio(int puntos) {
	this.vida-=puntos;
if(vida<=0) {
	System.out.println("Has muerto");
}
	
}

}
