package Connection;

import Backend.Suppliers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SuppliersDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    public Suppliers s;

    public void suppliersRegister(Suppliers objSup) {
        String sql = "insert into Fornecedor (CNPJ, Nome, Telefone, email, cep, produto) values (?, ?, ?, ?, ?, ?)";

        conn = new ConnectionDAO().connectionBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objSup.getCnpj());
            pstm.setString(2, objSup.getName());
            pstm.setString(3, objSup.getPhone());
            pstm.setString(4, objSup.getEmail());
            pstm.setString(5, objSup.getCep());
            pstm.setString(6, objSup.getProduct());
            
            pstm.execute();
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SuppliersDAO Register: " + e);
        }
    }
    
    public ResultSet<Suppliers> SearchSuppliers(){
        String sql = "select * from Fornecedor";
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Suppliers objSup = new Suppliers();
                objSup.setCnpj(rs.getInt("CNPJ"));
                objSup.setName(rs.getString("Nome"));
                objSup.setPhone(rs.getString("Telefone"));
                objSup.setEmail(rs.getString("email"));
                objSup.setCep(rs.getString("cep"));
                objSup.setProduct(rs.getString("produto"));
                
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SearchSuppliers: " + e);
        }
    }
}
