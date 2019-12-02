/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    public static Connection AbrirConexao() throws ClassNotFoundException{
      Connection con = null;
      try {
          Class.forName("com.mysql.jdbc.Drive");
          String url = "jdbc:mysql://localhost/locadora";
          con = DriverManager.getConnection(url,"root", "123");
     
      } catch (Exception e){
          JOptionPane.showMessageDialog(null, "Erro na conexão com o banco",
             "Video locadora",JOptionPane.ERROR_MESSAGE);
            e.getMessage();
            
      }
       return con;
       }
    public static void FecharConexao(Connection con) {
        try {
            con.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
 

