import java.util.List;

public class EntradaMercancia {
    private String codigoEntrada;
    private Cliente cliente;
    private Transportista transportista;
    private List<Articulo> articulos;
    private String fechaEntrada;

    public EntradaMercancia(String codigoEntrada, Cliente cliente, Transportista transportista, List<Articulo> articulos, String fechaEntrada) {
        this.codigoEntrada = codigoEntrada;
        this.cliente = cliente;
        this.transportista = transportista;
        this.articulos = articulos;
        this.fechaEntrada = fechaEntrada;
    }

    public String getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(String codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
}
