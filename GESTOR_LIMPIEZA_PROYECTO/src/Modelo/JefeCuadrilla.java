package Modelo;
import java.util.*;

/**
 * 
 * @author Erick Toledo, Mariana Arellano
 */
public class JefeCuadrilla extends Persona implements Observer {

    private int jefeCuadrillaId;
    
    /**
     * Default constructor
     */
    public JefeCuadrilla() {}
    
    /**
     * 
     * @param jefeCuadrillaId
     */
    public JefeCuadrilla(int jefeCuadrillaId) {
        this.jefeCuadrillaId = jefeCuadrillaId;
    }

    /**
     * 
     * @param jefeCuadrillaId
     * @param personaId
     * @param nombre
     * @param rol
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param nombreUsuario
     * @param contraseña
     * @param telefono
     * @param email 
     */
    public JefeCuadrilla(int jefeCuadrillaId, String personaId, String nombre, char rol, String apellidoPaterno, String apellidoMaterno, String nombreUsuario, String contraseña, long telefono, String email) {
        super(personaId, nombre, rol, apellidoPaterno, apellidoMaterno, nombreUsuario, contraseña, telefono, email);
        this.jefeCuadrillaId = jefeCuadrillaId;
    }
    
    public int getJefeCuadrillaId() {
        return jefeCuadrillaId;
    }

    public void setJefeCuadrillaId(int jefeCuadrillaId) {
        this.jefeCuadrillaId = jefeCuadrillaId;
    }
    
    /**
     * 
     * @param trabajo 
     */
    public void notificarCuadrilla(Actividad Actividad) {
        // TODO implement here
    }

    @Override
    public void update(Actividad actividad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}