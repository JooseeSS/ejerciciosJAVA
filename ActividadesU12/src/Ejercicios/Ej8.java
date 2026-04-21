package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej8 {

	public static void main(String[] args) {
		List<ProductoCarrito> miCarrito = new ArrayList<>();
		miCarrito.add(new ProductoCarrito("Carne", 130));
		miCarrito.add(new ProductoCarrito("Manzana", 12));
		miCarrito.add(new ProductoCarrito("Chuches", 1.2));
		miCarrito.add(new ProductoCarrito("Palomitas", 2.8));
		miCarrito.add(new ProductoCarrito("Fairy", 5.2));
		
		double ticket =0;
		for (ProductoCarrito productoCarrito : miCarrito) {
			ticket+=productoCarrito.getPrecio();
		}
		System.out.println("Este es tu carrito de la compra");
		for (ProductoCarrito productoCarrito : miCarrito) {
			System.out.println(productoCarrito.getNombre()+"-"+productoCarrito.getPrecio());;
		}
		System.out.println("Y el total a pagar son " +ticket+"€");
	}

}
