import java.util.List;

public class Pedido {
    private String codigoPedido;
    private Cliente cliente;
    private Destinatario destinatario;
    private String fechaPedido;
    private List<Articulo> articulos;
    private List<Integer> unidades;

    public Pedido(String codigoPedido, Cliente cliente, Destinatario destinatario, String fechaPedido, List<Articulo> articulos, List<Integer> unidades) {
        this.codigoPedido = codigoPedido;
        this.cliente = cliente;
        this.destinatario = destinatario;
        this.fechaPedido = fechaPedido;
        this.articulos = articulos;
        this.unidades = unidades;
    }

    
    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Integer> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<Integer> unidades) {
        this.unidades = unidades;
    }
}
