package Ej7;

import java.util.Comparator;


public class ComparadorCodigoAZ implements Comparator<Producto> {

    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.getCodigo().compareToIgnoreCase(p2.getCodigo());
    }
}