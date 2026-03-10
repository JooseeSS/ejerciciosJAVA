package Ej8;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Validable> elementos = new ArrayList();
		elementos.add(new Usuario("holahola@gmail.com", "121212121212"));
		elementos.add(new Usuario("holaholagmail.com", "121212121212"));
		elementos.add(new Usuario("holahola@gmail.com", "12"));
		elementos.add(new Usuario("holaholagmail.com", "1"));
		elementos.add(new Reserva ("12/12/2028", 7));
		elementos.add(new Reserva ("12/12/2028", 0));
		elementos.add(new Reserva ("     12/12/2028   ", 21));
		elementos.add(new Reserva ("12/12/2028", -7));

		System.out.println("=== INICIANDO VALIDACIÓN DEL SISTEMA ===\n");
		int contador=1;
		for (Validable validable : elementos) {
			System.out.println("Analizando elemento " + contador + "...");
            contador++;
            try {
                validable.validar(); 
                System.out.println(" ESTADO: Datos correctos.Esta es su informacón:");
                
                
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR CAPTURADO: " + e.getMessage());
            }
            
		}





	}

}
