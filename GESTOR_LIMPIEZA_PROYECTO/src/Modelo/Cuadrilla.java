package Modelo;
import java.util.*;

/**
 * 
 * @author Erick Toledo, Mariana Arellano
 */
public class Cuadrilla implements Observer {

    private int cuadrillaId;
    private int jefeCuadrillaId;
    private String nombre;
    public String estado;
    private ArrayList<Trabajador> trabajadores;
    private JefeCuadrilla jefeCuadrilla;
    private ArrayList<Actividad> actividades;
    
    /**
     * Default constructor
     */
    public Cuadrilla() {
    }

    public Cuadrilla(int cuadrillaId, int jefeCuadrillaId, String nombre, String estado) {
        this.cuadrillaId = cuadrillaId;
        this.jefeCuadrillaId = jefeCuadrillaId;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Cuadrilla(int cuadrillaId, int jefeCuadrillaId, String nombre, String estado, ArrayList<Trabajador> trabajadores, JefeCuadrilla jefeCuadrilla, ArrayList<Actividad> trabajos) {
        this.cuadrillaId = cuadrillaId;
        this.jefeCuadrillaId = jefeCuadrillaId;
        this.nombre = nombre;
        this.estado = estado;
        this.trabajadores = trabajadores;
        this.jefeCuadrilla = jefeCuadrilla;
        this.actividades = trabajos;
    }
    
    

    public int getCuadrillaId() {
        return cuadrillaId;
    }

    public void setCuadrillaId(int cuadrillaId) {
        this.cuadrillaId = cuadrillaId;
    }

    public int getJefeCuadrillaId() {
        return jefeCuadrillaId;
    }

    public void setJefeCuadrillaId(int jefeCuadrillaId) {
        this.jefeCuadrillaId = jefeCuadrillaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    /**
     * 
     * @return 
     */
    public JefeCuadrilla getJefeCuadrilla() {
        return jefeCuadrilla;
    }
    
    /**
     * 
     * @param jefeCuadrilla 
     */
    public void setJefeCuadrilla(JefeCuadrilla jefeCuadrilla) {
        this.jefeCuadrilla = jefeCuadrilla;
    }

    /**
     * @param trabajador
     */
    public void agregarTrabajador(Trabajador trabajador) {
        // TODO implement here
    }

    /**
     * @param Trabajador
     */
    public void eliminarTrabajador(Trabajador Trabajador) {
        // TODO implement here
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    public void agregarActividad(Actividad actividad){
        //TODO implenment here
    }

    public void update(Actividad actividad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}