//Conexion A la base de datos de Nomina para poder generar el reporte
//Santiago Martinez Diaz 9959-19-13847
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionNomina {
    
    private final String base = "nominae";
    private final String user = "root";
    private final String password = "";
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
