package com.snakecorp;

/**
 *
 * @author snake
 */
public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadotRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadotRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
