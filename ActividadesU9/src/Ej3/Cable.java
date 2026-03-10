package Ej3;

/**
 * Clase que simula una conexión física por Cable de red (Ethernet).
 */
public class Cable implements Conectable {
    
    // Atributo de estado
    private boolean enchufado;

    // Constructor
    public Cable() {
        this.enchufado = false;
    }

    @Override
    public void conectar() {
        this.enchufado = true;
        System.out.println("🔌 Cable de red enchufado al puerto. Enlace establecido.");
    }

    @Override
    public void desconectar() {
        this.enchufado = false;
        System.out.println("🔌 Cable de red desenchufado.");
    }

    @Override
    public boolean estaConectado() {
        return this.enchufado;
    }
}