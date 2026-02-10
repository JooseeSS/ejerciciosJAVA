package Ej1;
public class Hora12 extends Hora {
    
    // Atributo nuevo específico para esta clase
    private String periodo; // almacenará "am" o "pm"

    /**
     * Constructor
     * @param hora Valor entre 1 y 12
     * @param minutos Valor entre 0 y 59
     * @param periodo Puede ser "am" o "pm"
     */
    public Hora12(int hora, int minutos, String periodo) {
        super(hora, minutos); // Reutilizamos el constructor de Hora
        this.periodo = periodo;
        this.setHora(hora); 
    }

    public boolean setHoras(int valor) {
        if (valor >= 1 && valor <= 12) {
            this.hora = valor; 
            return true;
        }
        return false;
    }

    
    public void inc() {
        
        minuto++;

        if (minuto == 60) {
            minuto = 0;
            hora++;

            
            if (hora > 12) {
                hora = 1;
            } 
            else if (hora == 12) {
               if (periodo.equals("am")) {
                    periodo = "pm";
                } else {
                    periodo = "am";
                }
            }
        }
    }

    
    @Override
    public String toString() {
        return String.format("%02d:%02d %s", hora, minuto, periodo);
    }
}