package Actividades;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
      
           
                Scanner sc = new Scanner(System.in);

                // Entrada
                System.out.print("Introduce la hora (0-23): ");
                int hora = sc.nextInt();
                System.out.print("Introduce los minutos (0-59): ");
                int minutos = sc.nextInt();
                System.out.print("Introduce los segundos (0-59): ");
                int segundos = sc.nextInt();

                // Validación
                if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
                    System.out.println("Hora no válida.");
                } else {
                    // Sumar un segundo
                    segundos++;
                    if (segundos == 60) {
                        segundos = 0;
                        minutos++;
                        if (minutos == 60) {
                            minutos = 0;
                            hora++;
                            if (hora == 24) {
                                hora = 0;
                            }
                        }
                    }

                    // Mostrar resultado con formato
                    System.out.printf("Hora actual +1 segundo: [%02d:%02d:%02d]%n", hora, minutos, segundos);
                }

                sc.close();
            }
        

	}


