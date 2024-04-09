package Modelo;

/**
 * 
 * @author Erick Toledo, Mariana Arellando
 */
public class Colonia {

    private int cve_incr_cp;
    private String cve_codpost;
    private String nombre_colonia;
    private String tipo_asentamiento;
    private String municipio;
    private String estado;
    private String ciudad;
    private String lat;
    private String lon;

    /**
     * Default constructor
     */
    public Colonia() {}

    /**
     * 
     * @param cve_incr_cp
     * @param cve_codpost
     * @param nombre_colonia
     * @param tipo_asentamiento
     * @param municipio
     * @param estado
     * @param ciudad
     * @param lat
     * @param lon 
     */
    public Colonia(int cve_incr_cp, String cve_codpost, String nombre_colonia, String tipo_asentamiento, String municipio, String estado, String ciudad, String lat, String lon) {
        this.cve_incr_cp = cve_incr_cp;
        this.cve_codpost = cve_codpost;
        this.nombre_colonia = nombre_colonia;
        this.tipo_asentamiento = tipo_asentamiento;
        this.municipio = municipio;
        this.estado = estado;
        this.ciudad = ciudad;
        this.lat = lat;
        this.lon = lon;
    }

    public int getCve_incr_cp() {
        return cve_incr_cp;
    }

    public void setCve_incr_cp(int cve_incr_cp) {
        this.cve_incr_cp = cve_incr_cp;
    }

    public String getCve_codpost() {
        return cve_codpost;
    }

    public void setCve_codpost(String cve_codpost) {
        this.cve_codpost = cve_codpost;
    }

    public String getNombre_colonia() {
        return nombre_colonia;
    }

    public void setNombre_colonia(String nombre_colonia) {
        this.nombre_colonia = nombre_colonia;
    }

    public String getTipo_asentamiento() {
        return tipo_asentamiento;
    }

    public void setTipo_asentamiento(String tipo_asentamiento) {
        this.tipo_asentamiento = tipo_asentamiento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

}