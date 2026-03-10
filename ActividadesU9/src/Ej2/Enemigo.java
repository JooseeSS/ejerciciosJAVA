package Ej2;

public class Enemigo implements Danable{
private int vida;
private String tipo;
public Enemigo(int vida, String tipo) {
	super();
	this.vida = vida;
	this.tipo = tipo;
}
@Override
public void recibirDanio(int puntos) {
	this.vida-=puntos;
if(vida<=0) {
	System.out.println("Enemigo derrotado");
}
}

}
