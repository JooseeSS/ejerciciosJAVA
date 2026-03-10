package Ej3;

/**
 * Clase que simula una conexión inalámbrica por Wifi.
 */
public class Wifi implements Conectable {
    
    // Atributo de estado para saber si la conexión está activa
    private boolean conectado;

    // Constructor: al crearse, el Wifi está apagado por defecto
    public Wifi() {
        this.conectado = false;
    }

    @Override
    public void conectar() {
        this.conectado = true; // Cambiamos el estado
        System.out.println("📡 Buscando red... Wifi conectado correctamente.");
    }

    @Override
    public void desconectar() {
        this.conectado = false; // Cambiamos el estado
        System.out.println("📡 Wifi desconectado de la red.");
    }

    @Override
    public boolean estaConectado() {
        return this.conectado; // Devuelve el estado actual
    }
}