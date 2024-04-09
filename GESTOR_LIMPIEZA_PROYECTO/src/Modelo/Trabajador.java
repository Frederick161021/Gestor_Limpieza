package Modelo;
import java.util.*;

/**
 * 
 * @author Erick Toledo, Mariana Arellano
 */
public class Trabajador extends Persona {

    private int trabajadorId;
    private int cuadrillaId;
    private String especialidad;
    
    /**
     * Default constructor
     */
    public Trabajador() {}
    
    /**
     * 
     * @param trabajadorId
     * @param cuadrillaId
     * @param especialidad 
     */
    public Trabajador(int trabajadorId, int cuadrillaId, String especialidad) {
        this.trabajadorId = trabajadorId;
        this.cuadrillaId = cuadrillaId;
        this.especialidad = especialidad;
    }

    /**
     * 
     * @param trabajadorId
     * @param cuadrillaId
     * @param especialidad
     * @param personaId
     * @param nombre
     * @param rol
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param salario
     * @param nombreUsuario
     * @param contraseña 
     */
    public Trabajador(int trabajadorId, int cuadrillaId, String especialidad, String personaId, String nombre, char rol, String apellidoPaterno, String apellidoMaterno, int salario, String nombreUsuario, String contraseña) {
        super(personaId, nombre, rol, apellidoPaterno, apellidoMaterno, salario, nombreUsuario, contraseña);
        this.trabajadorId = trabajadorId;
        this.cuadrillaId = cuadrillaId;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}