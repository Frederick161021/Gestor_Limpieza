package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erick Toledo, Mariana Arellano
 */
public final class Conexion {
    
    private static Conexion instancia;
    private Connection con = null;
    private String base = "limpieza";
    private String url = "jdbc:mysql://localhost:3307/universidad?zeroDateTimeBehavior=convertToNull";
    private String user = "root";
    private String password = "";
    
    private Conexion (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
    public static Conexion getInstancia(){
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    
     public void cerrarConexion() {
        if (con != null) {
            try {
                con.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
