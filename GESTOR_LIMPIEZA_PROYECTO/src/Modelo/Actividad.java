package Modelo;
import java.util.*;

/**
 * 
 */
public class Actividad {

    private int historialActividadId;
    private int cveColonia;
    private int cuadrillaId;
    private String descripcion;
    private String comentarios;
    private String rutaImagen;
    private Date fechaAgendada;
    private String estatus;
    private Colonia colonia;
    private Cuadrilla cuadrilla;

    /**
     * Default constructor
     */
    public Actividad() {}

    /**
     * 
     * @param historialActividadId
     * @param cveColonia
     * @param cuadrillaId
     * @param descripcion
     * @param comentarios
     * @param rutaImagen
     * @param fechaAgendada
     * @param estatus
     * @param colonia
     * @param cuadrilla 
     */
    public Actividad(int historialActividadId, int cveColonia, int cuadrillaId, String descripcion, String comentarios, String rutaImagen, Date fechaAgendada, String estatus, Colonia colonia, Cuadrilla cuadrilla) {
        this.historialActividadId = historialActividadId;
        this.cveColonia = cveColonia;
        this.cuadrillaId = cuadrillaId;
        this.descripcion = descripcion;
        this.comentarios = comentarios;
        this.rutaImagen = rutaImagen;
        this.fechaAgendada = fechaAgendada;
        this.estatus = estatus;
        this.colonia = colonia;
        this.cuadrilla = cuadrilla;
    }

    public int getHistorialActividadId() {
        return historialActividadId;
    }

    public void setHistorialActividadId(int historialActividadId) {
        this.historialActividadId = historialActividadId;
    }

    public int getCveColonia() {
        return cveColonia;
    }

    public void setCveColonia(int cveColonia) {
        this.cveColonia = cveColonia;
    }

    public int getCuadrillaId() {
        return cuadrillaId;
    }

    public void setCuadrillaId(int cuadrillaId) {
        this.cuadrillaId = cuadrillaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Date getFechaAgendada() {
        return fechaAgendada;
    }

    public void setFechaAgendada(Date fechaAgendada) {
        this.fechaAgendada = fechaAgendada;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Colonia getColonia() {
        return colonia;
    }

    public void setColonia(Colonia colonia) {
        this.colonia = colonia;
    }

    public Cuadrilla getCuadrilla() {
        return cuadrilla;
    }

    public void setCuadrilla(Cuadrilla cuadrilla) {
        this.cuadrilla = cuadrilla;
    }

    
}