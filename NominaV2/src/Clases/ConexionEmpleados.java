//Conexion A la base de datos de Empleados para poder generar el reporte
//Santiago Martinez Diaz 9959-19-13847
//** FINALIZO EL 23 DE MAYO
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionEmpleados {
    
    private final String base = "empleados";
    private final String user = "root";
    private final String password = "kingcobra123DA";
    private final String url = "jdbc:mysql://localhost/" + base;
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }

}
