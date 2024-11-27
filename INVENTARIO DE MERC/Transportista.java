import java.util.List;

public class Transportista {
    private String nombre;
    private String nif;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private List<EntradaMercancia> entradas;

    public Transportista(String nombre, String nif, String direccion, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.nif = nif;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<EntradaMercancia> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<EntradaMercancia> entradas) {
        this.entradas = entradas;
    }
}
