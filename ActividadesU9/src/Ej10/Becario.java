package Ej10;

public class Becario extends Persona implements Trabajador, Estudiante, Mostrable {

    public Becario(String nombre) {
        super(nombre);
    }

    @Override
    public void trabajar() {
        System.out.println("💼 " + nombre + " está picando código y preparando cafés en la oficina.");
    }

    @Override
    public void estudiar() {
        System.out.println("📚 " + nombre + " está estudiando a tope para los exámenes en el IES Camas.");
    }

    // --- Contrato de Mostrable ---
    @Override
    public String mostrar() {
        return "👤 DATOS DEL BECARIO -> Nombre: " + nombre + " | Roles: Estudiante y Trabajador";
    }
}