package Ej12;

public class ContactoProfesional extends Contacto {
    private String empresa;

    public ContactoProfesional(String nombre, String telefono, String empresa) {
        super(nombre, telefono);
        this.empresa = empresa;
    }

    @Override
    public String getTipo() {
        return "Profesional";
    }

    @Override
    public String imprimir() {
        return nombre + " [" + empresa + "] - " + telefono;
    }
}