public class Ubicacion {
    private String idUbicacion;  // e.g. "01A01"
    private boolean ocupada;
    private Articulo articulo;
    private int unidadesVerdaderas;
    private int unidadesReservadas;
    private String fechaUltimaModificacion;
    private String fechaCierre;

    public Ubicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
        this.ocupada = false;
        this.articulo = null;
        this.unidadesVerdaderas = 0;
        this.unidadesReservadas = 0;
    }

    
    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getUnidadesVerdaderas() {
        return unidadesVerdaderas;
    }

    public void setUnidadesVerdaderas(int unidadesVerdaderas) {
        this.unidadesVerdaderas = unidadesVerdaderas;
    }

    public int getUnidadesReservadas() {
        return unidadesReservadas;
    }

    public void setUnidadesReservadas(int unidadesReservadas) {
        this.unidadesReservadas = unidadesReservadas;
    }

    public String getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(String fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }
}
