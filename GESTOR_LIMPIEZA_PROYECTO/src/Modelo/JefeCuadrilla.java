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

    public JefeCuadrilla(int jefeCuadrillaId, String personaId, String nombre, char rol, String apellidoPaterno, String apellidoMaterno, String nombreUsuario, String contraseña) {
        super(personaId, nombre, rol, apellidoPaterno, apellidoMaterno, nombreUsuario, contraseña);
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
    public void notificarCuadrilla(Trabajo trabajo) {
        // TODO implement here
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}