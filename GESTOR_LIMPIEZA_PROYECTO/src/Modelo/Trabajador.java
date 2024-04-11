package Modelo;
import java.util.*;

/**
 * 
 * @author Erick Toledo, Mariana Arellano
 */
public class Trabajador extends Persona {

    private int trabajadorId;
    private int cuadrillaId;
    
    /**
     * Default constructor
     */
    public Trabajador() {}
    
    /**
     * 
     * @param trabajadorId
     * @param cuadrillaId
     */
    public Trabajador(int trabajadorId, int cuadrillaId) {
        this.trabajadorId = trabajadorId;
        this.cuadrillaId = cuadrillaId;
    }

    /**
     * 
     * @param trabajadorId
     * @param cuadrillaId
     * @param personaId
     * @param nombre
     * @param rol
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param salario
     * @param nombreUsuario
     * @param contraseña 
     */
    public Trabajador(int trabajadorId, int cuadrillaId, String personaId, String nombre, char rol, String apellidoPaterno, String apellidoMaterno, int salario, String nombreUsuario, String contraseña) {
        super(personaId, nombre, rol, apellidoPaterno, apellidoMaterno, salario, nombreUsuario, contraseña);
        this.trabajadorId = trabajadorId;
        this.cuadrillaId = cuadrillaId;
    }

    public int getTrabajadorId() {
        return trabajadorId;
    }

    public void setTrabajadorId(int trabajadorId) {
        this.trabajadorId = trabajadorId;
    }

    public int getCuadrillaId() {
        return cuadrillaId;
    }

    public void setCuadrillaId(int cuadrillaId) {
        this.cuadrillaId = cuadrillaId;
    }
    
}