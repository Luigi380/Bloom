package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionDAO {
    
    public Connection connectionBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/banco_dados_bloom?user=root&password=serra";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConnectonDAO" + e.getMessage());
        }
        return conn;
    }
    
}
