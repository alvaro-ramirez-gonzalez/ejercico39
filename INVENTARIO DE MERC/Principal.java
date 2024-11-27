import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Introduce los datos del Proveedor 1:");
        System.out.print("Nombre: ");
        String nombreProveedor1 = scanner.nextLine();
        System.out.print("NIF: ");
        String nifProveedor1 = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionProveedor1 = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudadProveedor1 = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoProveedor1 = scanner.nextLine();
        System.out.print("Email: ");
        String emailProveedor1 = scanner.nextLine();
        Proveedor proveedor1 = new Proveedor(nombreProveedor1, nifProveedor1, direccionProveedor1, ciudadProveedor1, telefonoProveedor1, emailProveedor1);

       
        System.out.println("Introduce los datos del Proveedor 2:");
        System.out.print("Nombre: ");
        String nombreProveedor2 = scanner.nextLine();
        System.out.print("NIF: ");
        String nifProveedor2 = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionProveedor2 = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudadProveedor2 = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoProveedor2 = scanner.nextLine();
        System.out.print("Email: ");
        String emailProveedor2 = scanner.nextLine();
        Proveedor proveedor2 = new Proveedor(nombreProveedor2, nifProveedor2, direccionProveedor2, ciudadProveedor2, telefonoProveedor2, emailProveedor2);

       
        System.out.println("Introduce los datos del Transportista 1:");
        System.out.print("Nombre: ");
        String nombreTransportista1 = scanner.nextLine();
        System.out.print("NIF: ");
        String nifTransportista1 = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionTransportista1 = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoTransportista1 = scanner.nextLine();
        System.out.print("Email: ");
        String emailTransportista1 = scanner.nextLine();
        Transportista transportista1 = new Transportista(nombreTransportista1, nifTransportista1, direccionTransportista1, telefonoTransportista1, emailTransportista1);

       
        System.out.println("Introduce los datos del Transportista 2:");
        System.out.print("Nombre: ");
        String nombreTransportista2 = scanner.nextLine();
        System.out.print("NIF: ");
        String nifTransportista2 = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionTransportista2 = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoTransportista2 = scanner.nextLine();
        System.out.print("Email: ");
        String emailTransportista2 = scanner.nextLine();
        Transportista transportista2 = new Transportista(nombreTransportista2, nifTransportista2, direccionTransportista2, telefonoTransportista2, emailTransportista2);

        
        System.out.println("Introduce los datos del Artículo 1:");
        System.out.print("Código: ");
        String codigoArticulo1 = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcionArticulo1 = scanner.nextLine();
        System.out.print("Peso: ");
        double pesoArticulo1 = scanner.nextDouble();
        System.out.print("Volumen: ");
        double volumenArticulo1 = scanner.nextDouble();
        System.out.print("Precio: ");
        double precioArticulo1 = scanner.nextDouble();
        System.out.print("Disponible (true/false): ");
        boolean disponibleArticulo1 = scanner.nextBoolean();
        scanner.nextLine();  
        Articulo articulo1 = new Articulo(codigoArticulo1, descripcionArticulo1, pesoArticulo1, volumenArticulo1, precioArticulo1, disponibleArticulo1);

        System.out.println("Introduce los datos del Artículo 2:");
        System.out.print("Código: ");
        String codigoArticulo2 = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcionArticulo2 = scanner.nextLine();
        System.out.print("Peso: ");
        double pesoArticulo2 = scanner.nextDouble();
        System.out.print("Volumen: ");
        double volumenArticulo2 = scanner.nextDouble();
        System.out.print("Precio: ");
        double precioArticulo2 = scanner.nextDouble();
        System.out.print("Disponible (true/false): ");
        boolean disponibleArticulo2 = scanner.nextBoolean();
        scanner.nextLine(); 
        Articulo articulo2 = new Articulo(codigoArticulo2, descripcionArticulo2, pesoArticulo2, volumenArticulo2, precioArticulo2, disponibleArticulo2);

       
        Cliente cliente1 = new Cliente();
        cliente1.setProveedores(new ArrayList<>());
        cliente1.getProveedores().add(proveedor1);
        cliente1.getProveedores().add(proveedor2);
        cliente1.setTransportistas(new ArrayList<>());
        cliente1.getTransportistas().add(transportista1);
        cliente1.getTransportistas().add(transportista2);
        List<Articulo> articulosCliente = new ArrayList<>();
        articulosCliente.add(articulo1);
        articulosCliente.add(articulo2);
        cliente1.setArticulos(articulosCliente);

       
        List<Articulo> articulosEntrada = new ArrayList<>();
        articulosEntrada.add(articulo1);
        EntradaMercancia entrada1 = new EntradaMercancia("ENT001", cliente1, transportista1, articulosEntrada, "2024-11-27");

        Ubicacion ubicacion1 = new Ubicacion("01A01");
        ubicacion1.setOcupada(true);
        ubicacion1.setArticulo(articulo1);
        ubicacion1.setUnidadesVerdaderas(100);
        ubicacion1.setUnidadesReservadas(20);


        System.out.println("Ubicación " + ubicacion1.getIdUbicacion() + " ocupada por: " + ubicacion1.getArticulo().getDescripcion());
        System.out.println("Unidades almacenadas: " + ubicacion1.getUnidadesVerdaderas());
        System.out.println("Unidades reservadas: " + ubicacion1.getUnidadesReservadas());

   
        Destinatario destinatario1 = new Destinatario("DEST001", "Destinatario A", "Calle de la Entrega 123", "911112233");

      
        List<Articulo> articulosPedido = new ArrayList<>();
        articulosPedido.add(articulo1); 

        List<Integer> unidadesPedido = new ArrayList<>();
        unidadesPedido.add(50); 

        Pedido pedido1 = new Pedido("PED001", cliente1, destinatario1, "2024-11-27", articulosPedido, unidadesPedido);

      
        System.out.println("Pedido creado: " + pedido1.getCodigoPedido());
        System.out.println("Cliente: " + pedido1.getCliente().getNombreSocial());
        System.out.println("Destinatario: " + pedido1.getDestinatario().getNombre());
        System.out.println("Fecha de Pedido: " + pedido1.getFechaPedido());
        for (int i = 0; i < pedido1.getArticulos().size(); i++) {
            System.out.println("Artículo: " + pedido1.getArticulos().get(i).getDescripcion() + ", Unidades: " + pedido1.getUnidades().get(i));
        }

  
        System.out.println("\nInformación del Cliente:");
        System.out.println("Nombre del Cliente: " + cliente1.getNombreSocial());
        System.out.println("Categoría: " + cliente1.getCategoria());
        System.out.println("NIF: " + cliente1.getNif());

        System.out.println("\nArtículos del Cliente:");
        for (Articulo articulo : cliente1.getArticulos()) {
            System.out.println("Código: " + articulo.getCodigoArticulo() + ", Descripción: " + articulo.getDescripcion());
        }

        scanner.close();
    }
}
