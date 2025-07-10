package Connection;

import Backend.Suppliers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SuppliersDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    public Suppliers s;
    ArrayList<Suppliers> list = new ArrayList<>();

    public void suppliersRegister(Suppliers objSup) {
        String sql = "insert into Fornecedor (ID, CNPJ, Nome, Telefone, email, cep, produto) values (?, ?, ?, ?, ?, ?, ?)";

        conn = new ConnectionDAO().connectionBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objSup.getId());
            pstm.setInt(2, objSup.getCnpj());
            pstm.setString(3, objSup.getName());
            pstm.setString(4, objSup.getPhone());
            pstm.setString(5, objSup.getEmail());
            pstm.setString(6, objSup.getCep());
            pstm.setString(7, objSup.getProduct());

            pstm.execute();
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SuppliersDAO Register: " + e);
        }
    }

    public ArrayList<Suppliers> SearchSuppliers() {
        String sql = "select * from Fornecedor";
        conn = new ConnectionDAO().connectionBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Suppliers objSup = new Suppliers(
                        rs.getString("Nome"),
                        rs.getString("produto"),
                        rs.getInt("ID"),
                        rs.getString("Telefone"),
                        rs.getString("email"),
                        rs.getString("cep"),
                        rs.getInt("CNPJ")
                );
                objSup.setCnpj(rs.getInt("CNPJ"));
                objSup.setName(rs.getString("Nome"));
                objSup.setPhone(rs.getString("Telefone"));
                objSup.setEmail(rs.getString("email"));
                objSup.setCep(rs.getString("cep"));
                objSup.setProduct(rs.getString("produto"));

                list.add(objSup);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SearchSuppliers: " + e);
        }
        return list;
    }

    public void suppliersUpdate(Suppliers objSup) {
        String sql = "UPDATE Fornecedor SET CNPJ = ?, Nome = ?, Telefone = ?, email = ?, cep = ?, produto = ? WHERE ID = ?";
        conn = new ConnectionDAO().connectionBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objSup.getCnpj());
            pstm.setString(2, objSup.getName());
            pstm.setString(3, objSup.getPhone());
            pstm.setString(4, objSup.getEmail());
            pstm.setString(5, objSup.getCep());
            pstm.setString(6, objSup.getProduct());
            pstm.setInt(7, objSup.getId());

            pstm.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "SuppliersDAO Atualizar: " + erro);
        }

        String sqlE = "DELETE FROM cliente WHERE ID_cliente = ?";

        try {
            pstm = conn.prepareStatement(sqlE);
            pstm.setInt(1, objSup.getId());
            pstm.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente: " + erro);
        }
    }

}
