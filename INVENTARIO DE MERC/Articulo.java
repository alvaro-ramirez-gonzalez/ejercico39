

    public class Articulo {
        private String codigoArticulo;
        private String descripcion;
        private double alto;
        private double ancho;
        private double precio;
        private boolean asegurado;
    
       
        public Articulo(String codigoArticulo, String descripcion, double alto, double ancho, double precio, boolean asegurado) {
            this.codigoArticulo = codigoArticulo;
            this.descripcion = descripcion;
            this.alto = alto;
            this.ancho = ancho;
            this.precio = precio;
            this.asegurado = asegurado;
        }
    
   
        public String getCodigoArticulo() {
            return codigoArticulo;
        }
    
        public void setCodigoArticulo(String codigoArticulo) {
            this.codigoArticulo = codigoArticulo;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public double getAlto() {
            return alto;
        }
    
        public void setAlto(double alto) {
            this.alto = alto;
        }
    
        public double getAncho() {
            return ancho;
        }
    
        public void setAncho(double ancho) {
            this.ancho = ancho;
        }
    
        public double getPrecio() {
            return precio;
        }
    
        public void setPrecio(double precio) {
            this.precio = precio;
        }
    
        public boolean isAsegurado() {
            return asegurado;
        }
    
        public void setAsegurado(boolean asegurado) {
            this.asegurado = asegurado;
        }
    }

    
  