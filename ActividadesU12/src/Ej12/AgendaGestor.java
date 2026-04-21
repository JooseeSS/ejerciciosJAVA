package Ej12;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AgendaGestor {
    public static void main(String[] args) {
       
        List<Contacto> listaPrincipal = new ArrayList<>();
        Set<Contacto> controlDuplicados = new HashSet<>();

        System.out.println("--- 1. AÑADIENDO CONTACTOS ---");
     
        Contacto c1 = new ContactoPersonal("Pepe", "600111222", "Pepito");
        Contacto c2 = new ContactoProfesional("Ana", "600333444", "Tech S.L.");
        Contacto c3 = new ContactoPersonal("Juan", "600555666", "Juancho");
        Contacto c4 = new ContactoPersonal("Pepe", "600111222", "Pepito"); 

      
        Contacto[] nuevos = {c1, c2, c3, c4};
        for (Contacto c : nuevos) {
            if (controlDuplicados.add(c)) {
                listaPrincipal.add(c); 
                System.out.println(" Añadido: " + c.getNombre());
            } else {
                System.out.println("Rechazado (Duplicado): " + c.getNombre());
            }
        }

        System.out.println("\n--- 2. MOSTRAR TODOS  ---");
        for (Contacto c : listaPrincipal) {
           
            System.out.println(c.imprimir() + " -> Tipo: " + c.getTipo());
        }

        System.out.println("\n--- 3. ORDENACIÓN ---");
        
       // Collections.sort(listaPrincipal);
        listaPrincipal.sort(Comparator.comparing(Contacto::getNombre));
        System.out.println("Ordenado por Nombre ): " + listaPrincipal.get(0).getNombre() + " va primero.");

      
        listaPrincipal.sort(Comparator.comparing(Contacto::getTelefono));
        System.out.println("Ordenado por Teléfono (Comparator): " + listaPrincipal.get(0).getNombre() + " va primero.");

        System.out.println("\n--- 4. BORRAR CON ITERATOR ---");
        Iterator<Contacto> it = listaPrincipal.iterator();
        while (it.hasNext()) {
            Contacto actual = it.next();
            if (actual.getNombre().equals("Ana")) {
                it.remove();
                System.out.println("Ana ha sido eliminada de la agenda.");
            }
        }
    }
}
