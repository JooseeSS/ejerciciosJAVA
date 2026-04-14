package Ej13;

import java.io.*;
import java.util.*;

public class Principal {

    private static final String ARCHIVO = "agenda.txt";
    private static final int MAX_CONTACTOS = 20;
    
    private static Contacto[] agenda = new Contacto[MAX_CONTACTOS];
    private static int numContactos = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        cargarAgenda();

        do {
            System.out.println("\n===  AGENDA: PAQUETE EJ13 ===");
            System.out.println("1. Nuevo contacto");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Mostrar todos (Ordenados)");
            System.out.println("4. Salir y Guardar");
            System.out.print("Elige una opción: ");
            
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1 -> nuevoContacto(sc);
                case 2 -> buscarContacto(sc);
                case 3 -> mostrarTodos();
                case 4 -> {
                    guardarAgenda();
                    System.out.println("Datos guardados. Cerrando...");
                }
                default -> System.out.println(" Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }

    private static void cargarAgenda() {
        File fichero = new File(ARCHIVO);
        if (!fichero.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = reader.readLine()) != null && numContactos < MAX_CONTACTOS) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    agenda[numContactos++] = new Contacto(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            System.out.println(" Error al cargar.");
        }
    }

    private static void guardarAgenda() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (int i = 0; i < numContactos; i++) {
                writer.write(agenda[i].aFormatoFichero());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(" Error al guardar.");
        }
    }

    private static void nuevoContacto(Scanner sc) {
        if (numContactos >= MAX_CONTACTOS) {
            System.out.println("Agenda llena.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();

        for (int i = 0; i < numContactos; i++) {
            if (agenda[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ya existe.");
                return;
            }
        }

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine().trim();
        agenda[numContactos++] = new Contacto(nombre, telefono);
        System.out.println("✅ Añadido.");
    }

    private static void buscarContacto(Scanner sc) {
        System.out.print("Buscar: ");
        String busqueda = sc.nextLine().trim().toLowerCase();
        boolean encontrado = false;

        for (int i = 0; i < numContactos; i++) {
            if (agenda[i].getNombre().toLowerCase().contains(busqueda)) {
                System.out.println(agenda[i]);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No hay coincidencias.");
    }

    private static void mostrarTodos() {
        if (numContactos == 0) {
            System.out.println("Vacía.");
            return;
        }
        Contacto[] copia = Arrays.copyOf(agenda, numContactos);
        Arrays.sort(copia);
        for (Contacto c : copia) System.out.println(c);
    }
}