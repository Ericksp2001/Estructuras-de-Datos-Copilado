
package EstArbol;

public class ClsRecepcion {

    private String TipoEvento;
    private int cedulaCliente;
    private String NombCliente;
    private String Fecha_Evento;
    private String Tipo_decoracion;
    private int Num_invitados;
    private float precio;

    public ClsRecepcion() {
        TipoEvento = null;
        cedulaCliente = 0;
        NombCliente = null;
        Fecha_Evento = null;
        Tipo_decoracion = null;
        Num_invitados = 0;
        precio = 0;
    }

    public ClsRecepcion(String TipoEvento, int cedulaCliente, String NombCliente, String Fecha_Evento, String Tipo_decoracion, int Num_invitados, float precio) {
        this.TipoEvento = TipoEvento;
        this.cedulaCliente = cedulaCliente;
        this.NombCliente = NombCliente;
        this.Fecha_Evento = Fecha_Evento;
        this.Tipo_decoracion = Tipo_decoracion;
        this.Num_invitados = Num_invitados;
        this.precio = precio;
    }

    public String getTipoEvento() {
        return TipoEvento;
    }

    public void setTipoEvento(String TipoEvento) {
        this.TipoEvento = TipoEvento;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombCliente() {
        return NombCliente;
    }

    public void setNombCliente(String NombCliente) {
        this.NombCliente = NombCliente;
    }

    public String getFecha_Evento() {
        return Fecha_Evento;
    }

    public void setFecha_Evento(String Fecha_Evento) {
        this.Fecha_Evento = Fecha_Evento;
    }

    public String getTipo_decoracion() {
        return Tipo_decoracion;
    }

    public void setTipo_decoracion(String Tipo_decoracion) {
        this.Tipo_decoracion = Tipo_decoracion;
    }

    public int getNum_invitados() {
        return Num_invitados;
    }

    public void setNum_invitados(int Num_invitados) {
        this.Num_invitados = Num_invitados;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
