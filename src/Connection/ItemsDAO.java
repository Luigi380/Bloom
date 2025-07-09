package Connection;

import Backend.Items;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ItemsDAO {
    
    Connection conn;
    PreparedStatement pstm;
    public Items item;
    
    public void ItemRegister(Items objItem){
        String sql = "insert into Produto (Nome, ID_Produto, Quantidade, valor, categoria) values (?, ?, ?, ?, ?)";

        conn = new ConnectionDAO().connectionBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objItem.getName());
            pstm.setInt(2, objItem.getId());
            pstm.setInt(3, objItem.getAmount());
            pstm.setDouble(4, objItem.getVal());
            pstm.setString(5, objItem.getProduct());
            
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ItemRegisterDAO" + e);
        }
    }
}
