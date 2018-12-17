
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alex
 */
public class Conexion {
    Connection  con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_jpa","root","admin");
        } catch (Exception e) {
            System.err.println("error: "+e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
