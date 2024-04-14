package Modelo;

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
     * 
     * @param AdministradorId
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
    public Administrador(int AdministradorId, String personaId, String nombre, char rol, String apellidoPaterno, String apellidoMaterno, String nombreUsuario, String contraseña, long telefono, String email) {
        super(personaId, nombre, rol, apellidoPaterno, apellidoMaterno, nombreUsuario, contraseña, telefono, email);
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