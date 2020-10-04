
package com.snakecorp;

/**
 *
 * @author snake
 */
public class DispositivoEntrada {
    private String tipoDeEntrada;
    private String marca;
    
    public DispositivoEntrada(String tipoEntrada, String marca)
    {
        this.tipoDeEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = this.marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{tipoDeEntrada=").append(tipoDeEntrada);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
}
