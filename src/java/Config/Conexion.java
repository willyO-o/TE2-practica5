
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String url="jdbc:mysql://localhost:3306/bd_almacen";
    String user="root";
    String pass="";
    
    Connection con;
    
    public Connection getConexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }
    
    public void desconect(){
        try {
             con.close();
        } catch (SQLException e) {
            System.out.println("error al cerrar conexion");
        }
    }
}
