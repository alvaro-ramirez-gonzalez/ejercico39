import java.util.List;

public class Cliente {
    private String nombreSocial;
    private String nif;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String correoElectronico;
    private String categoria; // Muy bueno, bueno, regular
    private List<Proveedor> proveedores;
    private List<Transportista> transportistas;
    private List<Articulo> articulos;

    public Cliente(String nombreSocial, String nif, String direccion, String ciudad, String telefono, String correoElectronico, String categoria) {
        this.nombreSocial = nombreSocial;
        this.nif = nif;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.categoria = categoria;
    }

    // Métodos getters y setters
    public String getNombreSocial() {
        return nombreSocial;
    }

    public void setNombreSocial(String nombreSocial) {
        this.nombreSocial = nombreSocial;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
}
