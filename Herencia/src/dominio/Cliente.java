
package dominio;

import java.util.Date;

/**
 *
 * @author snake
 */
public class Cliente extends Persona{
    private int idCliente;
    private static int contadorCliente;
    private Date fechaRegistro;
    private boolean vip;

    public Cliente(Date fechaRegistro, boolean vip,String nombre, char genero, int edad, String direcicion) {
        super(nombre,genero,edad,direcicion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++ Cliente.contadorCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
