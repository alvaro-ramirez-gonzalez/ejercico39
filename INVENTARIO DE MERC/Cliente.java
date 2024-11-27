import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nif;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String categoria;
    private List<Proveedor> proveedores;
    private List<Transportista> transportistas;
    private List<Articulo> articulos;
    private String nombreSocial;  
   
    public Cliente(String nif, String nombre, String direccion, String telefono, String correoElectronico, String categoria, List<Proveedor> proveedores, List<Transportista> transportistas) {
        if (nif == null || nif.isEmpty()) {
            throw new IllegalArgumentException("El NIF no puede estar vacío.");
        }
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.categoria = categoria;
        this.proveedores = proveedores != null ? proveedores : new ArrayList<>();
        this.transportistas = transportistas != null ? transportistas : new ArrayList<>();
        this.articulos = new ArrayList<>();
        this.nombreSocial = nombre; 
    }

    
    public Cliente() {
        this.proveedores = new ArrayList<>();
        this.transportistas = new ArrayList<>();
        this.articulos = new ArrayList<>();
    }

    public String getNombreSocial() {
        return nombreSocial;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public List<Transportista> getTransportistas() {
        return transportistas;
    }

    public void setTransportistas(List<Transportista> transportistas) {
        this.transportistas = transportistas;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nombreSocial='" + nombreSocial + '\'' +
                '}';
    }
}
