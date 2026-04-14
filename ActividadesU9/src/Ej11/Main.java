package Ej11;



import java.time.LocalDate;
import Ej11.CategoriaProducto;
import Ej11.Producto;
import Ej11.RepositorioMemoria;

public class Main {

    public static void main(String[] args) {
        
     
        RepositorioMemoria<Producto> inventario = new RepositorioMemoria<>();

        System.out.println("=== 📦 INICIANDO SISTEMA DE INVENTARIO ===\n");

     
        System.out.println("-> Añadiendo productos al repositorio...");
        inventario.add(new Producto("P01", "Botiquín Básico", 25.50, CategoriaProducto.PRIMEROS_AUXILIOS, LocalDate.of(2030, 12, 31)));
        inventario.add(new Producto("P02", "Lata de Atún", 2.10, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2028, 5, 15)));
        inventario.add(new Producto("P03", "Manta Térmica", 15.00, CategoriaProducto.ROPA_ABRIGO, LocalDate.now().plusYears(10)));

        

        System.out.println("\n--------------------------------------------------");

        
        System.out.println("\n-> Buscando producto con ID 'P02'...");
        Producto encontrado = inventario.findById("P02");
        
        if (encontrado != null) {
            System.out.println("✅ Producto encontrado en memoria:");
            encontrado.mostrar();
        } else {
            System.out.println("❌ Producto no encontrado.");
        }

        System.out.println("\n--------------------------------------------------");

       
        System.out.println("\n-> Eliminando producto con ID 'P01'...");
        Producto aBorrar = inventario.findById("P01"); 
        
        if (aBorrar != null && inventario.remove(aBorrar)) {
            System.out.println("✅ Producto borrado con éxito.");
        }

       
        System.out.println("\n-> Listado final tras las operaciones:");
        inventario.mostrarListado();
        
        System.out.println("\n📊 Total de elementos actuales en el array: " + inventario.size());
    }
}