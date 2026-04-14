package Ej10;

public class Main {

    public static void main(String[] args) {
        
        // 1. Creamos el objeto real en la memoria. Es un Becario con todas las de la ley.
        Becario miBecario = new Becario("Alejandro");

        System.out.println("=== POLIMORFISMO EN ACCIÓN ===\n");

        // 2. Lo tratamos como MOSTRABLE
        // Le ponemos las "gafas" de Mostrable. Java AHORA solo sabe que este objeto tiene el método mostrar().
        Mostrable vistaMostrable = miBecario;
        System.out.println(vistaMostrable.mostrar());
        // vistaMostrable.trabajar(); // ❌ Daría error porque un Mostrable genérico no sabe trabajar.

        System.out.println("\n--------------------------------------------------");

        // 3. Lo tratamos como ESTUDIANTE
        // Le pasamos el mismo objeto, pero ahora con la etiqueta de Estudiante.
        Estudiante vistaEstudiante = miBecario;
        vistaEstudiante.estudiar(); 

        System.out.println("--------------------------------------------------");

        // 4. Lo tratamos como TRABAJADOR
        // Otra variable distinta apuntando al mismo sitio, pero con el rol laboral.
        Trabajador vistaTrabajador = miBecario;
        vistaTrabajador.trabajar();
        
        System.out.println("\n¡Prueba superada! El mismo objeto ha actuado de 3 formas distintas.");
    }
}