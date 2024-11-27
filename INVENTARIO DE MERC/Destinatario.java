public class Destinatario {
    private String codigoDestinatario;
    private String nombre;
    private String direccion;
    private String telefono;

    public Destinatario(String codigoDestinatario, String nombre, String direccion, String telefono) {
        this.codigoDestinatario = codigoDestinatario;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCodigoDestinatario() {
        return codigoDestinatario;
    }

    public void setCodigoDestinatario(String codigoDestinatario) {
        this.codigoDestinatario = codigoDestinatario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
