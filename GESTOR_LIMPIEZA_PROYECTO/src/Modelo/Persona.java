package Modelo;

/**
 * 
 * @author Erick Toledo, Mariana Arellano
 */
public abstract class Persona  {
    
    private String personaId;
    private String nombre;
    private char rol;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombreUsuario;
    private String contraseña;
    private long telefono;
    private String email;

    /**
     * Default constructor
     */
    public Persona() {}

    /**
     * 
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
    public Persona(String personaId, String nombre, char rol, String apellidoPaterno, String apellidoMaterno, String nombreUsuario, String contraseña, long telefono, String email) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.rol = rol;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String getPersonaId() {
        return personaId;
    }

    public void setPersonaId(String personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}