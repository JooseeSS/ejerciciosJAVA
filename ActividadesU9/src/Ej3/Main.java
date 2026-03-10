package Ej3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List<Conectable> dispositivos2 =  new ArrayList<>();
		dispositivos2.add(new Wifi());
		dispositivos2.add(new Bluetooth());
		dispositivos2.add(new Cable());
		for (Conectable conectable : dispositivos2) {
			conectable.conectar();
			conectable.estaConectado();
		}
		for (Conectable conectable : dispositivos2) {
			conectable.desconectar();
			conectable.estaConectado();
		}*/
		Wifi miWifi = new Wifi();
		Bluetooth miBluetooth = new Bluetooth();
		Cable miCable = new Cable();
		Conectable[] dispositivos = {miWifi,miBluetooth,miCable};
		
		System.out.println("Conectando dispositivos");
		
		for (int i =0;i<dispositivos.length;i++) {
			dispositivos[i].conectar();
			
			System.out.println("Estado de la conexión: " + dispositivos[i].estaConectado());
            System.out.println("------------------------------------");
		}
System.out.println("Desconectando dispositivos");
		
		for (int i =0;i<dispositivos.length;i++) {
			dispositivos[i].desconectar();
			
			System.out.println("Estado de la conexión: " + dispositivos[i].estaConectado());
            System.out.println("------------------------------------");
		}

	}

}
