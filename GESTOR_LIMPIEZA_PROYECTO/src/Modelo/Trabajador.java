package Modelo;

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
     * @param nombreUsuario
     * @param contraseña
     * @param telefono
     * @param email 
     */
    public Trabajador(int trabajadorId, int cuadrillaId, String personaId, String nombre, char rol, String apellidoPaterno, String apellidoMaterno, String nombreUsuario, String contraseña, long telefono, String email) {
        super(personaId, nombre, rol, apellidoPaterno, apellidoMaterno, nombreUsuario, contraseña, telefono, email);
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