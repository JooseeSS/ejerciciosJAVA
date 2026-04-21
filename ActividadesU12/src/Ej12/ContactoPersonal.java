package Ej12;

public class ContactoPersonal extends Contacto {
    private String apodo;

    public ContactoPersonal(String nombre, String telefono, String apodo) {
        super(nombre, telefono);
        this.apodo = apodo;
    }

    
    @Override
    public String getTipo() {
        return "Personal";
    }

   
    @Override
    public String imprimir() {
        return  nombre + " (" + apodo + ") - " + telefono;
    }
}