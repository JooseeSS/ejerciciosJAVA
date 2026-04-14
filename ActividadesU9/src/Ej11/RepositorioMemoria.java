package Ej11;

import java.util.Arrays;
import Ej11.Identificable;
import Ej11.Mostrable;
import Ej11.Repositorio;

public class RepositorioMemoria<T extends Identificable> implements Repositorio<T> {
    
    private T[] datos;
    private int contador;

    
    @SuppressWarnings("unchecked") 
    public RepositorioMemoria() {
        
        this.datos = (T[]) new Identificable[10];
        this.contador = 0;
    }

    @Override
    public void add(T item) {
        
        if (contador == datos.length) {
            ampliarArray();
        }
      
        datos[contador] = item;
        contador++;
    }

    @Override
    public boolean remove(T item) {
        for (int i = 0; i < contador; i++) {
            if (datos[i].getId().equals(item.getId())) {
                
                
                for (int j = i; j < contador - 1; j++) {
                    datos[j] = datos[j + 1];
                }
                
              
                datos[contador - 1] = null;
                contador--;
                return true; 
            }
        }
        return false; 
    }

    @Override
    public T findById(String id) {
        for (int i = 0; i < contador; i++) {
            if (datos[i].getId().equals(id)) {
                return datos[i];
            }
        }
        return null; 
    }

    @Override
    public int size() {
        return contador; 
    }

    
    public void mostrarListado() {
        System.out.println("--- LISTADO DEL REPOSITORIO ---");
        for (int i = 0; i < contador; i++) {
            
            if (datos[i] instanceof Mostrable) {
                ((Mostrable) datos[i]).mostrar();
            } else {
                System.out.println(datos[i].toString());
            }
        }
        System.out.println("-------------------------------");
    }

   
    private void ampliarArray() {
        System.out.println("🔄 [Sistema] Ampliando capacidad del repositorio...");
        
        datos = Arrays.copyOf(datos, datos.length * 2);
    }
}