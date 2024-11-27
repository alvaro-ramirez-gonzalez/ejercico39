public class Proveedor {
    private String nif;
    private String nombreSocial;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String correoElectronico;

    
    public Proveedor(String nif, String nombreSocial, String direccion, String ciudad, String telefono, String correoElectronico) {
        this.nif = nif;
        this.nombreSocial = nombreSocial;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreSocial() {
        return nombreSocial;
    }

    public void setNombreSocial(String nombreSocial) {
        this.nombreSocial = nombreSocial;
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
}
