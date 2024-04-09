package Modelo;
import java.util.*;

/**
 * 
 * @author Erick Toledo, Mariana Arellando
 */
public class Administrador extends Persona {
    
    private int AdministradorId;

    
    /**
     * Default constructor
     */
    public Administrador() {}

    /**
     * 
     * @param AdministradorId 
     */
    public Administrador(int AdministradorId) {
        this.AdministradorId = AdministradorId;
    }
    
    /**
     * @return
     */
    public int getAdministradorId() {
        return this.AdministradorId;
    }

    /**
     * @param value
     */
    public void setAdministradorId(int AdministradorId) {
        this.AdministradorId = AdministradorId;
    }

    /**
     * @param jefeCuadrila 
     * @param nuevoTrabajo
     */
    public void notificarJefeCuadrilla(JefeCuadrilla jefeCuadrila, Trabajo nuevoTrabajo) {
        // TODO implement here
    }

}