package Ej3;

/**
 * Clase que simula una conexión por Bluetooth.
 */
public class Bluetooth implements Conectable {
    
    // Atributo de estado
    private boolean emparejado;

    // Constructor: empieza sin estar emparejado
    public Bluetooth() {
        this.emparejado = false;
    }

    @Override
    public void conectar() {
        this.emparejado = true;
        System.out.println("🔵 Sincronizando dispositivos... Bluetooth emparejado.");
    }

    @Override
    public void desconectar() {
        this.emparejado = false;
        System.out.println("🔵 Bluetooth desemparejado.");
    }

    @Override
    public boolean estaConectado() {
        return this.emparejado;
    }
}