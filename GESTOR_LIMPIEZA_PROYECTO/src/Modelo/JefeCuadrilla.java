package Modelo;
import java.util.*;

/**
 * 
 * @author Erick Toledo, Mariana Arellano
 */
public class JefeCuadrilla extends Persona implements Observer {

    private int jefeCuadrillaId;
    private String sector;
    
    /**
     * Default constructor
     */
    public JefeCuadrilla() {}
    
    /**
     * 
     * @param jefeCuadrillaId
     * @param sector 
     */
    public JefeCuadrilla(int jefeCuadrillaId, String sector) {
        this.jefeCuadrillaId = jefeCuadrillaId;
        this.sector = sector;
    }

    public JefeCuadrilla(int jefeCuadrillaId, String sector, String personaId, String nombre, char rol, String apellidoPaterno, String apellidoMaterno, int salario, String nombreUsuario, String contraseña) {
        super(personaId, nombre, rol, apellidoPaterno, apellidoMaterno, salario, nombreUsuario, contraseña);
        this.jefeCuadrillaId = jefeCuadrillaId;
        this.sector = sector;
    }
    
    

    public int getJefeCuadrillaId() {
        return jefeCuadrillaId;
    }

    public void setJefeCuadrillaId(int jefeCuadrillaId) {
        this.jefeCuadrillaId = jefeCuadrillaId;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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